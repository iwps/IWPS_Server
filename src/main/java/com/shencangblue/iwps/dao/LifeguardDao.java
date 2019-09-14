package com.shencangblue.iwps.dao;

import com.shencangblue.iwps.entity.Lifeguard;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LifeguardDao {
    Lifeguard queryById(long id);
    List<Lifeguard> queryAll(@Param("offset") int offset, @Param("limit") int limit);
    int addLifeguard(Lifeguard lifeguard);
    int updateLifeguard(Lifeguard lifeguard);
    int deleteLifeguardById(long id);
}
