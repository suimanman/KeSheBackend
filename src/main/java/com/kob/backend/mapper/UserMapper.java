package com.kob.backend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import com.kob.backend.pojo.user;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
public interface UserMapper extends BaseMapper<user> {
    @Select("select password from user where username=#{username}")
    String getPassword(String username);
}
