package com.shencangblue.iwps.dao;

import com.shencangblue.iwps.entity.SwimmingPool;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SwimmingPoolDao {

    SwimmingPool queryById(long id);
    List<SwimmingPool> queryAll(@Param("offset") int offset, @Param("limit") int limit);
    int addSwimmingPool(SwimmingPool swimmingPool);
    int updateSwimmingPool(SwimmingPool swimmingPool);
    int deleteSwimmingPool(long id);

}
