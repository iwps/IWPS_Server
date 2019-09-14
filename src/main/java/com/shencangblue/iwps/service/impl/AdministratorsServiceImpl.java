package com.shencangblue.iwps.service.impl;

import com.shencangblue.iwps.dao.AdministratorsDao;
import com.shencangblue.iwps.dto.AdministratorsDto;
import com.shencangblue.iwps.entity.Administrators;
import com.shencangblue.iwps.service.AdministratorsService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdministratorsServiceImpl implements AdministratorsService {

    @Autowired
    private AdministratorsDao administratorsDao;

    @Override
    public boolean validate(AdministratorsDto AdministratorsDto) {
        List<Administrators> list = administratorsDao.validate(AdministratorsDto);
        return list.size() == 1;
    }

    @Override
    public Administrators getById(long administratorsId) {
        return administratorsDao.queryById(administratorsId);
    }

    @Override
    public AdministratorsDto getByIdDto(long administratorsId) {
        AdministratorsDto administratorsDto = new AdministratorsDto();
        Administrators administrator = administratorsDao.selectById(administratorsId);
        BeanUtils.copyProperties(administrator, administratorsDto);
        return administratorsDto;
    }

    @Override
    public List<Administrators> getList(int start, int pageNum) {
        return administratorsDao.queryAll(start, pageNum);
    }

    @Override
    public List<AdministratorsDto> getList(AdministratorsDto administratorsDto) {
        List<AdministratorsDto> result = new ArrayList<>();
        System.out.println(administratorsDto.getLimit() + ":" + administratorsDto.getPage());
        List<Administrators> administratorsList = administratorsDao.select(administratorsDto);
        for (Administrators administrators : administratorsList) {
            AdministratorsDto administratorsDto_ = new AdministratorsDto();
            result.add(administratorsDto_);
            //字段赋值，常用于类赋值
            BeanUtils.copyProperties(administrators, administratorsDto_);
            administratorsDto.setpId(0);
        }
        return result;
    }

    @Override
    public int addAdministrators(Administrators Administrators) {
        return administratorsDao.addAdministrators(Administrators);
    }

    @Override
    public boolean addAdministrators(AdministratorsDto administratorsDto) {
        Administrators administrators = new Administrators();
        BeanUtils.copyProperties(administratorsDto, administrators);
        System.out.println(administratorsDto);
        return administratorsDao.insert(administrators) == 1;
    }

    @Override
    public int updateAdministrators(Administrators administrators) {
        return administratorsDao.updateAdministrators(administrators);
    }

    @Override
    public boolean updateAdministrators(AdministratorsDto administratorsDto) {
        Administrators administrators = new Administrators();
        BeanUtils.copyProperties(administratorsDto, administrators);
        return administratorsDao.update(administrators) == 1;
    }

    @Override
    public int deleteAdministratorsById(long id) {
        return administratorsDao.deleteAdministratorsById(id);
    }

    @Override
    public boolean deleteAdministratorsByIdDto(long id) {
        return administratorsDao.delete(id) == 1;
    }

    @Override
    public int selectCount() {
        return administratorsDao.count();
    }
}
