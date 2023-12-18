package com.keshe.backend.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class paymentDto  {
    @JsonProperty("discount_price")
    private double discountPrice;
    private Integer num;
}
