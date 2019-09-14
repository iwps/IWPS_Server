package com.shencangblue.iwps.service.impl;

import com.shencangblue.iwps.dao.NatatoriumDao;
import com.shencangblue.iwps.entity.Natatorium;
import com.shencangblue.iwps.service.NatatoriumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NatatoriumServiceImpl implements NatatoriumService {
    @Autowired
    private NatatoriumDao natatoriumDao;
    @Override
    public Natatorium getById(long natatorium) {
        return natatoriumDao.queryById(natatorium);
    }

    @Override
    public List<Natatorium> getList(int start, int pageNum) {
        return natatoriumDao.queryAll(start,pageNum);
    }

    @Override
    public int addNatatorium(Natatorium natatorium) {
        return natatoriumDao.addNatatorium(natatorium);
    }

    @Override
    public int updateNatatorium(Natatorium natatorium) {
        return natatoriumDao.updateNatatorium(natatorium);
    }

    @Override
    public int deleteNatatoriumById(long id) {
        return natatoriumDao.deleteNatatoriumById(id);
    }
}
