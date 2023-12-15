package com.kob.backend.service.impl;

import com.kob.backend.mapper.CartMapper;
import com.kob.backend.pojo.cart;
import com.kob.backend.service.CartService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {
    @Autowired
    CartMapper cartMapper;
    @Override
    public void createCart(cart cart) {
        cartMapper.creatCart(cart);
    }

    @Override
    public Integer queryCartNum(cart cart) {
        return cartMapper.queryCartNum(cart);
    }

    @Override
    public Integer queryCartMaxNum(cart cart) {
        return cartMapper.queryCartMaxNum(cart);
    }

    @Override
    public void deleteCart(cart cart) {
        cartMapper.deleteCart(cart);
    }

    @Override
    public List<cart> showCarts(int id) {
        return cartMapper.showCarts(id);
    }
}
