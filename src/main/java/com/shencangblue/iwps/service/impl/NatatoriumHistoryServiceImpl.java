package com.shencangblue.iwps.service.impl;

import com.shencangblue.iwps.dao.NatatoriumHistoryDao;
import com.shencangblue.iwps.dto.NatatoriumHistoryDto;
import com.shencangblue.iwps.entity.NatatoriumHistory;
import com.shencangblue.iwps.service.NatatoriumHistoryService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NatatoriumHistoryServiceImpl implements NatatoriumHistoryService {


    private final NatatoriumHistoryDao natatoriumHistoryDao;

    @Autowired
    public NatatoriumHistoryServiceImpl(NatatoriumHistoryDao natatoriumHistoryDao) {
        this.natatoriumHistoryDao = natatoriumHistoryDao;
    }


    //todo 仅仅设置了水温
    @Override
    public boolean add(NatatoriumHistoryDto natatoriumHistoryDto) {
        NatatoriumHistory natatoriumHistory = new NatatoriumHistory();
        BeanUtils.copyProperties(natatoriumHistoryDto, natatoriumHistory);
        System.out.println(natatoriumHistory);
        if(natatoriumHistory.getWaterTemperature()==null||natatoriumHistory.getWaterTemperature().equals("")){
            natatoriumHistory.setWaterTemperature("None");
        }
        return natatoriumHistoryDao.insert(natatoriumHistory) == 1;

    }

    @Override
    public NatatoriumHistory getById(long historyId) {
        return null;
    }

    @Override
    public List<NatatoriumHistoryDto> getByNatatoriumId(NatatoriumHistoryDto natatoriumHistoryDto) {
        return getList(natatoriumHistoryDto);
    }

    @Override
    public List<NatatoriumHistoryDto> getList(NatatoriumHistoryDto natatoriumHistoryDto) {
        List<NatatoriumHistoryDto> result = new ArrayList<>();
        System.out.println(natatoriumHistoryDto.getLimit()+":"+ natatoriumHistoryDto.getPage()+"===================");
        List<NatatoriumHistory> natatoriumHistoryList = natatoriumHistoryDao.select(natatoriumHistoryDto);
        for (NatatoriumHistory natatoriumHistory : natatoriumHistoryList) {
            NatatoriumHistoryDto natatoriumHistoryDto_ = new NatatoriumHistoryDto();
            result.add(natatoriumHistoryDto_);
            System.out.println(natatoriumHistory.getNatatoriumId());
            //字段赋值，常用于类赋值
            BeanUtils.copyProperties(natatoriumHistory, natatoriumHistoryDto_);
            natatoriumHistoryDto.setpId(0);
        }
        return result;
    }

    @Override
    public boolean modify(NatatoriumHistoryDto natatoriumHistoryDto) {
        return false;
    }

    @Override
    public boolean remove(long id) {
        return false;
    }

    @Override
    public int selectCount() {
        return natatoriumHistoryDao.count();
    }
}
