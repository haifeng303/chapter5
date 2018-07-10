package com.example.eurekaclient.controller;

import com.example.common.exception.GlobepaysException;
import com.example.eurekaclient.dao.UserDao;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@Api(tags = "user",description = "操作用户表")
public class ClientController {
    @Autowired
    UserDao userDao;
    @Value("${my.name}")
    private int testGetData;

    @GetMapping("/hi")
    @ApiOperation("测试")
    public String hi(@RequestParam String name){
        System.out.println("测试:"+testGetData);
        return name;
    }

    @DeleteMapping("/delUserById")
    @ApiOperation("根据id删除用户")
    @ResponseStatus(code = HttpStatus.OK, reason = "删除成功")
    @Transactional
    public void delUserById(@RequestParam(value = "id",required = true) int id){
        try{
            userDao.delUserById(id);
        }catch (Exception e){
            throw new GlobepaysException("根据用户id删除用户失败");
        }

    }

}
