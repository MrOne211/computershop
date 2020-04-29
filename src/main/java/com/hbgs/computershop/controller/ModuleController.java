package com.hbgs.computershop.controller;


import com.hbgs.computershop.domain.Module;
import com.hbgs.computershop.service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/Module")
public class ModuleController {
    @Autowired
    private ModuleService service;
    @RequestMapping("/list")
    @ResponseBody
    public Map<String,Object> list(){
        Map<String,Object> map = new HashMap<>();
        List<Module> list = this.service.list();
        map.put("list",list);
        return map;
    }
}
