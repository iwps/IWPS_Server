package com.shencangblue.iwps.service.impl;

import com.shencangblue.iwps.dao.SuperAdministratorDao;
import com.shencangblue.iwps.dto.SuperAdministratorDto;
import com.shencangblue.iwps.entity.SuperAdministrator;
import com.shencangblue.iwps.service.SuperAdministratorService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class SuperAdministratorServiceImpl implements SuperAdministratorService {

    private final SuperAdministratorDao superAdministratorDao;

    @Autowired
    public SuperAdministratorServiceImpl(SuperAdministratorDao superAdministratorDao) {
        this.superAdministratorDao = superAdministratorDao;
    }

    @Override
    public boolean validate(SuperAdministratorDto superAdministratorsDto) {
        List<SuperAdministrator> list = superAdministratorDao.validate(superAdministratorsDto);
        return list.size() == 1;
    }

    @Override
    public SuperAdministrator getById(long superAdministratorsId) {
        return superAdministratorDao.queryById(superAdministratorsId);
    }

    @Override
    public SuperAdministratorDto getByIdDto(long superAdministratorsId) {
        SuperAdministratorDto superAdministratorDto = new SuperAdministratorDto();
        SuperAdministrator superAdministrator = superAdministratorDao.selectById(superAdministratorsId);
        BeanUtils.copyProperties(superAdministrator, superAdministratorDto);
        return superAdministratorDto;
    }

    @Override
    public List<SuperAdministrator> getList(int start, int pageNum) {
        return superAdministratorDao.queryAll(start, pageNum);
    }

    @Override
    public List<SuperAdministratorDto> getList(SuperAdministratorDto superAdministratorsDto) {
        List<SuperAdministratorDto> result = new ArrayList<>();
        System.out.println(superAdministratorsDto.getLimit() + ":" + superAdministratorsDto.getPage());
        List<SuperAdministrator> superAdministratorsList = superAdministratorDao.select(superAdministratorsDto);
        for (SuperAdministrator superAdministrator : superAdministratorsList) {
            SuperAdministratorDto superAdministratorsDto_ = new SuperAdministratorDto();
            result.add(superAdministratorsDto_);
            //字段赋值，常用于类赋值
            BeanUtils.copyProperties(superAdministrator, superAdministratorsDto_);
            superAdministratorsDto.setpId(0);
        }
        return result;
    }

    @Override
    public int addSuperAdministrator(SuperAdministrator SuperAdministrator) {
        return superAdministratorDao.addSuperAdministrator(SuperAdministrator);
    }

    @Override
    public boolean addSuperAdministrator(SuperAdministratorDto superAdministratorDto) {
        SuperAdministrator superAdministrator = new SuperAdministrator();
        BeanUtils.copyProperties(superAdministratorDto, superAdministrator);
        System.out.println(superAdministratorDto);
        return superAdministratorDao.insert(superAdministrator) == 1;
    }

    @Override
    public int updateSuperAdministrator(SuperAdministrator superAdministrator) {
        return superAdministratorDao.updateSuperAdministrator(superAdministrator);
    }

    @Override
    public boolean updateSuperAdministrator(SuperAdministratorDto superAdministratorDto) {
        SuperAdministrator administrators = new SuperAdministrator();
        BeanUtils.copyProperties(superAdministratorDto, administrators);
        return superAdministratorDao.update(administrators) == 1;
    }

    @Override
    public int deleteSuperAdministratorById(long id) {
        return superAdministratorDao.deleteSuperAdministratorById(id);
    }

    @Override
    public boolean deleteSuperAdministratorByIdDto(long id) {
        return superAdministratorDao.delete(id) == 1;
    }

    @Override
    public int selectCount() {
        return superAdministratorDao.count();
    }

    @Override
    public SuperAdministrator selectByAccount(String superAdministratorAccount) {
        return superAdministratorDao.selectByAccount(superAdministratorAccount);
    }
}
