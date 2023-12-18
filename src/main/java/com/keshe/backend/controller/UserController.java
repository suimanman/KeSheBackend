package com.keshe.backend.controller;

//import cn.hutool.core.util.StrUtil;
import com.keshe.backend.common.Constants;
import com.keshe.backend.common.Result;
import com.keshe.backend.pojo.User;
import com.keshe.backend.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author candle

 */
@RestController
@RequestMapping("/api/v1/user")
@CrossOrigin
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/register")
    public Result register(@RequestBody User user) {

        String username = user.getUsername();
        String password = user.getPassword();

//        if(StrUtil.isBlank(username)||StrUtil.isBlank(password)){
//            return Result.error(Constants.CODE_400,"参数错误");
//        }
        return Result.success(userService.register(user));
    }

    @PostMapping("/login")
    public Result login(@RequestBody User user) {
        String username = user.getUsername();
        String password = user.getPassword();
//        if(StrUtil.isBlank(username)||StrUtil.isBlank(password)){
//            return Result.error(Constants.CODE_400,"参数错误");
//        }
        User one = userService.login(user);
        Map<String,Object>mp = new HashMap<>();
        mp.put("user",one);
        return Result.success(mp);
    }

}
