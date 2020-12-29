package com.unifs.seataaccountservice.service;

import com.unifs.seataaccountservice.bean.Account;
import com.unifs.seataaccountservice.dao.AccountDAO;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @version V1.0
 * @title: AccountService
 * @projectName springcloud-alibaba
 * @description: TODO
 * @author： 张恭雨
 * @date 2020/12/24 11:04
 */
@Service
public class AccountService {
    @Autowired
    private AccountDAO accountDAO;

    /**
     * 账户余额扣减
     *
     * @return boolean
     * @author 张恭雨
     * @date 2020/12/24
     * @params [userId, money]
     */
    public boolean reduce(String userId, BigDecimal money) {
        Account account = accountDAO.selectByUserId(userId);
        //验证余额是否足够
        if (account.getMoney().subtract(money).intValue() < 0) {
            return false;
        }
        account.setMoney(account.getMoney().subtract(money));
        int flag = accountDAO.update(account);
        return false;
    }
}
