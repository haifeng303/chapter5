package com.example.eurekaclient.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface UserDao {
    int delUserById(@Param("id")int id);
}
