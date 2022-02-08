package com.lanqiao.empsys.mapper;

import com.lanqiao.empsys.domain.User;
import org.springframework.stereotype.Repository;

@Repository//加上注解注入依赖的时候不会报错
public interface UserMapper {
    User selectById(User user);
}
