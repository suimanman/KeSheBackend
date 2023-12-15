package com.kob.backend.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class product {
    @JsonProperty("product_id")
    private int productId;
    private String name;
    @JsonProperty("category_id")
    private Integer categoryId;
    private String title;
    @JsonProperty("img_path")
    private String imgPath;
    private Double price;
    @JsonProperty("discount_price")
    private Double discountPrice;
    private String info;
    @JsonProperty("created_at")
    private Data createdAt;
}
