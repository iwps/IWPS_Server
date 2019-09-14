package com.shencangblue.iwps.service;

import com.shencangblue.iwps.entity.SwimmingPool;

import java.util.List;

public interface SwimmingPoolService {
    SwimmingPool getById(long swimmingPool);
    List<SwimmingPool> getList(int start, int pageNum);
    int addSwimmingPool(SwimmingPool swimmingPool);
    int updateSwimmingPool(SwimmingPool swimmingPool);
    int deleteSwimmingPoolById(long id);
}
