package com.keshe.backend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.keshe.backend.pojo.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ProductMapper extends BaseMapper<Product> {
    @Select("select product_id from product")
    List<Integer> selectIds();
}
