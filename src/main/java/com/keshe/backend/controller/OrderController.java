package com.keshe.backend.controller;

import com.alibaba.fastjson.JSONObject;
import com.keshe.backend.common.GetCurrentTime;
import com.keshe.backend.common.Result;
import com.keshe.backend.dto.AddressDto;
import com.keshe.backend.dto.OrderDeleteDto;
import com.keshe.backend.dto.OrderDto;
import com.keshe.backend.dto.OrdersCreateDto;
import com.keshe.backend.pojo.Address;
import com.keshe.backend.pojo.Order;
import com.keshe.backend.service.impl.OrderServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
@Slf4j
public class OrderController {
    @Autowired
    private OrderServiceImpl orderService;
    GetCurrentTime getCurrentTime=new GetCurrentTime();
    @PostMapping("/orders")
    public Result createOrder(@RequestBody OrdersCreateDto orders) {
            Order order=new Order();
            order.setUserId(orders.getUser_id());
            order.setProductId(orders.getProduct_id());
            order.setNum(orders.getNum());
            order.setAddressId(orders.getAddress_id());
            order.setCreatedAt(getCurrentTime.getCurrentTime());
            order.setUpdatedAt(getCurrentTime.getCurrentTime());
            orderService.createOrder(order);
        return Result.success();
    }
    @DeleteMapping("/orders")
    public Result deleteOrder(@RequestBody OrderDeleteDto order){
        orderService.deleteOrder(order.getUserId(),order.getProductId());
        return Result.success();
    }
    @GetMapping("/user/{id}/orders")
    public Result listOrders(@PathVariable Integer id) {
        List<OrderDto> items=orderService.listOrder(id);
//        for(int i=0;i<items.size();i++){
//            items.get(i).setCreated_at(getCurrentTime.getCurrentTime());
//        }
        Map<String,Object> result=new HashMap<>();
        result.put("items",items);
        result.put("total",items.size());
//        log.info("--------:{}", JSONObject.toJSON(items));
        return Result.success(result);
    }
    @GetMapping("/addresses/{id}")
    public Result getAddresses(@PathVariable Integer id){
        List<Address> result=orderService.getAddress(id);
        return Result.success(result);
    }

    @PostMapping("/addresses")
    public Result insertAddresses(@RequestBody AddressDto addressDto){
//        log.info("---------{}{}{}",addressDto.getName(),addressDto.getPhone(),addressDto.getAddress());
        Address address=new Address();
        address.setUserId(addressDto.getUserId());
        address.setAddressName(addressDto.getName());
        address.setAddressPhone(addressDto.getPhone());
        address.setAddress(addressDto.getAddress());
        orderService.insertAddress(address);
        return Result.success();
    }


}
