package com.kob.backend.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class payment {
    @JsonProperty("pay_type")
    private String payType;
    private String payUrl;
}
