package com.shencangblue.iwps.service.impl;

import com.shencangblue.iwps.dao.UserHistoryDao;
import com.shencangblue.iwps.dto.UserHistoryDto;
import com.shencangblue.iwps.entity.UserHistory;
import com.shencangblue.iwps.service.UserHistoryService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserHistoryServiceImpl implements UserHistoryService {

    private final UserHistoryDao userHistoryDao;

    @Autowired
    public UserHistoryServiceImpl(UserHistoryDao userHistoryDao) {
        this.userHistoryDao = userHistoryDao;
    }


    @Override
    public boolean add(UserHistoryDto userHistoryDto) {
        UserHistory userHistory = new UserHistory();
        BeanUtils.copyProperties(userHistoryDto, userHistory);
        System.out.println(userHistory);
        if(userHistory.getRFIDInfo()==null||userHistory.getRFIDInfo().equals("")){
            userHistory.setRFIDInfo("None");
        }
        return userHistoryDao.insert(userHistory) == 1;

    }

    @Override
    public UserHistory getById(long userHistoryId) {
        return null;
    }

    @Override
    public List<UserHistoryDto> getByUserId(UserHistoryDto userHistoryDto) {
        return getList(userHistoryDto);
    }

    @Override
    public List<UserHistoryDto> getList(UserHistoryDto userHistoryDto) {
        List<UserHistoryDto> result = new ArrayList<>();
        List<UserHistory> userHistoryList = userHistoryDao.select(userHistoryDto);
        for (UserHistory userHistory : userHistoryList) {
            UserHistoryDto userHistoryDto_ = new UserHistoryDto();
            result.add(userHistoryDto_);
            //字段赋值，常用于类赋值
            BeanUtils.copyProperties(userHistory, userHistoryDto_);
            userHistoryDto.setpId(0);
        }
        return result;
    }

    @Override
    public boolean modify(UserHistoryDto userHistoryDto) {
        return false;
    }

    @Override
    public boolean remove(long id) {
        return false;
    }

    @Override
    public int selectCount() {
        return userHistoryDao.count();
    }
}
