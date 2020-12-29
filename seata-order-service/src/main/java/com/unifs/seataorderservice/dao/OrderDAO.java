package com.unifs.seataorderservice.dao;


import com.unifs.seataorderservice.bean.Order;
import com.unifs.seataorderservice.common.BaseMapper;
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
public interface OrderDAO extends BaseMapper<Order> {

}
