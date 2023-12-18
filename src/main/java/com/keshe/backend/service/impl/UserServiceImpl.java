package com.keshe.backend.service.impl;

import cn.hutool.crypto.SecureUtil;
import com.keshe.backend.common.Constants;
//import com.keshe.backend.common.RoleEnum;
//import com.keshe.backend.entity.Notice;
import com.keshe.backend.exception.ServiceException;
import com.keshe.backend.pojo.User;
//import com.keshe.backend.exception.ServiceException;
//import com.keshe.backend.mapper.NoticeMapper;
import com.keshe.backend.mapper.UserMapper;
import com.keshe.backend.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl  implements UserService{
    @Autowired
    UserMapper userMapper;
    @Override
    public User register(User user) {
//         用户密码 md5加密
//        user.setPassword(SecureUtil.md5(user.getPassword()));
        User one = userMapper.selectUserById(user);

        if(one == null) {
            one = new User();
            BeanUtils.copyProperties(user, one);
//            one.setRole(RoleEnum.ROLE_USER.toString());
            if(one.getNickname() == null) {
                one.setNickname(one.getUsername());
            }
            userMapper.register(one);
        } else {
            // 用户已存在
            throw new ServiceException(Constants.CODE_600, "用户已存在");
        }
        return one;
    }

    @Override
    public User login(User user) {
//        user.setPassword(SecureUtil.md5(user.getPassword()));
        User one=new User();
        one.setUsername("wmc123");
        one.setId(1);
//        User one = userMapper.selectUser(user);
        if(one != null) {
            BeanUtils.copyProperties(one, user);
            return user;
        } else {
            throw new ServiceException(Constants.CODE_600, "用户名或密码错误");
        }
    }

    @Override
    public List<User> list() {
        return userMapper.list();
    }
}
