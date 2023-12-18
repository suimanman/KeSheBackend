package com.keshe.backend.mapper;

import com.keshe.backend.dto.OrderDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface PaymentMapper {

    @Select("select orders.*,discountPrice,num from orders,product"
            +" where orders.productId=product.productId and orders.orderNum=#{orderNum}")
    OrderDto findById(Integer orderNum);

    @Select("select payUrl from payment where payType=#{payType}")
    String findByType(String payType);

}
