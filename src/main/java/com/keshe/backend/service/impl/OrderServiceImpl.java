package com.keshe.backend.service.impl;

import com.keshe.backend.common.GetCurrentTime;
import com.keshe.backend.dto.OrderDto;
import com.keshe.backend.mapper.AddressMapper;
import com.keshe.backend.mapper.OrderMapper;
import com.keshe.backend.mapper.UserMapper;
import com.keshe.backend.pojo.Address;
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
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private AddressMapper addressMapper;

    GetCurrentTime getCurrentTime=new GetCurrentTime();
    @Override
    public void createOrder(Order order) {
        log.info("-----------{}",order.getAddressId());
        orderMapper.save(order);
    }
    @Override
    public List<OrderDto> listOrder(Integer id) {
//        log.info("-----{}",orderMapper.findById(id).get(3).getAddressId());
        return orderMapper.findById(id);
    }


    @Override
    public List<Address> getAddress(Integer id) {
        return addressMapper.getAddress(id);
    }

    @Override
    public void insertAddress(Address address) {
//        log.info("-------------{}{}{}",address.getAddressName(),address.getAddressPhone(),address.getAddress());
        addressMapper.insertAddress(address);
    }

    @Override
    public void deleteOrder(int userId,int productId) {
        orderMapper.delete(userId,productId);
    }

    @Override
    public void updateOrder(String orderNum) {
//        int num=Integer.parseInt(orderNum) ;
        orderMapper.updateOrder(orderNum);
    }

    @Override
    public void updateTime() {
        orderMapper.updateDate(getCurrentTime.getCurrentTime());
    }
}
