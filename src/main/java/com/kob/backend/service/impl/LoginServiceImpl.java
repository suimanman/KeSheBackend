package com.kob.backend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kob.backend.mapper.UserMapper;
import com.kob.backend.pojo.user;
import com.kob.backend.service.LoginService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl extends ServiceImpl<UserMapper, user> implements LoginService {
    @Resource
    private UserMapper userMapper;

    @Override
    public boolean loginVerify(String username,String password){
        try{
            String pass=userMapper.getPassword(username);
            System.out.println(pass);
            if(pass.equals(password)) return true;
            else return false;
        }catch (Exception e){
            System.out.println("w");
            return false;
        }
    }
}
