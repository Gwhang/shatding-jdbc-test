package com.example.shatdingspringbootmybatisgenerator01.mapper;

import com.example.shatdingspringbootmybatisgenerator01.entity.Address;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AddressMapper {

    /**
     * 保存
     */
    void save(Address address);

    /**
     * 查询
     * @param id
     * @return
     */
    Address get(Long id);

}
