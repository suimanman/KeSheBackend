package com.kob.backend.service.impl;

import com.kob.backend.mapper.ProductMapper;
import com.kob.backend.mapper.CartMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartService {
    @Autowired
    private CartMapper shoppingCartMapper;
    @Autowired
    private ProductMapper productMapper;


}
