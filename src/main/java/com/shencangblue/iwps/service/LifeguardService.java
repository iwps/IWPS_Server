package com.shencangblue.iwps.service;

import com.shencangblue.iwps.dto.LifeguardDto;
import com.shencangblue.iwps.entity.Lifeguard;

import java.util.List;

public interface LifeguardService {

    /**
     * 校验用户名/密码是否正确
     * @param lifeguardDto 待校验dto对象
     * @return true：用户名/密码正确，如果正确，将dto对象里其他属性补齐
     *                 false：用户名/密码错误
     */
    boolean validate(LifeguardDto lifeguardDto);

    /**
     * 获取指定Id的用户
     * @param lifeguardId 用户id
     * @return 指定用户
     */
    Lifeguard getById(long lifeguardId);

    /**
     * 获取指定Id的用户
     * @param lifeguardId
     * @return
     */
     LifeguardDto getByIdDto(long lifeguardId);

    /**
     * 获取用户列表
     * @param start
     * @param pageNum
     * @return 用户列表
     */
    List<Lifeguard> getList(int start, int pageNum);

    /**
     * 获取用户列表—dto型
     * @param  lifeguardDto
     * @return 用户列表
     */
    List<LifeguardDto> getList(LifeguardDto lifeguardDto);

    /**
     * 新增用户
     * @param lifeguard 用户
     * @return
     */
    int addLifeguard(Lifeguard lifeguard);

    /**
     * 新增用户-dto型
     * @param lifeguardDto 用户dto
     * @return
     */
    boolean addLifeguard(LifeguardDto lifeguardDto);
    /**
     * 修改用户
     * @param lifeguard
     * @return
     */
    int updateLifeguard(Lifeguard lifeguard);

    /**
     * 修改用户-dto型
     * @param lifeguardDto
     * @return
     */
    boolean updateLifeguard(LifeguardDto lifeguardDto);
    /**
     * 删除用户
     * @param id
     * @return
     */
    int deleteLifeguardById(long id);

    /**
     * 删除用户 dto型
     * @param id
     * @return
     */
    boolean deleteLifeguardByIdDto(long id);

    int selectCount();

    Lifeguard selectByAccount(String lifeguardAccount);
}
