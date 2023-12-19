package com.keshe.backend.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonAppend;
import lombok.Data;

@Data
public class Address {
    @TableId("id")
    private Integer id;
    @JsonProperty("user_id")
    private Integer userId;
    @JsonProperty("name")
    private String addressName;
    @JsonProperty("phone")
    private String addressPhone;
    private String address;
}
