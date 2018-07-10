package com.example.eurekaclient.sample;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.JobHandler;
import org.springframework.stereotype.Component;

/**
 * @author haifeng
 * @date 2018/7/5 10:25
 */
@JobHandler(value = "testHandler")
@Component
public class TestJobHandler extends IJobHandler {
    @Override
    public ReturnT<String> execute(String param) throws Exception {
        System.out.println("hello world");
        return ReturnT.SUCCESS;
    }
}
