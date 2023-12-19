package com.keshe.backend.controller;

import com.keshe.backend.common.Result;
import com.keshe.backend.dto.CartDto;
import com.keshe.backend.pojo.Cart;
import com.keshe.backend.service.impl.CartServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CartController {
    @Autowired
    private CartServiceImpl cartService;

    @PostMapping("/carts")
    public Result createCart(@RequestBody Cart cart){
        int num=cartService.queryCartNum(cart);
        int maxNum=cartService.queryCartMaxNum(cart);
        if(num>maxNum){
            return Result.success(202);
        }else if(num>0){
            cartService.updateCart(num+1);
            return Result.success(201);
        }else{
            cartService.createCart(cart);
            List<CartDto> result=cartService.queryCarts(cart);
            return Result.success(result);
        }
    }
    @PutMapping("/carts")
    public Result updateCart(@RequestBody Cart cart){
        cartService.updateCart(cart.getNum());
        return Result.success();
    }
    @DeleteMapping("/carts")
    public Result deleteCart(@RequestBody Cart cart){
        cartService.deleteCart(cart.getUserId(),cart.getProductId());
        return Result.success(200);
    }

    @GetMapping("/carts/{userId}")
    public Result listCarts(@PathVariable int userId){
        List<CartDto> result=cartService.showCarts(userId);
        return Result.success(result);
    }
}
