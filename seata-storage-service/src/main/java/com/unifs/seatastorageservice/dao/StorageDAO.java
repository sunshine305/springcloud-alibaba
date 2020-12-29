package com.unifs.seatastorageservice.dao;



import com.unifs.seatastorageservice.bean.Storage;
import com.unifs.seatastorageservice.common.BaseMapper;
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
public interface StorageDAO extends BaseMapper<Storage> {

    Storage selectByCode(String code);

}
