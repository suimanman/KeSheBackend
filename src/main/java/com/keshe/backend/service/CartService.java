package com.keshe.backend.service;

import com.keshe.backend.dto.CartDto;
import com.keshe.backend.pojo.Cart;

import java.util.List;

public interface CartService {

    Integer queryCartNum(Cart cart);

    Integer queryCartMaxNum(Cart cart);
    void createCart(Cart cart);

    void deleteCart(Cart cart);

    List<Cart> showCarts(int id);
    List<CartDto> queryCarts(Cart cart);

    void updateCart();
}
