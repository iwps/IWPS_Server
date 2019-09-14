package com.shencangblue.iwps.service;

import com.shencangblue.iwps.entity.Lifeguard;

import java.util.List;

public interface LifeguardService {
    Lifeguard getById(long lifeguard);
    List<Lifeguard> getList(int start, int pageNum);
    int addLifeguard(Lifeguard lifeguard);
    int updateLifeguard(Lifeguard lifeguard);
    int deleteLifeguardById(long id);

}
