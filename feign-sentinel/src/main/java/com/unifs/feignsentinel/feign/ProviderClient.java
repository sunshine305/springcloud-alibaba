package com.unifs.feignsentinel.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @version V1.0
 * @title: ProviderClient
 * @projectName springcloud-alibaba
 * @description: TODO
 * @author： 张恭雨
 * @date 2020/12/3 15:53
 */

@FeignClient("nacos-sentinel")
public interface ProviderClient {

    @GetMapping("/hello")
    String hello(@RequestParam(value = "name",required = true) String name);
}
