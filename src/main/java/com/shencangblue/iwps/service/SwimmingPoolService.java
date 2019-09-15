package com.shencangblue.iwps.service;

import com.shencangblue.iwps.dto.SwimmingPoolDto;
import com.shencangblue.iwps.entity.SwimmingPool;

import java.util.List;

public interface SwimmingPoolService {

    /**
     * 校验用户名/密码是否正确
     * @param swimmingPoolDto 待校验dto对象
     * @return true：用户名/密码正确，如果正确，将dto对象里其他属性补齐
     *                 false：用户名/密码错误
     */
    boolean validate(SwimmingPoolDto swimmingPoolDto);

    /**
     * 获取指定Id的用户
     * @param swimmingPoolId 用户id
     * @return 指定用户
     */
    SwimmingPool getById(long swimmingPoolId);

    /**
     * 获取指定Id的用户
     * @param swimmingPoolId
     * @return
     */
    SwimmingPoolDto getByIdDto(long swimmingPoolId);

    /**
     * 获取用户列表
     * @param start
     * @param pageNum
     * @return 用户列表
     */
    List<SwimmingPool> getList(int start, int pageNum);

    /**
     * 获取用户列表—dto型
     * @param  swimmingPoolDto
     * @return 用户列表
     */
    List<SwimmingPoolDto> getList(SwimmingPoolDto swimmingPoolDto);

    /**
     * 新增用户
     * @param swimmingPool
     * @return
     */
    int addSwimmingPool(SwimmingPool swimmingPool);

    /**
     * 新增用户-dto型
     * @param swimmingPoolDto
     * @return
     */
    boolean addSwimmingPool(SwimmingPoolDto swimmingPoolDto);
    /**
     * 修改用户
     * @param swimmingPool
     * @return
     */
    int updateSwimmingPool(SwimmingPool swimmingPool);

    /**
     * 修改用户-dto型
     * @param swimmingPoolDto
     * @return
     */
    boolean updateSwimmingPool(SwimmingPoolDto swimmingPoolDto);
    /**
     * 删除用户
     * @param id
     * @return
     */
    int deleteSwimmingPoolById(long id);

    /**
     * 删除用户 dto型
     * @param id
     * @return
     */
    boolean deleteSwimmingPoolByIdDto(long id);

    int selectCount();
}
