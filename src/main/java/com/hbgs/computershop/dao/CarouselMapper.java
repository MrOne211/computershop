package com.hbgs.computershop.dao;

import com.hbgs.computershop.domain.Carousel;
import com.hbgs.computershop.domain.SearchParam;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;


@Mapper
@Component("carouselMapper")
public interface CarouselMapper {
    List<Carousel> list(SearchParam searchParam);

    void updateIsShow(SearchParam searchParam);

    void show(SearchParam searchParam);

    void hidden(SearchParam searchParam);

    int addCarousel(Carousel carousel);

    List<String> search();

    Carousel findById(int id);

    int update(Carousel carousel);

    List<Carousel> findSrc(String s);

    int delete(SearchParam searchParam);
}
