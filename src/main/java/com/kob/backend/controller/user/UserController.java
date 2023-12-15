package com.kob.backend.controller.user;

import org.springframework.ui.Model;
import com.kob.backend.mapper.UserMapper;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.kob.backend.pojo.user;
import java.util.List;

@RestController
@RequestMapping
public class UserController {

    @Autowired
    UserMapper userMapper;
   @GetMapping("/index")
    public String getIndex(Model model){
       user usr=new user("wmc","ssss");
       model.addAttribute("user",usr);
       return "index";
   }

}
