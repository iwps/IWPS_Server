package com.shencangblue.iwps.service.impl;

import com.shencangblue.iwps.dao.SuperAdministratorDao;
import com.shencangblue.iwps.entity.SuperAdministrator;
import com.shencangblue.iwps.service.SuperAdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SuperAdministratorServiceImpl implements SuperAdministratorService {
    @Autowired
    private SuperAdministratorDao superAdministratorDao;

    @Override
    public SuperAdministrator getById(long superAdministrator) {
        return superAdministratorDao.queryById(superAdministrator);
    }

    @Override
    public List<SuperAdministrator> getList(int start, int pageNum) {
        return superAdministratorDao.queryAll(start,pageNum);
    }

    @Override
    public int addSuperAdministrators(SuperAdministrator superAdministrator) {
        return superAdministratorDao.addSuperAdministrator(superAdministrator);
    }

    @Override
    public int updateSuperAdministrators(SuperAdministrator superAdministrator) {
        return superAdministratorDao.updateSuperAdministrator(superAdministrator);
    }

    @Override
    public int deleteSuperAdministratorsId(long id) {
        return superAdministratorDao.deleteSuperAdministrator(id);
    }
}
