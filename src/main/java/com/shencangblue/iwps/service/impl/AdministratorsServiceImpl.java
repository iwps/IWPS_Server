package com.shencangblue.iwps.service.impl;

import com.shencangblue.iwps.dao.AdministratorsDao;
import com.shencangblue.iwps.entity.Administrators;
import com.shencangblue.iwps.service.AdministratorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdministratorsServiceImpl implements AdministratorsService {

    @Autowired
    private  AdministratorsDao administratorsDao;

    @Override
    public Administrators getById(long administrators) {
        return administratorsDao.queryById(administrators);
    }

    @Override
    public List<Administrators> getList(int start, int pageNum) {
        return administratorsDao.queryAll(start,pageNum);
    }

    @Override
    public int addAdministrators(Administrators administrators) {
        return administratorsDao.addAdministrators(administrators);
    }

    @Override
    public int updateAdministrators(Administrators administrators) {
        return administratorsDao.udpdateAdministrators(administrators);
    }

    @Override
    public int deleteAdministratorsId(long id) {
        return administratorsDao.deleteAdministrators(id);
    }

}
