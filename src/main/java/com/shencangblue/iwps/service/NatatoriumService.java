package com.shencangblue.iwps.service;

import com.shencangblue.iwps.dto.NatatoriumDto;
import com.shencangblue.iwps.entity.Natatorium;

import java.util.List;

public interface NatatoriumService {

    /**
     * 校验用户名/密码是否正确
     * @param natatoriumDto 待校验dto对象
     * @return true：用户名/密码正确，如果正确，将dto对象里其他属性补齐
     *                 false：用户名/密码错误
     */
    boolean validate(NatatoriumDto natatoriumDto);

    /**
     * 获取指定Id的用户
     * @param natatoriumId 用户id
     * @return 指定用户
     */
    Natatorium getById(long natatoriumId);

    /**
     * 获取指定Id的用户
     * @param natatoriumId
     * @return
     */
    NatatoriumDto getByIdDto(long natatoriumId);

    /**
     * 获取用户列表
     * @param start
     * @param pageNum
     * @return 用户列表
     */
    List<Natatorium> getList(int start, int pageNum);

    /**
     * 获取用户列表—dto型
     * @param  natatoriumDto
     * @return 用户列表
     */
    List<NatatoriumDto> getList(NatatoriumDto natatoriumDto);

    /**
     * 新增用户
     * @param natatorium
     * @return
     */
    int addNatatorium(Natatorium natatorium);

    /**
     * 新增用户-dto型
     * @param natatoriumDto
     * @return
     */
    boolean addNatatorium(NatatoriumDto natatoriumDto);
    /**
     * 修改用户
     * @param natatorium
     * @return
     */
    int updateNatatorium(Natatorium natatorium);

    /**
     * 修改用户-dto型
     * @param natatoriumDto
     * @return
     */
    boolean updateNatatorium(NatatoriumDto natatoriumDto);
    /**
     * 删除用户
     * @param id
     * @return
     */
    int deleteNatatoriumById(long id);

    /**
     * 删除用户 dto型
     * @param id
     * @return
     */
    boolean deleteNatatoriumByIdDto(long id);

    int selectCount();
}
