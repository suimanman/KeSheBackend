package com.kob.backend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kob.backend.dto.ordersDto;
import com.kob.backend.pojo.orders;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

@Mapper
public interface OrderMapper extends BaseMapper<orders> {

    @Select("select orders.*,  product.discountPrice ,product.imgPath ,product.name,product.productId " +
            "from orders, product where orders.productId = product.productId and orders.userId = #{UserID}")
    List<ordersDto> findById(String UserID);

    @Insert("insert into orders values(orders.user_id,orders.product_id,order.num,orders.order_num,orders.address_name,orders.address_phone,orders.type)")
    void save(orders order);


}

