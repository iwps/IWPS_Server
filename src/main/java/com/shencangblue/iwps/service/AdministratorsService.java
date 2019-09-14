package com.shencangblue.iwps.service;

import com.shencangblue.iwps.dto.AdministratorsDto;
import com.shencangblue.iwps.entity.Administrators;

import java.util.List;

public interface AdministratorsService {

    /**
     * 校验用户名/密码是否正确
     * @param administratorsDto 待校验dto对象
     * @return true：用户名/密码正确，如果正确，将dto对象里其他属性补齐
     *                 false：用户名/密码错误
     */
    boolean validate(AdministratorsDto administratorsDto);

    /**
     * 获取指定Id的用户
     * @param administratorsId 用户id
     * @return 指定用户
     */
    Administrators getById(long administratorsId);

    /**
     * 获取指定Id的用户
     * @param administratorId
     * @return
     */
    AdministratorsDto getByIdDto(long administratorId);

    /**
     * 获取用户列表
     * @param start
     * @param pageNum
     * @return 用户列表
     */
    List<Administrators> getList(int start, int pageNum);

    /**
     * 获取用户列表—dto型
     * @param  administratorsDto
     * @return 用户列表
     */
    List<AdministratorsDto> getList(AdministratorsDto administratorsDto);

    /**
     * 新增用户
     * @param administrators 用户
     * @return
     */
    int addAdministrators(Administrators administrators);

    /**
     * 新增用户-dto型
     * @param administratorsDto 用户dto
     * @return
     */
    boolean addAdministrators(AdministratorsDto administratorsDto);
    /**
     * 修改用户
     * @param administrators
     * @return
     */
    int updateAdministrators(Administrators administrators);

    /**
     * 修改用户-dto型
     * @param administratorsDto
     * @return
     */
    boolean updateAdministrators(AdministratorsDto administratorsDto);
    /**
     * 删除用户
     * @param id
     * @return
     */
    int deleteAdministratorsById(long id);

    /**
     * 删除用户 dto型
     * @param id
     * @return
     */
    boolean deleteAdministratorsByIdDto(long id);

    int selectCount();

}
