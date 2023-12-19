package com.keshe.backend.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class AddressDto {
    private Integer id;
    @JsonProperty("user_id")
    private Integer userId;
    private String name;
    private String phone;
    private String address;
}
