package com.example.ribbonfeign.configuration;

import com.example.ribbonfeign.feign.ClientFeign;
import org.springframework.stereotype.Component;

@Component
public class FeignHystrix implements ClientFeign {

    @Override
    public String hi(String name) {
        return "hi," +name+",sorry ,error!";
    }

    @Override
    public void delUserById(int id) {

    }
}
