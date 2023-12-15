package com.kob.backend.service;

import com.kob.backend.dto.ordersDto;
import com.kob.backend.dto.paymentDto;

public interface PaymentService {
    ordersDto displayPayment(Integer orderNum);
    String displayPayType(String payType);
}
