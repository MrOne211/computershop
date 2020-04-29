package com.hbgs.computershop.dao;

import com.hbgs.computershop.domain.SearchParam;
import com.hbgs.computershop.domain.VipLevel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component("vipLevelMapper")
public interface VipLevelMapper {
    List<VipLevel> list(SearchParam searchParam);

    VipLevel findById(Integer id);

    Double findDiscountMax(double discountNum);

    Double findDiscountMin(double discountNum);

    Double findMinMin(double minNum);

    Double findMinMax(double minNum);

    Double findMaxMin(double maxNum);

    Double findMaxMax(double maxNum);

    int update(VipLevel vipLevel);

    Double checkDiscountMax();

    VipLevel checkDiscountMin();

    Double checkMinMin();

    VipLevel checkMinMax();

    VipLevel checkMaxMax();

    int addVipLevel(VipLevel vipLevel);

    int delete(int id);

    VipLevel findByName(String levelName);
}
