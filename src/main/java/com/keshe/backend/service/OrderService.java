package com.keshe.backend.service;

import com.keshe.backend.dto.OrderDto;
import com.keshe.backend.pojo.Order;

import java.util.List;

public interface OrderService {
    void createOrder(Order order) ;


    List<OrderDto> listOrder(String id) ;
}
