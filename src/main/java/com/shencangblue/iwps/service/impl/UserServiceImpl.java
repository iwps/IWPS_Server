package com.shencangblue.iwps.service.impl;

import com.shencangblue.iwps.dao.UserDao;
import com.shencangblue.iwps.dto.UserDto;
import com.shencangblue.iwps.entity.User;
import com.shencangblue.iwps.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public boolean validate(UserDto userDto) {
        List<User> list = userDao.validate(userDto);
        return list.size() == 1;
    }

    @Override
    public User getById(long userId) {
        return userDao.queryById(userId);
    }

    @Override
    public User selectByAccount(String userAccount) {
        return userDao.selectByAccount(userAccount);
    }

    @Override
    public UserDto getByIdDto(long userId) {
        UserDto userDto = new UserDto();
        User user = userDao.selectById(userId);
        BeanUtils.copyProperties(user, userDto);
        return userDto;
    }

    @Override
    public List<User> getList(int start, int pageNum) {
        return userDao.queryAll(start,pageNum);
    }

    @Override
    public List<UserDto> getList(UserDto userDto) {
        List<UserDto> result = new ArrayList<>();
        System.out.println(userDto.getLimit()+":"+userDto.getPage());
        List<User> userList = userDao.select(userDto);
        for (User user : userList) {
            UserDto userDto_ = new UserDto();
            result.add(userDto_);
            //字段赋值，常用于类赋值
            BeanUtils.copyProperties(user, userDto_);
            userDto.setpId(0);
        }
        return result;
    }

    @Override
    public int addUser(User user) {
        return userDao.addUser(user);
    }

    @Override
    public boolean addUser(UserDto userDto) {
        User user = new User();
        BeanUtils.copyProperties(userDto, user);
        System.out.println(userDto);
//		user.setPassword(MD5Util.getMD5(userDto.getPassword()));
        return userDao.insert(user) == 1;
    }

    @Override
    public int updateUser(User user) {
        return userDao.updateUser(user);
    }

    @Override
    public boolean updateUser(UserDto userDto) {
        User user = new User();
        BeanUtils.copyProperties(userDto, user);
//		if(!CommonUtil.isEmpty(userDto.getPassword())) {
//			user.setPassword(MD5Util.getMD5(userDto.getPassword()));
//		}
        return userDao.update(user) == 1;
    }

    @Override
    public int deleteUserById(long id) {
        return userDao.deleteUserById(id);
    }

    @Override
    public boolean deleteUserByIdDto(long id) {
        return userDao.delete(id)==1;
    }

    @Override
    public int selectCount() {
        return userDao.count();
    }
}
