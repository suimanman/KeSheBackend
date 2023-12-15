package com.kob.backend.controller;

import com.kob.backend.common.Result;
import com.kob.backend.pojo.cart;
import com.kob.backend.service.CartService;
import com.kob.backend.service.impl.CartServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CartController {
    @Autowired
    private CartServiceImpl cartService;

    @PostMapping("/carts")
    public Result createCart(@RequestBody cart cart){
        int num=cartService.queryCartNum(cart);
        int maxNum=cartService.queryCartMaxNum(cart);
        if(num>maxNum){
            return Result.success(202);
        }else if(num>0){
            return Result.success(201);
        }else{
            cartService.createCart(cart);
            return Result.success(200);
        }
    }

    @DeleteMapping("/carts")
    public Result deleteCart(@RequestBody cart cart){
        cartService.deleteCart(cart);
        return Result.success(200);
    }

    @GetMapping("/carts/{userId}")
    public Result listCarts(@PathVariable int userId){
        List<cart> result=cartService.showCarts(userId);
        return Result.success(result);
    }
}
