package com.kob.backend.service;

import com.kob.backend.pojo.cart;

import java.util.List;

public interface CartService {

    Integer queryCartNum(cart cart);

    Integer queryCartMaxNum(cart cart);
    void createCart(cart cart);

    void deleteCart(cart cart);

    List<cart> showCarts(int id);
}
