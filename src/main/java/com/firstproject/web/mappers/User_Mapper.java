package com.firstproject.web.mappers;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface User_Mapper {
@Insert("Insert into indexlog VALUES(#{userAddress},#{execDateTime})")
    int insertConnection_Log(@Param("userAddress") String userAddress,
                             @Param("execDateTime")String execDateTime);
}
