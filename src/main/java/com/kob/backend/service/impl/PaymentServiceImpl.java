package com.kob.backend.service.impl;

import com.kob.backend.dto.ordersDto;
import com.kob.backend.dto.paymentDto;
import com.kob.backend.mapper.PaymentMapper;
import com.kob.backend.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentMapper paymentMapper;
    @Override
    public ordersDto displayPayment(Integer orderNum) {
        ordersDto payorder=paymentMapper.findById(orderNum);
        return payorder;
    }

    @Override
    public String displayPayType(String payType) {
        String url= paymentMapper.findByType(payType);
        return url;
    }
}
