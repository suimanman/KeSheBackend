package com.keshe.backend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.keshe.backend.dto.OrderDto;
import com.keshe.backend.pojo.Order;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface OrderMapper extends BaseMapper<Order> {

    @Select("select orders.*,  product.discountPrice ,product.imgPath ,product.name,product.productId " +
            "from orders, product where orders.productId = product.productId and orders.userId = #{UserID}")
    List<OrderDto> findById(String UserID);

    @Insert("insert into orders values(orders.user_id,orders.product_id,orders.num,orders.order_num,orders.address_name,orders.address_phone,orders.type)")
    void save(Order order);


}

