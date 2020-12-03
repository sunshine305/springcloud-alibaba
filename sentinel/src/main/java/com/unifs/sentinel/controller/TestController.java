package com.unifs.sentinel.controller;

import com.unifs.sentinel.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version V1.0
 * @title: TestController
 * @projectName springcloud-alibaba
 * @description: TODO
 * @author： 张恭雨
 * @date 2020/12/3 14:42
 */
@RestController
public class TestController {

    @Autowired
    private TestService service;

    @GetMapping(value = "/hello")
    public String apiHello(String name) {
        return service.sayHello(name);
    }
}