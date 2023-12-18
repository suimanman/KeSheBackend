package com.keshe.backend.controller;

import com.keshe.backend.common.GetCurrentTime;
import com.keshe.backend.common.Result;
import com.keshe.backend.dto.OrderDto;
import com.keshe.backend.pojo.Payment;
import com.keshe.backend.service.PaymentService;
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
        OrderDto ordersdto=paymentService.displayPayment(order_num);
        ordersdto.setCreated_at(getCurrentTime.getCurrentTime());
        return Result.success(ordersdto);
    }

    @PostMapping("/payments")
    public Result showPayType(@RequestBody Payment form){
        String payUrl=paymentService.displayPayType(form.getPayType());
        Map<String,String> result=new HashMap<>();
        result.put("payUrl",payUrl);
        return Result.success(result);
    }

}
