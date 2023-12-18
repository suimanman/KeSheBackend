package com.keshe.backend.service;

import com.keshe.backend.dto.OrderDto;

public interface PaymentService {
    OrderDto displayPayment(Integer orderNum);
    String displayPayType(String payType);
}
