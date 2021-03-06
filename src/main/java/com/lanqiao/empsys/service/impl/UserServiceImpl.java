package com.lanqiao.empsys.service.impl;

import com.lanqiao.empsys.domain.User;
import com.lanqiao.empsys.mapper.UserMapper;
import com.lanqiao.empsys.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User selectById(User user) {
        return this.userMapper.selectById(user);
    }
}
