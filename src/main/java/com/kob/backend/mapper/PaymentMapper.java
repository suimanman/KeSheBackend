package com.kob.backend.mapper;

import com.kob.backend.dto.ordersDto;
import com.kob.backend.dto.paymentDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface PaymentMapper {

    @Select("select orders.*,discountPrice,num from orders,product"
            +" where orders.productId=product.productId and orders.orderNum=#{orderNum}")
    ordersDto findById(Integer orderNum);

    @Select("select payUrl from payment where payType=#{payType}")
    String findByType(String payType);

}
