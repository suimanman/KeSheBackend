package com.kob.backend.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class cart {
    private Integer id;
    @JsonProperty("user_id")
    private Integer userId;
    @JsonProperty("product_id")
    private Integer productId;
    private Integer num;
    @JsonProperty("max_num")
    private Integer maxNum;
    private boolean check;
}
