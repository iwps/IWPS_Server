package com.shencangblue.iwps.service.impl;

import com.shencangblue.iwps.dao.LifeguardDao;
import com.shencangblue.iwps.dto.LifeguardDto;
import com.shencangblue.iwps.entity.Lifeguard;
import com.shencangblue.iwps.service.LifeguardService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class LifeguardServiceImpl implements LifeguardService {

    @Autowired
    private LifeguardDao lifeguardDao;

    @Override
    public boolean validate(LifeguardDto lifeguardDto) {
        List<Lifeguard> list = lifeguardDao.validate(lifeguardDto);
        return list.size() == 1;
    }

    @Override
    public Lifeguard getById(long lifeguardId) {
        return lifeguardDao.queryById(lifeguardId);
    }

    @Override
    public LifeguardDto getByIdDto(long lifeguardId) {
        LifeguardDto lifeguardDto = new LifeguardDto();
        Lifeguard lifeguard = lifeguardDao.selectById(lifeguardId);
        BeanUtils.copyProperties(lifeguard, lifeguardDto);
        return lifeguardDto;
    }

    @Override
    public List<Lifeguard> getList(int start, int pageNum) {
        return lifeguardDao.queryAll(start,pageNum);
    }

    @Override
    public List<LifeguardDto> getList(LifeguardDto lifeguardDto) {
        List<LifeguardDto> result = new ArrayList<>();
        System.out.println(lifeguardDto.getLimit()+":"+lifeguardDto.getPage());
        List<Lifeguard> lifeguardList = lifeguardDao.select(lifeguardDto);
        for (Lifeguard lifeguard : lifeguardList) {
            LifeguardDto lifeguardDto_ = new LifeguardDto();
            result.add(lifeguardDto_);
            //字段赋值，常用于类赋值
            BeanUtils.copyProperties(lifeguard, lifeguardDto_);
            lifeguardDto.setpId(0);
        }
        return result;
    }

    @Override
    public int addLifeguard(Lifeguard lifeguard) {
        return lifeguardDao.addLifeguard(lifeguard);
    }

    @Override
    public boolean addLifeguard(LifeguardDto lifeguardDto) {
        Lifeguard lifeguard = new Lifeguard();
        BeanUtils.copyProperties(lifeguardDto, lifeguard);
        System.out.println(lifeguardDto);
        return lifeguardDao.insert(lifeguard) == 1;
    }

    @Override
    public int updateLifeguard(Lifeguard lifeguard) {
        return lifeguardDao.updateLifeguard(lifeguard);
    }

    @Override
    public boolean updateLifeguard(LifeguardDto lifeguardDto) {
        Lifeguard lifeguard = new Lifeguard();
        BeanUtils.copyProperties(lifeguardDto, lifeguard);

        return lifeguardDao.update(lifeguard) == 1;
    }

    @Override
    public int deleteLifeguardById(long id) {
        return lifeguardDao.deleteLifeguardById(id);
    }

    @Override
    public boolean deleteLifeguardByIdDto(long id) {
        return lifeguardDao.delete(id)==1;
    }

    @Override
    public int selectCount() {
        return lifeguardDao.count();
    }
}
