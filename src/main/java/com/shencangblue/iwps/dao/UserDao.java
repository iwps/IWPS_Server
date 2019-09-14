package com.shencangblue.iwps.dao;

import com.shencangblue.iwps.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
    User queryById(long id);
    List<User> queryAll(@Param("offset") int offset, @Param("limit") int limit);
    int addUser(User administrators);
    int updateUser(User administrators);
    int deleteUserById(long id);

}
