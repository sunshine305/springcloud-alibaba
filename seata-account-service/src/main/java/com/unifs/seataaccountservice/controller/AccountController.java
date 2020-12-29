package com.unifs.seataaccountservice.controller;


import com.unifs.seataaccountservice.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * Program Name: springcloud-nacos-seata
 * <p>
 * Description:
 * <p>
 *
 * @author zhangjianwei
 * @version 1.0
 * @date 2019/8/28 4:05 PM
 */
@RestController
@RequestMapping("account")
public class AccountController {
    @Autowired
    private AccountService accountService;


    @GetMapping(value = "/reduce")
    public void reduce(String userId, BigDecimal money) {
        accountService.reduce(userId, money);
    }
}
