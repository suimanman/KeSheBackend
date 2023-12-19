package com.keshe.backend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.keshe.backend.pojo.Address;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AddressMapper extends BaseMapper<Address> {
    @Select("select * from address where userId=#{id}")
    List<Address> getAddress(int id);

    @Insert("insert into address(userId,addressName,addressPhone,address) values(#{userId},#{addressName},#{addressPhone},#{address})")
    void insertAddress(Address address);
}
