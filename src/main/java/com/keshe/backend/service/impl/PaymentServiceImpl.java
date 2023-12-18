package com.keshe.backend.service.impl;

import com.keshe.backend.dto.OrderDto;
import com.keshe.backend.mapper.PaymentMapper;
import com.keshe.backend.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentMapper paymentMapper;
    @Override
    public OrderDto displayPayment(Integer orderNum) {
        OrderDto payorder=paymentMapper.findById(orderNum);
        return payorder;
    }

    @Override
    public String displayPayType(String payType) {
        String url= paymentMapper.findByType(payType);
        return url;
    }
}
