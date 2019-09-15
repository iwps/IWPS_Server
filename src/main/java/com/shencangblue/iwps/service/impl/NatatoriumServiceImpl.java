package com.shencangblue.iwps.service.impl;

import com.shencangblue.iwps.dao.NatatoriumDao;
import com.shencangblue.iwps.dto.NatatoriumDto;
import com.shencangblue.iwps.entity.Natatorium;
import com.shencangblue.iwps.service.NatatoriumService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class NatatoriumServiceImpl implements NatatoriumService {
    @Autowired
    private NatatoriumDao natatoriumDao;

    @Override
    public boolean validate(NatatoriumDto natatoriumDto) {
        List<Natatorium> list = natatoriumDao.validate(natatoriumDto);
        return list.size() == 1;
    }

    @Override
    public Natatorium getById(long natatoriumId) {
        return natatoriumDao.queryById(natatoriumId);
    }

    @Override
    public NatatoriumDto getByIdDto(long natatoriumId) {
        NatatoriumDto natatoriumDto = new NatatoriumDto();
        Natatorium natatorium = natatoriumDao.selectById(natatoriumId);
        BeanUtils.copyProperties(natatorium, natatoriumDto);
        return natatoriumDto;
    }

    @Override
    public List<Natatorium> getList(int start, int pageNum) {
        return natatoriumDao.queryAll(start,pageNum);
    }

    @Override
    public List<NatatoriumDto> getList(NatatoriumDto natatoriumDto) {
        List<NatatoriumDto> result = new ArrayList<>();
        System.out.println(natatoriumDto.getLimit()+":"+natatoriumDto.getPage());
        List<Natatorium> natatoriumList = natatoriumDao.select(natatoriumDto);
        for (Natatorium natatorium: natatoriumList) {
            NatatoriumDto natatoriumDto_ = new NatatoriumDto();
            result.add(natatoriumDto_);
            //字段赋值，常用于类赋值
            BeanUtils.copyProperties(natatorium, natatoriumDto_);
            natatoriumDto.setpId(0);
        }
        return result;
    }

    @Override
    public int addNatatorium(Natatorium natatorium) {
        return natatoriumDao.addNatatorium(natatorium);
    }

    @Override
    public boolean addNatatorium(NatatoriumDto natatoriumDto) {
        Natatorium natatorium = new Natatorium();
        BeanUtils.copyProperties(natatoriumDto, natatorium);
        System.out.println(natatoriumDto);
//		user.setPassword(MD5Util.getMD5(userDto.getPassword()));
        return natatoriumDao.insert(natatorium) == 1;
    }

    @Override
    public int updateNatatorium(Natatorium natatorium) {
        return natatoriumDao.updateNatatorium(natatorium);
    }

    @Override
    public boolean updateNatatorium(NatatoriumDto natatoriumDto) {
        Natatorium natatorium = new Natatorium();
        BeanUtils.copyProperties(natatoriumDto, natatorium);
//		if(!CommonUtil.isEmpty(userDto.getPassword())) {
//			user.setPassword(MD5Util.getMD5(userDto.getPassword()));
//		}
        return natatoriumDao.update(natatorium) == 1;
    }

    @Override
    public int deleteNatatoriumById(long id) {
        return natatoriumDao.deleteNatatoriumById(id);
    }

    @Override
    public boolean deleteNatatoriumByIdDto(long id) {
        return natatoriumDao.delete(id)==1;
    }

    @Override
    public int selectCount() {
        return natatoriumDao.count();
    }
}
