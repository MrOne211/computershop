package com.hbgs.computershop.service;

import com.hbgs.computershop.dao.FoodTypeMapper;
import com.hbgs.computershop.domain.FoodType;
import com.hbgs.computershop.domain.SearchParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodTypeService {
    @Autowired
    private FoodTypeMapper mapper;
    public List<FoodType> getList(SearchParam searchParam) {
        return this.mapper.getList(searchParam);
    }

    public FoodType findTypeByTypeName(String typeName) {
        return this.mapper.findTypeByTypeName(typeName);
    }

    public boolean addType(String typeName) {
        int i = this.mapper.addType(typeName);
        return i!=0;
    }

    public FoodType findFoodTypeById(int id) {
        return this.mapper.findFoodTypeById(id);
    }

    public boolean update(FoodType resType) {
        int i = this.mapper.update(resType);
        return i!=0;
    }

    public boolean delete(int id) {
        int i = this.mapper.delete(id);
        return i!=0;
    }

    public List<FoodType> list() {
        return this.mapper.list();
    }
}
