package com.keshe.backend.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.keshe.backend.pojo.Cart;
import com.keshe.backend.pojo.Product;
import lombok.Data;

@Data
public class CartDto extends Product {
    private Integer id;
    @JsonProperty("user_id")
    private Integer userId;
    private Integer num;
    @JsonProperty("max_num")
    private Integer maxNum;
    private boolean check;
}
