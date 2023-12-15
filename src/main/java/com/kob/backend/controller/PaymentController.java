package com.kob.backend.controller;

import com.alibaba.fastjson.JSONObject;
import com.kob.backend.common.GetCurrentTime;
import com.kob.backend.common.Result;
import com.kob.backend.dto.ordersDto;
import com.kob.backend.dto.paymentDto;
import com.kob.backend.pojo.payment;
import com.kob.backend.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;
    GetCurrentTime getCurrentTime=new GetCurrentTime();
    @GetMapping("/orders/{order_num}")
    public Result showPayment(@PathVariable Integer order_num){
        ordersDto ordersdto=paymentService.displayPayment(order_num);
        ordersdto.setCreated_at(getCurrentTime.getCurrentTime());
        return Result.success(ordersdto);
    }

    @PostMapping("/payments")
    public Result showPayType(@RequestBody payment form){
        String payUrl=paymentService.displayPayType(form.getPayType());
        Map<String,String> result=new HashMap<>();
        result.put("payUrl",payUrl);
        return Result.success(result);
    }

}
