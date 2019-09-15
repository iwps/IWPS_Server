package com.shencangblue.iwps.dao;

import com.shencangblue.iwps.dto.NatatoriumDto;
import com.shencangblue.iwps.entity.Natatorium;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NatatoriumDao {
    /**
     * 通过Id查询指定用户
     * @param id
     * @return 用户
     */
    Natatorium queryById(long id);

    /**
     * 查询所有用户
     * @param offset
     * @param limit
     * @return
     */
    List<Natatorium> queryAll(@Param("offset") int offset, @Param("limit") int limit);

    /**
     * 添加新用户
     * @param natatorium
     * @return
     */
    int addNatatorium(Natatorium natatorium);

    /**
     * 更新用户信息
     * @param natatorium
     * @return
     */
    int updateNatatorium(Natatorium natatorium);

    /**
     * 删除用户
     * @param id
     * @return
     */
    int deleteNatatoriumById(long id);


    /**
     * 根据查询条件查询用户列表-dto
     * @param natatoriumDto 查询条件
     * @return 用户列表
     */
    List<Natatorium> select(NatatoriumDto natatoriumDto);


    /**
     * 校验用户名/密码是否正确
     * @param natatoriumDto 待校验dto对象
     * @return true：用户名/密码正确，如果正确，将dto对象里其他属性补齐
     *                 false：用户名/密码错误
     */
    List<Natatorium> validate(NatatoriumDto natatoriumDto);

    /**
     * 新增
     * @param natatorium 用户
     * @return 影响行数：如果用户名已存在，影响行数为0，新增成功，影响行数为1
     */
    Long insert(Natatorium natatorium);
    /**
     * 根据主键获取用户实体
     * @param id 主键
     * @return 用户实体
     */
    Natatorium selectById(Long id);

    /**
     * 修改
     * @param natatorium 用户
     * @return 影响行数：如用户名将修改成与其他用户的用户名相同，影响行数为0，修改成功，影响行数为1
     */
    Long update(Natatorium natatorium);

    /**
     * 根据主键删除
     * @param id 主键
     * @return 影响行数
     */
    Long delete(Long id);

    int count();
}
