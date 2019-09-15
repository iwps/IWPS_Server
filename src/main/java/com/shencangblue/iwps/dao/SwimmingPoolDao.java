package com.shencangblue.iwps.dao;

import com.shencangblue.iwps.dto.SwimmingPoolDto;
import com.shencangblue.iwps.entity.SwimmingPool;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SwimmingPoolDao {

    /**
     * 通过Id查询指定游泳馆
     * @param id 游泳馆ID
     * @return 游泳馆
     */
    SwimmingPool queryById(long id);

    /**
     * 查询所有游泳馆
     *
     * @param offset
     * @param limit
     * @return
     */
    List<SwimmingPool> queryAll(@Param("offset") int offset, @Param("limit") int limit);

    /**
     * 添加新用户
     * @param swimmingPool
     * @return
     */
    int addSwimmingPool(SwimmingPool swimmingPool);

    /**
     * 更新用户信息
     * @param swimmingPool
     * @return
     */
    int updateSwimmingPool(SwimmingPool swimmingPool);

    /**
     * 删除用户
     * @param id
     * @return
     */
    int deleteSwimmingPoolById(long id);


    /**
     * 根据查询条件查询用户列表-dto
     * @param swimmingPoolDto 查询条件
     * @return 用户列表
     */
    List<SwimmingPool> select(SwimmingPoolDto swimmingPoolDto);


    /**
     * 校验用户名/密码是否正确
     * @param swimmingPoolDto 待校验dto对象
     * @return true：用户名/密码正确，如果正确，将dto对象里其他属性补齐
     *                 false：用户名/密码错误
     */
    List<SwimmingPool> validate(SwimmingPoolDto swimmingPoolDto);

    /**
     * 新增
     * @param swimmingPool 用户
     * @return 影响行数：如果用户名已存在，影响行数为0，新增成功，影响行数为1
     */
    Long insert(SwimmingPool swimmingPool);
    /**
     * 根据主键获取用户实体
     * @param id 主键
     * @return 用户实体
     */
    SwimmingPool selectById(Long id);

    /**
     * 修改
     * @param swimmingPool 用户
     * @return 影响行数：如用户名将修改成与其他用户的用户名相同，影响行数为0，修改成功，影响行数为1
     */
    Long update(SwimmingPool swimmingPool);

    /**
     * 根据主键删除
     * @param id 主键
     * @return 影响行数
     */
    Long delete(Long id);

    int count();
}
