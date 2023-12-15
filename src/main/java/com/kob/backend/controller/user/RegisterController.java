package com.kob.backend.controller.user;

import com.kob.backend.mapper.UserMapper;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.kob.backend.pojo.user;
import java.util.Map;

@RestController
public class RegisterController {

    @Autowired
    UserMapper userMapper;

    @PostMapping("/user/adduser/")
    public String addCount(HttpServletRequest mp){
        String username=mp.getParameter("username");
        String password=mp.getParameter("password");
        user usr=new user(username,password);
        userMapper.insert(usr);
        return "sucessfully";
    }
}
