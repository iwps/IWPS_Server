package com.shencangblue.iwps.dao;

import com.shencangblue.iwps.dto.UserHistoryDto;
import com.shencangblue.iwps.entity.UserHistory;

import java.util.List;

public interface UserHistoryDao {

    List<UserHistory> select(UserHistoryDto userHistoryDto);

    int insert(UserHistory userHistory);

    int update(UserHistory userHistory);

    UserHistory selectById(Long id);

    int deleteByUserHistoryId(Long userHistoryId);

    int deleteById(Long id);

    int count();
}
