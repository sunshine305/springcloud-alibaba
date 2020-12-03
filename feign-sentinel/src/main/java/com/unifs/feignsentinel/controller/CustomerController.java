package com.unifs.feignsentinel.controller;

import com.unifs.feignsentinel.feign.ProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version V1.0
 * @title: CustomerController
 * @projectName springcloud-alibaba
 * @description: TODO
 * @author： 张恭雨
 * @date 2020/12/3 16:01
 */
@RestController
public class CustomerController {
    @Autowired
    ProviderClient providerClient;

    @GetMapping(value = "/hellofeign")
    public String helloFeign() {
        return providerClient.hello("feign");
    }
}
