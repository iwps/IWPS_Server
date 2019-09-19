package com.shencangblue.iwps.service;

import com.shencangblue.iwps.dto.NatatoriumHistoryDto;
import com.shencangblue.iwps.entity.NatatoriumHistory;

import java.util.List;

public interface NatatoriumHistoryService {

    /**
     * 新增记录
     *
     * @param natatoriumHistoryDto 待校验dto对象
     * @return true：用户名/密码正确，如果正确，将dto对象里其他属性补齐
     * false：用户名/密码错误
     */
    boolean add(NatatoriumHistoryDto natatoriumHistoryDto);

    /**
     * 获取指定Id的记录
     *
     * @param natatoriumHistoryId 用户id
     * @return 指定用户
     */
    NatatoriumHistory getById(long natatoriumHistoryId);



    /**
     * 获取指定Id的用户
     *
     * @param natatoriumHistoryDto
     * @return
     */
    List<NatatoriumHistoryDto> getByNatatoriumId(NatatoriumHistoryDto natatoriumHistoryDto);


    /**
     * 获取用户数据
     *
     * @param natatoriumHistoryDto
     * @return 用户列表
     */
    List<NatatoriumHistoryDto> getList(NatatoriumHistoryDto natatoriumHistoryDto);


    /**
     * 修改用户-dto型
     *
     * @param natatoriumHistoryDto
     * @return
     */
    boolean modify(NatatoriumHistoryDto natatoriumHistoryDto);

    /**
     * 删除记录
     *
     * @param id
     * @return
     */
    boolean remove(long id);


    int selectCount();
}
