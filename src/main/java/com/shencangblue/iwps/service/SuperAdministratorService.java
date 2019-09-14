package com.shencangblue.iwps.service;

import com.shencangblue.iwps.entity.SuperAdministrator;

import java.util.List;

public interface SuperAdministratorService {
    SuperAdministrator getById(long superAdministrator);
    List<SuperAdministrator> getList(int start, int pageNum);
    int addSuperAdministrators(SuperAdministrator superAdministrator);
    int updateSuperAdministrators(SuperAdministrator superAdministrator);
    int deleteSuperAdministratorsById(long id);
}
