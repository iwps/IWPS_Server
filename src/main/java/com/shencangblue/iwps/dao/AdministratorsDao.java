package com.shencangblue.iwps.dao;

import com.shencangblue.iwps.entity.Administrators;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdministratorsDao {

    Administrators queryById(long id);
    List<Administrators> queryAll(@Param("offset") int offset,@Param("limit") int limit);
    int addAdministrators(Administrators administrators);
    int updateAdministrators(Administrators administrators);
    int deleteAdministrators(long id);
}
