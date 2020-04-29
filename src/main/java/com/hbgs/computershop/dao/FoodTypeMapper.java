package com.hbgs.computershop.dao;

import com.hbgs.computershop.domain.FoodType;
import com.hbgs.computershop.domain.SearchParam;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component("foodTypeMapper")
public interface FoodTypeMapper {
    List<FoodType> getList(SearchParam searchParam);

    FoodType findTypeByTypeName(String typeName);

    int addType(String typeName);

    FoodType findFoodTypeById(int id);

    int update(FoodType resType);

    int delete(int id);

    List<FoodType> list();
}
