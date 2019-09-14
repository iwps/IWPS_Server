package com.shencangblue.iwps.dao;

import com.shencangblue.iwps.dto.LifeguardDto;
import com.shencangblue.iwps.entity.Lifeguard;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LifeguardDao {
    /**
     * 通过Id查询指定用户
     * @param id
     * @return 用户
     */
    Lifeguard queryById(long id);

    /**
     * 查询所有用户
     * @param offset
     * @param limit
     * @return
     */
    List<Lifeguard> queryAll(@Param("offset") int offset, @Param("limit") int limit);

    /**
     * 添加新用户
     * @param lifeguard
     * @return
     */
    int addLifeguard(Lifeguard lifeguard);

    /**
     * 更新用户信息
     * @param lifeguard
     * @return
     */
    int updateLifeguard(Lifeguard lifeguard);

    /**
     * 删除用户
     * @param id
     * @return
     */
    int deleteLifeguardById(long id);


    /**
     * 根据查询条件查询用户列表-dto
     * @param lifeguardDto 查询条件
     * @return 用户列表
     */
    List<Lifeguard> select(LifeguardDto lifeguardDto);


    /**
     * 校验用户名/密码是否正确
     * @param lifeguardDto 待校验dto对象
     * @return true：用户名/密码正确，如果正确，将dto对象里其他属性补齐
     *                 false：用户名/密码错误
     */
    List<Lifeguard> validate(LifeguardDto lifeguardDto);

    /**
     * 新增
     * @param lifeguard 用户
     * @return 影响行数：如果用户名已存在，影响行数为0，新增成功，影响行数为1
     */
     Long insert(Lifeguard lifeguard);
    /**
     * 根据主键获取用户实体
     * @param id 主键
     * @return 用户实体
     */
     Lifeguard selectById(Long id);

    /**
     * 修改
     * @param lifeguard 用户
     * @return 影响行数：如用户名将修改成与其他用户的用户名相同，影响行数为0，修改成功，影响行数为1
     */
    Long update(Lifeguard lifeguard);

    /**
     * 根据主键删除
     * @param id 主键
     * @return 影响行数
     */
    Long delete(Long id);

    int count();
}
