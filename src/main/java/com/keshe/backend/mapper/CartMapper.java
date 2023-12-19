package com.keshe.backend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.keshe.backend.dto.CartDto;
import com.keshe.backend.pojo.Cart;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CartMapper extends BaseMapper<Cart> {

    @Select("select product.*,cart.* from cart,product where cart.userId=#{user_id} and cart.productId=product.productId")
    List<CartDto> queryCarts(Cart cart);

    @Select("select num from cart where userId=#{user_id} and productId=#{product_id}")
    Integer queryCartNum(Cart cart);

    @Select("select maxNum from cart where userId=#{user_id} and productId=#{product_id}")
    Integer queryCartMaxNum(Cart cart);

    @Insert("insert into cart(userId,productId) values(user_id,product_id)")
     void creatCart(Cart cart);

    @Delete("delete from cart where userId=#{userId} and productId=#{productId}")
    void deleteCart(int userId,int productId);

    @Select("select product.*,cart.* from cart,product where cart.userId=#{id} and cart.productId=product.productId")
    List<CartDto> showCarts(int id);

    @Update("update cart set num=#{num}")
    void updateCart(int num);
}
