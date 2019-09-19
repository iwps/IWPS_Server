package com.shencangblue.iwps.service.impl;

import com.shencangblue.iwps.dao.SwimmingPoolDao;
import com.shencangblue.iwps.dto.SwimmingPoolDto;
import com.shencangblue.iwps.entity.SwimmingPool;
import com.shencangblue.iwps.service.SwimmingPoolService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class SwimmingPoolServiceImpl implements SwimmingPoolService {
    private final SwimmingPoolDao swimmingPoolDao;

    @Autowired
    public SwimmingPoolServiceImpl(SwimmingPoolDao swimmingPoolDao) {
        this.swimmingPoolDao = swimmingPoolDao;
    }

    @Override
    public boolean validate(SwimmingPoolDto swimmingPoolDto) {
        List<SwimmingPool> list = swimmingPoolDao.validate(swimmingPoolDto);
        return list.size() == 1;
    }

    @Override
    public SwimmingPool getById(long swimmingPoolId) {
        return swimmingPoolDao.queryById(swimmingPoolId);
    }

    @Override
    public SwimmingPoolDto getByIdDto(long swimmingPoolId) {
        SwimmingPoolDto swimmingPoolDto = new SwimmingPoolDto();
        SwimmingPool swimmingPool = swimmingPoolDao.selectById(swimmingPoolId);
        BeanUtils.copyProperties(swimmingPool, swimmingPoolDto);
        return swimmingPoolDto;
    }

    @Override
    public List<SwimmingPool> getList(int start, int pageNum) {
        return swimmingPoolDao.queryAll(start,pageNum);
    }

    @Override
    public List<SwimmingPoolDto> getList(SwimmingPoolDto swimmingPoolDto) {
        List<SwimmingPoolDto> result = new ArrayList<>();
        System.out.println(swimmingPoolDto.getLimit()+":"+swimmingPoolDto.getPage());
        List<SwimmingPool> swimmingPoolList = swimmingPoolDao.select(swimmingPoolDto);
        for (SwimmingPool swimmingPool : swimmingPoolList) {
            SwimmingPoolDto swimmingPoolDto_ = new SwimmingPoolDto();
            result.add(swimmingPoolDto_);
            //字段赋值，常用于类赋值
            BeanUtils.copyProperties(swimmingPool, swimmingPoolDto_);
            swimmingPoolDto.setpId(0);
        }
        return result;
    }

    @Override
    public int addSwimmingPool(SwimmingPool swimmingPool) {
        return swimmingPoolDao.addSwimmingPool(swimmingPool);
    }

    @Override
    public boolean addSwimmingPool(SwimmingPoolDto swimmingPoolDto) {
        SwimmingPool swimmingPool = new SwimmingPool();
        BeanUtils.copyProperties(swimmingPoolDto, swimmingPool);
        System.out.println(swimmingPoolDto);
        return swimmingPoolDao.insert(swimmingPool) == 1;
    }

    @Override
    public int updateSwimmingPool(SwimmingPool swimmingPool) {
        return swimmingPoolDao.updateSwimmingPool(swimmingPool);
    }

    @Override
    public boolean updateSwimmingPool(SwimmingPoolDto swimmingPoolDto) {
        SwimmingPool swimmingPool = new SwimmingPool();
        BeanUtils.copyProperties(swimmingPoolDto, swimmingPool);
        return swimmingPoolDao.update(swimmingPool) == 1;
    }

    @Override
    public int deleteSwimmingPoolById(long id) {
        return swimmingPoolDao.deleteSwimmingPoolById(id);
    }

    @Override
    public boolean deleteSwimmingPoolByIdDto(long id) {
        return swimmingPoolDao.delete(id)==1;
    }

    @Override
    public int selectCount() {
        return swimmingPoolDao.count();
    }
}
