package com.shencangblue.iwps.service;

import com.shencangblue.iwps.entity.Administrators;

import java.util.List;

public interface AdministratorsService {
    Administrators getById(long administrators);
    List<Administrators>getList(int start,int pageNum);
    int addAdministrators(Administrators administrators);
    int updateAdministrators(Administrators administrators);
    int deleteAdministratorsById(long id);

}
