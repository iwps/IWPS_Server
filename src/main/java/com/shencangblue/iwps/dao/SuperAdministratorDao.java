package com.shencangblue.iwps.dao;

import com.shencangblue.iwps.entity.SuperAdministrator;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SuperAdministratorDao {

    SuperAdministrator queryById(long id);
    List<SuperAdministrator> queryAll(@Param("offset") int offset, @Param("limit") int limit);
    int addSuperAdministrator(SuperAdministrator superAdministrators);
    int updateSuperAdministrator(SuperAdministrator superAdministrators);
    int deleteSuperAdministratorById(long id);
}
