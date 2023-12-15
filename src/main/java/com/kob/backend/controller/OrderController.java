package com.kob.backend.controller;

import com.alibaba.fastjson.JSONObject;
import com.kob.backend.common.GetCurrentTime;
import com.kob.backend.common.Result;
import com.kob.backend.dto.ordersDto;
import com.kob.backend.pojo.orders;
import com.kob.backend.service.impl.OrderServiceImpl;
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
    public Result createOrder(@RequestBody orders order) {
        orderService.createOrder(order);
        return Result.success(order);
    }

    @GetMapping("/user/{id}/orders")
    public Result listOrders(@PathVariable String id) {
        List<ordersDto> items=orderService.listOrder(id);
        for(int i=0;i<items.size();i++){
            items.get(i).setCreated_at(getCurrentTime.getCurrentTime());
        }
        Map<String,Object> result=new HashMap<>();
        result.put("items",items);
        result.put("total",items.size());
//        log.info("--------:{}", JSONObject.toJSON(items));
        return Result.success(result);
    }

//    @GetMapping("/orders/{num}")
//    public orders showOrder(@PathVariable String num) {
//        return orderService.showOrder(num);
//    }
}
