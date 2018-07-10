package com.example.ribbonfeign.feign;

import com.example.ribbonfeign.configuration.FeignConfig;
import com.example.ribbonfeign.configuration.FeignHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-client",configuration = FeignConfig.class,fallback = FeignHystrix.class)
@Component
public interface ClientFeign {
    @GetMapping("/hi")
    public String hi(@RequestParam("name") String name);
    @DeleteMapping("/delUserById")
    public void delUserById(@RequestParam(value = "id") int id);
}
