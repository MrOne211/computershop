package com.hbgs.computershop.service;

import com.hbgs.computershop.dao.OrderitemMapper;
import com.hbgs.computershop.domain.SearchParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderItemService {
    @Autowired
    private OrderitemMapper mapper;

    public Integer selectCount(SearchParam searchParam) {
        return this.mapper.selectCount(searchParam);
    }
    public Double selectMoney(SearchParam searchParam){
        return this.mapper.selectMoney(searchParam);
    }

    public Integer selectCountCount(SearchParam searchParam) {
        return this.mapper.selectCountCount(searchParam);
    }

    public Double selectMoneyCount(SearchParam searchParam) {
        return this.mapper.selectMoneyCount(searchParam);
    }

    public Double selectPieData(SearchParam searchParam) {
        return this.mapper.selectPieData(searchParam);
    }
}
