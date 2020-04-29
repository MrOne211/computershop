package com.hbgs.computershop.dao;

import com.hbgs.computershop.domain.Orderitem;
import com.hbgs.computershop.domain.SearchParam;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component("oreritemMapper")
public interface OrderitemMapper {
    void saveItem(Orderitem orderitem);

    int delete(String oid);

    Integer selectCount(SearchParam searchParam);

    Double selectMoney(SearchParam searchParam);

    Integer selectCountCount(SearchParam searchParam);

    Double selectMoneyCount(SearchParam searchParam);

    Double selectPieData(SearchParam searchParam);
}
