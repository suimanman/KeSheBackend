package com.keshe.backend.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.keshe.backend.pojo.Order;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Data
public class OrderDto {
    @JsonProperty("product_id")
    private Integer productId;
    private String name;
    @JsonProperty("img_path")
    private String imgPath;
    @JsonProperty("discount_price")
    private Double discountPrice;
    @JsonProperty("address_name")
    private String addressName;
    @JsonProperty("address_phone")
    private String addressPhone;
    private String address;
    @JsonProperty("user_id")
    private Integer userId;
    private Integer num;
    @JsonProperty("order_num")
    private Integer orderNum;//订单号
    private Integer type;
    @JsonProperty("created_at")
    private LocalDateTime createdAt;
    @JsonProperty("updated_at")
    private LocalDateTime updatedAt;
    @JsonProperty("address_id")
    private Integer addressId;
}
