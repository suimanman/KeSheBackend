package com.kob.backend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kob.backend.pojo.cart;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CartMapper extends BaseMapper<cart> {

    @Select("select num from cart where userId=#{cart.user_id} and productId=#{cart.product_id}")
    Integer queryCartNum(cart cart);

    @Select("select maxNum from cart where userId=#{cart.user_id} and productId=#{cart.product_id}")
    Integer queryCartMaxNum(cart cart);

    @Insert("insert into cart(userId,productId) values(cart.user_id,cart.product_id)")
     void creatCart(cart cart);

    @Delete("delete from cart where userId=#{cart.user_id} and productId=#{product_id}")
    void deleteCart(cart cart);

    @Select("select * from cart where userId=#{id}")
    List<cart> showCarts(int id);
}
