package com.keshe.backend.service.impl;

import com.keshe.backend.dto.CartDto;
import com.keshe.backend.mapper.CartMapper;
import com.keshe.backend.pojo.Cart;
import com.keshe.backend.service.CartService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class CartServiceImpl implements CartService {
    @Autowired
    CartMapper cartMapper;
    @Override
    public void createCart(Cart cart) {
        cartMapper.creatCart(cart);
    }

    @Override
    public Integer queryCartNum(Cart cart) {
        return cartMapper.queryCartNum(cart);
    }

    @Override
    public Integer queryCartMaxNum(Cart cart) {
        return cartMapper.queryCartMaxNum(cart);
    }

    @Override
    public void deleteCart(int userId,int productId) {
        cartMapper.deleteCart(userId, productId);
    }

    @Override
    public List<CartDto> showCarts(int id) {
        return cartMapper.showCarts(id);
    }

    @Override
    public List<CartDto> queryCarts(Cart cart) {
        return cartMapper.queryCarts(cart);
    }

    @Override
    public void updateCart(int num) {
        cartMapper.updateCart(num);
    }
}
