package com.kob.backend.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.kob.backend.pojo.orders;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Data
public class ordersDto extends orders {
    @JsonProperty("product_id")
    private Integer productId;
    private String name;
    @JsonProperty("img_path")
    private String imgPath;
    @JsonProperty("discount_price")
    private Double discountPrice;
    private LocalDateTime created_at;
}
