package com.shencangblue.iwps.service;

import com.shencangblue.iwps.entity.User;

import java.util.List;

public interface UserService {
    User getById(long user);
    List<User> getList(int start, int pageNum);
    int addUser(User swimmingPool);
    int updateUser(User user);
    int deleteUserById(long id);
}
