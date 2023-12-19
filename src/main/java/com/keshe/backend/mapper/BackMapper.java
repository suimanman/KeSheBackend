package com.keshe.backend.mapper;

import com.keshe.backend.dto.BackNumDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BackMapper {

    @Select("select month(createdAt) AS month, count(*) as num from orders where year(createdAt)=2023 group BY month(createdAt)")
    List<BackNumDto> queryOrderNum();


}
