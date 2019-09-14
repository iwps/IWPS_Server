package com.shencangblue.iwps.service;

import com.shencangblue.iwps.dto.SuperAdministratorDto;
import com.shencangblue.iwps.entity.SuperAdministrator;

import java.util.List;

public interface SuperAdministratorService {

    /**
     * 校验用户名/密码是否正确
     * @param superAdministratorsDto 待校验dto对象
     * @return true：用户名/密码正确，如果正确，将dto对象里其他属性补齐
     *                 false：用户名/密码错误
     */
    boolean validate(SuperAdministratorDto superAdministratorsDto);

    /**
     * 获取指定Id的用户
     * @param superAdministratorsId 用户id
     * @return 指定用户
     */
    SuperAdministrator getById(long superAdministratorsId);

    /**
     * 获取指定Id的用户
     * @param superAdministratorId
     * @return
     */
    SuperAdministratorDto getByIdDto(long superAdministratorId);

    /**
     * 获取用户列表
     * @param start
     * @param pageNum
     * @return 用户列表
     */
    List<SuperAdministrator> getList(int start, int pageNum);

    /**
     * 获取用户列表—dto型
     * @param superAdministratorDto
     * @return 用户列表
     */
    List<SuperAdministratorDto> getList(SuperAdministratorDto superAdministratorDto);

    /**
     * 新增用户
     * @param superAdministrator 用户
     * @return
     */
    int addSuperAdministrator(SuperAdministrator superAdministrator);

    /**
     * 新增用户-dto型
     * @param superAdministratorDto 用户dto
     * @return
     */
    boolean addSuperAdministrator(SuperAdministratorDto superAdministratorDto);
    /**
     * 修改用户
     * @param superAdministrator
     * @return
     */
    int updateSuperAdministrator(SuperAdministrator superAdministrator);

    /**
     * 修改用户-dto型
     * @param superAdministratorDto
     * @return
     */
    boolean updateSuperAdministrator(SuperAdministratorDto superAdministratorDto);
    /**
     * 删除用户
     * @param id
     * @return
     */
    int deleteSuperAdministratorById(long id);

    /**
     * 删除用户 dto型
     * @param id
     * @return
     */
    boolean deleteSuperAdministratorByIdDto(long id);

    int selectCount();

}
