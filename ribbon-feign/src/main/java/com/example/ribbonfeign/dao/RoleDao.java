package com.example.ribbonfeign.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface RoleDao {
    public int delRoleById(@Param("id") int id);
}
