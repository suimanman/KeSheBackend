package com.keshe.backend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import com.keshe.backend.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<User> {
    @Insert("insert into user(nickname, username, password) values(#{nickname},#{username},#{password})")
    void register(User user);

    @Select("select * from user where username = #{username}")
    User selectUserById(User user);
    @Select("select * from user where username = #{username}")
    User selectUser(User user);

    @Select("select * from user")
    List<User> list();
}
