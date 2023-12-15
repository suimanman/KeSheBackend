package com.kob.backend.service;

import com.kob.backend.dto.ordersDto;
import com.kob.backend.pojo.orders;

import java.util.List;

public interface OrderService {
    void createOrder(orders order) ;


    List<ordersDto> listOrder(String id) ;
}
