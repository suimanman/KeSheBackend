package com.keshe.backend.service.impl;

import com.keshe.backend.mapper.ProductMapper;
import com.keshe.backend.mapper.CartMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartService {
    @Autowired
    private CartMapper shoppingCartMapper;
    @Autowired
    private ProductMapper productMapper;


}
