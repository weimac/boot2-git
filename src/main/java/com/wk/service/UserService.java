package com.wk.service;

import com.wk.po.User;

import java.util.List;

/**
 * @Description:
 * @Company:qianfeng
 * @Auther:weiMac
 * @Date:2019/11/13
 * @Time:17:37
 */

public interface UserService {

    /**
     * 查询所有的用户信息
     * @return
     */

    List<User> selectList();

    /**
     * 添加用户信息
     */
    int addUser(User user);

    /**
     * 查询用户详情
     * @param id
     * @return
     */

    User selectByPrimaryKey(Integer id);

    /**
     * 删除
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 更新用户
     */
    int updateByPrimaryKeySelective(User record);
}
