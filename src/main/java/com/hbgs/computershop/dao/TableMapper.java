package com.hbgs.computershop.dao;

import com.hbgs.computershop.domain.SearchParam;
import com.hbgs.computershop.domain.Table;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component("tableMapper")
public interface TableMapper {
    List<Table> getList(SearchParam searchParam);

    Table findTableByTableName(String tableName);

    int addTable(String typeName);

    Table findTableById(int id);

    int update(Table resTable);

    List<Table> list();

    int delete(int id);
}
