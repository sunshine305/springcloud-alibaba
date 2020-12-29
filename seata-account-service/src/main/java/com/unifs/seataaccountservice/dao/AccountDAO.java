package com.unifs.seataaccountservice.dao;


import com.unifs.seataaccountservice.bean.Account;
import com.unifs.seataaccountservice.common.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

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
@Mapper
@Repository
public interface AccountDAO extends BaseMapper<Account> {

    Account selectByUserId(String userId);

}
