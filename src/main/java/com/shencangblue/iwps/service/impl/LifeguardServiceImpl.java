package com.shencangblue.iwps.service.impl;

import com.shencangblue.iwps.dao.LifeguardDao;
import com.shencangblue.iwps.entity.Lifeguard;
import com.shencangblue.iwps.service.LifeguardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LifeguardServiceImpl implements LifeguardService {

    @Autowired
    private LifeguardDao lifeguardDao;

    @Override
    public Lifeguard getById(long lifeguard) {
        return lifeguardDao.queryById(lifeguard);
    }

    @Override
    public List<Lifeguard> getList(int start, int pageNum) {
        return lifeguardDao.queryAll(start,pageNum);
    }

    @Override
    public int addLifeguard(Lifeguard lifeguard) {
        return lifeguardDao.addLifeguard(lifeguard);
    }

    @Override
    public int updateLifeguard(Lifeguard lifeguard) {
        return lifeguardDao.updateLifeguard(lifeguard);
    }

    @Override
    public int deleteLifeguardById(long id) {
        return lifeguardDao.deleteLifeguardById(id);
    }
}
