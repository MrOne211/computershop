package com.hbgs.computershop.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hbgs.computershop.domain.Carousel;
import com.hbgs.computershop.domain.SearchParam;
import com.hbgs.computershop.service.CarouselService;
import com.hbgs.computershop.util.FileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/Carousel")
public class CarouselController {
    @Autowired
    private CarouselService service;
    public static String urlCarousel = "D:/gitfile/computerShopweb/IntelligentOrderingSystem/static/images/carousel";
    public static String dbUrlCarousel = "/static/images/carousel/";
    @RequestMapping("/list")
    @ResponseBody
    public Map<String,Object> list(@RequestBody Map<String,Object> map){
        Map<String,Object> resMap = new HashMap<>();
        SearchParam searchParam = new SearchParam(map);
        PageHelper.startPage(searchParam.getStart(),searchParam.getPageSize());
        List<Carousel> list =  this.service.list(searchParam);
        PageInfo<Carousel> pageInfo = new PageInfo<>(list);
        resMap.put("page",pageInfo);
        return resMap;
    }
    @RequestMapping("/updateIsShow")
    @ResponseBody
    public void updateIsShow(@RequestBody Map<String,Object> map){
        SearchParam searchParam = new SearchParam();
        searchParam.setId((int) map.get("id"));
        searchParam.setEvent((int) map.get("event"));
        this.service.updateIsShow(searchParam);
    }
    @RequestMapping("/show")
    @ResponseBody
    public void show(@RequestBody Map<String,Object> map){
        SearchParam searchParam = new SearchParam();
        searchParam.setId((int) map.get("id"));
        this.service.show(searchParam);
    }
    @RequestMapping("/hidden")
    @ResponseBody
    public void hidden(@RequestBody Map<String,Object> map){
        SearchParam searchParam = new SearchParam();
        searchParam.setId((int) map.get("id"));
        this.service.hidden(searchParam);
    }
    @RequestMapping("/upload")
    @ResponseBody
    public boolean upload(@RequestParam("file") MultipartFile file, Carousel carousel) throws IOException {
        String fileName = FileUtil.saveFile(file, urlCarousel);
        carousel.setPath(dbUrlCarousel+fileName);
        return this.service.addCarousel(carousel);
    }
    @RequestMapping("/update")
    @ResponseBody
    public boolean update(@RequestParam("updateFile") MultipartFile file,Carousel carousel) throws IOException {
        Carousel cr = this.service.findById(carousel.getId());
        String[] pt = cr.getPath().split("/");
        File dir = new File(urlCarousel);
        String fileName = pt[pt.length-1];
        if (!cr.getPath().equals(dbUrlCarousel+file.getOriginalFilename())){
            fileName = FileUtil.saveFile(file, urlCarousel);
        }
        carousel.setPath(dbUrlCarousel+fileName);
        boolean b = this.service.update(carousel);
        List<Carousel> list = this.service.findSrc(cr.getPath());
        if (list==null||list.size()==0){
            FileUtil.deleteFile(dir,pt[pt.length-1]);
        }
        return b;
    }
    @RequestMapping("/delete")
    @ResponseBody
    public boolean delete(@RequestBody Map<String,Object> map){
        SearchParam searchParam = new SearchParam();
        searchParam.setId((int) map.get("id"));
        Carousel cr = this.service.findById((int) map.get("id"));
        String[] pt = cr.getPath().split("/");
        File dir = new File(urlCarousel);
        List<Carousel> list = this.service.findSrc(cr.getPath());
        if (list!=null&&list.size()==1){
            FileUtil.deleteFile(dir,pt[pt.length-1]);
        }
        return this.service.delete(searchParam);
    }
    @RequestMapping("/search")
    @ResponseBody
    public List<String> search() {
        return this.service.search();
    }
}
