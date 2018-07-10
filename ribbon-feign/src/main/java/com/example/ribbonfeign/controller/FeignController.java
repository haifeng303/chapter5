package com.example.ribbonfeign.controller;

import com.example.common.exception.GlobepaysException;
import com.example.ribbonfeign.dao.RoleDao;
import com.example.ribbonfeign.feign.ClientFeign;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/feign")
@Api(tags = "feign",description = "feign调用")
public class FeignController {
    @Autowired
    ClientFeign clientFeign;
    @Autowired
    RoleDao roleDao;

    @GetMapping("/hi")
    @ApiOperation("测试调用eurekaclient服务的hi方法")
    public String hi(@ApiParam(required = false, value = "name", defaultValue = "forezp") @RequestParam String name){
        return clientFeign.hi(name);
    }
    @DeleteMapping("/delRoleById")
    @ApiOperation("根据id删除角色和用户")
    @ResponseStatus(code = HttpStatus.OK, reason = "删除成功")
    @Transactional
    public void delRoleById(@RequestParam(value = "id",required = true) int id){
        try{
            roleDao.delRoleById(id);
            int i = 100/0;
            clientFeign.delUserById(id);
        }catch (Exception e){
            throw new GlobepaysException("根据用户id删除用户失败");
        }

    }
}
