package com.keshe.backend.service.impl;

import com.keshe.backend.dto.CartDto;
import com.keshe.backend.mapper.CartMapper;
import com.keshe.backend.pojo.Cart;
import com.keshe.backend.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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
    public void deleteCart(Cart cart) {
        cartMapper.deleteCart(cart);
    }

    @Override
    public List<Cart> showCarts(int id) {
        return cartMapper.showCarts(id);
    }

    @Override
    public List<CartDto> queryCarts(Cart cart) {
        return cartMapper.queryCarts(cart);
    }

    @Override
    public void updateCart() {
        cartMapper.updateCart();
    }
}
