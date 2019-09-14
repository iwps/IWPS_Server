package com.shencangblue.iwps.service;

import com.shencangblue.iwps.dto.UserDto;
import com.shencangblue.iwps.entity.User;

import java.util.List;

public interface UserService {

    /**
     * 校验用户名/密码是否正确
     * @param userDto 待校验dto对象
     * @return true：用户名/密码正确，如果正确，将dto对象里其他属性补齐
     *                 false：用户名/密码错误
     */
    boolean validate(UserDto userDto);

    /**
     * 获取指定Id的用户
     * @param userId 用户id
     * @return 指定用户
      */
    User getById(long userId);

    /**
     * 获取指定Id的用户
     * @param userId
     * @return
     */
    UserDto getByIdDto(long userId);

    /**
     * 获取用户列表
     * @param start
     * @param pageNum
     * @return 用户列表
     */
    List<User> getList(int start, int pageNum);

    /**
     * 获取用户列表—dto型
     * @param  userDto
     * @return 用户列表
     */
    List<UserDto> getList(UserDto userDto);

    /**
     * 新增用户
     * @param user
     * @return
     */
    int addUser(User user);

    /**
     * 新增用户-dto型
     * @param userDto
     * @return
     */
    boolean addUser(UserDto userDto);
    /**
     * 修改用户
     * @param user
     * @return
     */
    int updateUser(User user);

    /**
     * 修改用户-dto型
     * @param userDto
     * @return
     */
    boolean updateUser(UserDto userDto);
    /**
     * 删除用户
     * @param id
     * @return
     */
    int deleteUserById(long id);

    /**
     * 删除用户 dto型
     * @param id
     * @return
     */
    boolean deleteUserByIdDto(long id);

    int selectCount();
}
