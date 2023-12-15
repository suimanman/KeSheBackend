package com.kob.backend.controller.user;
import com.kob.backend.mapper.UserMapper;
import com.kob.backend.service.impl.LoginServiceImpl;
import jakarta.annotation.Resource;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Resource
    LoginServiceImpl loginService;
    @GetMapping("user/login")
    public boolean login()
    {
        return loginService.loginVerify("wmc","123aw");
    }

}
