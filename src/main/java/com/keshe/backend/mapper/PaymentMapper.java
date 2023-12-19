package com.keshe.backend.mapper;

import com.keshe.backend.dto.OrderDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PaymentMapper {

//    @Select("select orders.*,discountPrice,num from orders,product"
//            +" where orders.productId=product.productId and orders.orderNum=#{orderNum}")
//    OrderDto findById(Integer orderNum);

    @Select("select payUrl from payment where payType=#{payType}")
    String findByType(String payType);

    @Select("select orders.*, address.addressName,address.addressPhone,address.address, product.discount_price ,product.img_path ,product.name,product.product_id " +
            "from orders, product,address where address.userId=orders.userId and orders.productId = product.product_id and orders.orderNum = #{id} and orders.addressId=address.id")
    OrderDto findById(Integer id);
}
