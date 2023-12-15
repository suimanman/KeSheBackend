package com.kob.backend.controller;

import com.kob.backend.service.impl.LoginServiceImpl;
import jakarta.annotation.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.RestController;
import com.kob.backend.service.LoginService;
@RunWith(SpringRunner.class)
@SpringBootTest

public class test {
    @Autowired
    LoginServiceImpl loginService;
    @Test
    public void testSelect() {
        boolean x=loginService.loginVerify("wmc","123aw");
        System.out.println(x);
    }
}
