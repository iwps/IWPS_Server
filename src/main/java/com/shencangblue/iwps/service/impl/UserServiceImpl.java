package com.shencangblue.iwps.service.impl;

import com.shencangblue.iwps.dao.UserDao;
import com.shencangblue.iwps.entity.User;
import com.shencangblue.iwps.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public User getById(long user) {
        return userDao.queryById(user);
    }

    @Override
    public List<User> getList(int start, int pageNum) {
        return userDao.queryAll(start,pageNum);
    }

    @Override
    public int addUser(User user) {
        return userDao.addUser(user);
    }

    @Override
    public int updateUser(User user) {
        return userDao.updateUser(user);
    }

    @Override
    public int deleteUserById(long id) {
        return userDao.deleteUserById(id);
    }
}
