package com.keshe.backend.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.keshe.backend.pojo.Order;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class OrderDto extends Order {
    @JsonProperty("product_id")
    private Integer productId;
    private String name;
    @JsonProperty("img_path")
    private String imgPath;
    @JsonProperty("discount_price")
    private Double discountPrice;
    private LocalDateTime created_at;
}
