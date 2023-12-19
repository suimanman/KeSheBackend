package com.keshe.backend.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@TableName("payment")
public class Payment {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    @JsonProperty("pay_type")
    private String payType;
    @JsonProperty("pay_url")
    private String payUrl;
    @JsonProperty("order_num")
    private String orderNum;
}
