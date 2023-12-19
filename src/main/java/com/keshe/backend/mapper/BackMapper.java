package com.keshe.backend.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BackMapper {

//    @Select("select month(updatedAt) as month,count(orderNum) as quantity from orders where year(updatedAt)=year(curDate)"+
//    "group by month(updatedAt) order by(updatedAt)")
}
