package com.shencangblue.iwps.service.impl;

import com.shencangblue.iwps.dao.SwimmingPoolDao;
import com.shencangblue.iwps.entity.SwimmingPool;
import com.shencangblue.iwps.service.SwimmingPoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SwimmingPoolServiceImpl implements SwimmingPoolService {
    @Autowired
    private SwimmingPoolDao swimmingPoolDao;
    @Override
    public SwimmingPool getById(long swimmingPool) {
        return swimmingPoolDao.queryById(swimmingPool);
    }

    @Override
    public List<SwimmingPool> getList(int start, int pageNum) {
        return swimmingPoolDao.queryAll(start,pageNum);
    }

    @Override
    public int addSwimmingPool(SwimmingPool swimmingPool) {
        return swimmingPoolDao.addSwimmingPool(swimmingPool);
    }

    @Override
    public int updateSwimmingPool(SwimmingPool swimmingPool) {
        return swimmingPoolDao.updateSwimmingPool(swimmingPool);
    }

    @Override
    public int deleteSwimmingPoolById(long id) {
        return swimmingPoolDao.deleteSwimmingPoolById(id);
    }
}
