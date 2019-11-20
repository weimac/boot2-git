package com.wk.service.impl;

import com.wk.mapper.UserMapper;
import com.wk.po.User;
import com.wk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description:
 * @Company:qianfeng
 * @Auther:weiMac
 * @Date:2019/11/13
 * @Time:17:37
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectList() {
        return userMapper.selectList();
    }

    @Override
    public int addUser(User user) {

        return userMapper.insertSelective(user);
    }

    @Override
    public User selectByPrimaryKey(Integer id) {

        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {

        return userMapper.updateByPrimaryKeySelective(record);
    }
}
