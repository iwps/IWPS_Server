package com.shencangblue.iwps.dao;

import com.shencangblue.iwps.dto.SuperAdministratorDto;
import com.shencangblue.iwps.entity.SuperAdministrator;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SuperAdministratorDao {

    /**
     * 通过Id查询指定用户
     * @param id
     * @return 用户
     */
    SuperAdministrator queryById(long id);

    /**
     * 查询所有用户
     * @param offset
     * @param limit
     * @return
     */
    List<SuperAdministrator> queryAll(@Param("offset") int offset, @Param("limit") int limit);

    /**
     * 添加新用户
     * @param superAdministrator
     * @return
     */
    int addSuperAdministrator(SuperAdministrator superAdministrator);

    /**
     * 更新用户信息
     * @param superAdministrator
     * @return
     */
    int updateSuperAdministrator(SuperAdministrator superAdministrator);

    /**
     * 删除用户
     * @param id
     * @return
     */
    int deleteSuperAdministratorById(long id);


    /**
     * 根据查询条件查询用户列表-dto
     * @param superAdministratorsDto 查询条件
     * @return 用户列表
     */
    List<SuperAdministrator> select(SuperAdministratorDto superAdministratorsDto);


    /**
     * 校验用户名/密码是否正确
     * @param superAdministratorsDto 待校验dto对象
     * @return true：用户名/密码正确，如果正确，将dto对象里其他属性补齐
     *                 false：用户名/密码错误
     */
    List<SuperAdministrator> validate(SuperAdministratorDto superAdministratorsDto);

    /**
     * 新增
     * @param superAdministrator 用户
     * @return 影响行数：如果用户名已存在，影响行数为0，新增成功，影响行数为1
     */
    Long insert(SuperAdministrator superAdministrator);
    /**
     * 根据主键获取用户实体
     * @param id 主键
     * @return 用户实体
     */
    SuperAdministrator selectById(Long id);

    /**
     * 修改
     * @param administrators 用户
     * @return 影响行数：如用户名将修改成与其他用户的用户名相同，影响行数为0，修改成功，影响行数为1
     */
    Long update(SuperAdministrator administrators);

    /**
     * 根据主键删除
     * @param id 主键
     * @return 影响行数
     */
    Long delete(Long id);

    int count();
}
