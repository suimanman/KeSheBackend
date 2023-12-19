package com.keshe.backend.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.thymeleaf.inline.IInliner;

import java.util.List;

@Data
public class OrdersCreateDto {
    private Integer user_id;
    private Integer product_id;
    private Integer num;
    private Integer address_id;
}
