package com.firstproject.web.repository;

import com.firstproject.web.models.indexlog;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface Mapper_User {
    @Insert("Insert into indexlog VALUES(#{userAddress},#{execDateTime})")
    int insertConnection_Log(@Param("userAddress") String userAddress,
                             @Param("execDateTime") String execDateTime);

    @Insert("Insert into users VALUES(#{userAccount}, #{userPassword}, #{userName}, #{userGender}, #{userEmail})")
    int insertUserInfo(
                       @Param("userAccount") String userAccount,
                       @Param("userPassword") String userPassword,
                       @Param("userName") String userName,
                       @Param("userGender") String userGender,
                       @Param("userEmail") String userEmail);

}