package com.shencangblue.iwps.dao;

import com.shencangblue.iwps.entity.Natatorium;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NatatoriumDao {

    Natatorium queryById(long id);
    List<Natatorium> queryAll(@Param("offset") int offset, @Param("limit") int limit);
    int addNatatorium(Natatorium natatorium);
    int updateNatatorium(Natatorium natatorium);
    int deleteNatatorium(long id);

}
