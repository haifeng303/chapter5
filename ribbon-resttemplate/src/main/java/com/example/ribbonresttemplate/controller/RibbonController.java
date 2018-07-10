package com.example.ribbonresttemplate.controller;

import com.netflix.discovery.converters.Auto;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RequestMapping("/api/ribbon")
@Api(tags = "负载均衡restTemplate应用", description = "ribbon-restTemplate测试")
@RestController
public class RibbonController {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("/hi")
    @HystrixCommand(fallbackMethod = "error")
    public String hi(@ApiParam(required = false, value = "name", defaultValue = "forezp") @RequestParam String name){
        return restTemplate.getForObject("http://eureka-client/hi?name="+ name,String.class);
    }
    @GetMapping("/testRibbon")
    public String testRibbon(){
        ServiceInstance serviceInstance = loadBalancerClient.choose("eureka-client");
        return serviceInstance.getHost()+":"+serviceInstance.getPort();
    }
    public String error(String name){
        return "hi," +name+",sorry ,error!";
    }
}
