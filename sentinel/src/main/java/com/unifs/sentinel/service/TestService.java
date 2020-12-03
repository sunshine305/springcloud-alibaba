package com.unifs.sentinel.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Service;

/**
 * @version V1.0
 * @title: TestService
 * @projectName springcloud-alibaba
 * @description: TODO
 * @author： 张恭雨
 * @date 2020/12/3 14:44
 */
@Service
public class TestService {

    @SentinelResource(value = "sayHello")
    public String sayHello(String name) {
        return "Hello, " + name;
    }
}
