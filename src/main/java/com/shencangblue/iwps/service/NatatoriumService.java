package com.shencangblue.iwps.service;

import com.shencangblue.iwps.entity.Natatorium;

import java.util.List;

public interface NatatoriumService {

    Natatorium getById(long natatorium);
    List<Natatorium> getList(int start, int pageNum);
    int addNatatorium(Natatorium natatorium);
    int updateNatatorium(Natatorium natatorium);
    int deleteNatatoriumById(long id);
}
