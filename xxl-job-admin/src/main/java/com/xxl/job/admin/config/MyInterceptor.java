package com.xxl.job.admin.config;

import com.xxl.job.admin.controller.interceptor.CookieInterceptor;
import com.xxl.job.admin.controller.interceptor.PermissionInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author haifeng
 * @date 2018/7/2 16:08
 */
@Configuration
public class MyInterceptor extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //super.addInterceptors(registry);
        System.out.println("进入连个拦击器");
        registry.addInterceptor(new PermissionInterceptor()).addPathPatterns("/**").excludePathPatterns("/static");
        registry.addInterceptor(new CookieInterceptor()).addPathPatterns("/**").excludePathPatterns("/static");
        System.out.println("执行连个拦击器");
    }
}
