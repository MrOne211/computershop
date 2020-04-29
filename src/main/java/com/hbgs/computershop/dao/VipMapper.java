package com.hbgs.computershop.dao;

import com.hbgs.computershop.domain.SearchParam;
import com.hbgs.computershop.domain.Vip;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component("vipMapper")
public interface VipMapper {
    int addVip(Vip vip);

    Vip findByPhone(String phone);

    int recharge(Vip v);

    List<Vip> list(SearchParam searchParam);

    void updateState(SearchParam searchParam);

    int delete(Integer id);

    void updateMoney(Vip byPhone);
}
