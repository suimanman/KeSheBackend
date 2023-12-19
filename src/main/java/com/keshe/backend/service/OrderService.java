package com.keshe.backend.service;

import com.keshe.backend.dto.OrderDto;
import com.keshe.backend.pojo.Address;
import com.keshe.backend.pojo.Order;

import java.util.List;

public interface OrderService {
    void createOrder(Order order) ;

    List<OrderDto> listOrder(Integer id) ;

    List<Address> getAddress(Integer id);

    void insertAddress(Address address);

    void deleteOrder(int userId,int productId);

    void updateOrder(String orderNum);

    void updateTime();
}
