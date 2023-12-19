package com.keshe.backend.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Product {
    @TableId(value = "product_id", type = IdType.AUTO)
    private Integer product_id;
    private String name;
    private Integer category_id;
    private String title;
    private String img_path;
    private Double price;
    private Double discount_price;
    private String info;
    @JsonProperty("created_at")
    private Data createdAt;
}
