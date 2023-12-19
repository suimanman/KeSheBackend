package com.keshe.backend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.keshe.backend.dto.OrderDto;
import com.keshe.backend.pojo.Address;
import com.keshe.backend.pojo.Order;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface OrderMapper extends BaseMapper<Order> {


    @Select("select distinct orders.*, address.addressName, product.discountPrice ,product.imgPath ,product.name,product.productId " +
            "from orders, product,address where address.userId=#{UserID} and orders.productId = product.productId and orders.userId = #{UserID}")
    List<OrderDto> findById(Integer UserID);

    @Insert("insert into orders(userId,productId,num,type,createdAt,addressId) values(#{userId},#{productId},#{num},1,#{createdAt},#{addressId})")
    void save(Order order);

    @Delete("delete from orders where userId=#{userId} and productId=#{productId}")
    void delete(int userId,int productId);

    @Update("update orders set type=2 where orderNum=#{orderNum}")
    void updateOrder(String orderNum);
}

