package com.shencangblue.iwps.service;

import com.shencangblue.iwps.dto.UserHistoryDto;
import com.shencangblue.iwps.entity.UserHistory;

import java.util.List;

public interface UserHistoryService {

    /**
     * 新增记录
     *
     * @param userHistoryDto 待校验dto对象
     * @return true：用户名/密码正确，如果正确，将dto对象里其他属性补齐
     * false：用户名/密码错误
     */
    boolean add(UserHistoryDto userHistoryDto);

    /**
     * 获取指定Id的记录
     *
     * @param userHistoryId 用户id
     * @return 指定用户
     */
    UserHistory getById(long userHistoryId);



    /**
     * 获取指定Id的用户
     *
     * @param userHistoryDto
     * @return
     */
    List<UserHistoryDto> getByUserId(UserHistoryDto userHistoryDto);


    /**
     * 获取用户数据
     *
     * @param userHistoryDto
     * @return 用户列表
     */
    List<UserHistoryDto> getList(UserHistoryDto userHistoryDto);


    /**
     * 修改用户-dto型
     *
     * @param userHistoryDto
     * @return
     */
    boolean modify(UserHistoryDto userHistoryDto);

    /**
     * 删除记录
     *
     * @param id
     * @return
     */
    boolean remove(long id);


    int selectCount();
}
