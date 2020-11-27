package com.unifs.globalconfig.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version V1.0
 * @title: ConfigController
 * @projectName springcloud-alibaba
 * @description: TODO
 * @author： 张恭雨
 * @date 2020/11/26 10:12
 */
@RestController
@RequestMapping("/config")
@RefreshScope
public class ConfigController {

    @Value("${bookname:00}")
    private String bookname;

    @RequestMapping("/get")
    public String get() {
        return bookname;
    }
}
