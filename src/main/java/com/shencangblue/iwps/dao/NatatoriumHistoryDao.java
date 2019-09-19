package com.shencangblue.iwps.dao;

import com.shencangblue.iwps.dto.NatatoriumHistoryDto;
import com.shencangblue.iwps.entity.NatatoriumHistory;

import java.util.List;

public interface NatatoriumHistoryDao {

    List<NatatoriumHistory> select(NatatoriumHistoryDto userHistoryDto);

    int insert(NatatoriumHistory userHistory);

    int update(NatatoriumHistory userHistory);

    NatatoriumHistory selectById(Long id);

    int deleteByUserHistoryId(Long userHistoryId);

    int deleteById(Long id);

    int count();
}
