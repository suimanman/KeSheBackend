package com.kob.backend.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class orders implements Serializable {
    @JsonProperty("user_id")
    private Integer userId;
    @JsonProperty("product_id")
    private Integer productId;
    private Integer num;
    @JsonProperty("order_num")
    private Integer orderNum;//订单号
    @JsonProperty("address_name")
    private String addressName;
    @JsonProperty("address_phone")
    private String addressPhone;
    private Integer type;
    private String address;

}

