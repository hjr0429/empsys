package com.lanqiao.empsys.mapper;

import com.lanqiao.empsys.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User selectById(User user);
}
