package com.kob.backend.service.impl;

import com.kob.backend.dto.ordersDto;
import com.kob.backend.mapper.OrderMapper;
import com.kob.backend.pojo.orders;
import com.kob.backend.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;

    public void createOrder(orders order) {
        orderMapper.save(order);
    }

    public List<ordersDto> listOrder(String id) {
        return orderMapper.findById(id);
    }

//    public orders showOrder(String num) {
//        return orderMapper.findByNum(num);
//    }
}
