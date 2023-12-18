package com.keshe.backend.service.impl;

import com.keshe.backend.dto.OrderDto;
import com.keshe.backend.mapper.OrderMapper;
import com.keshe.backend.pojo.Order;
import com.keshe.backend.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;

    public void createOrder(Order order) {
        orderMapper.save(order);
    }

    public List<OrderDto> listOrder(String id) {
        return orderMapper.findById(id);
    }

//    public orders showOrder(String num) {
//        return orderMapper.findByNum(num);
//    }
}
