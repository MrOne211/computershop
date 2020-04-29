package com.hbgs.computershop.dao;

import com.hbgs.computershop.domain.ExcelData;
import com.hbgs.computershop.domain.Order;
import com.hbgs.computershop.domain.SearchParam;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component("orderMapper")
public interface OrderMapper {
    void saveOrder(Order order);

    List<Order> list(SearchParam searchParam);

    int selectCount(SearchParam searchParam);

    int delete(String oid);

    List<ExcelData> listExcel(SearchParam searchParam);
}
