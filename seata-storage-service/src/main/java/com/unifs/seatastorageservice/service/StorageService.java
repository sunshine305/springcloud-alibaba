package com.unifs.seatastorageservice.service;

import com.unifs.seatastorageservice.bean.Storage;
import com.unifs.seatastorageservice.dao.StorageDAO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @version V1.0
 * @title: AccountService
 * @projectName springcloud-alibaba
 * @description: TODO
 * @author： 张恭雨
 * @date 2020/12/24 11:04
 */
@Service
public class StorageService {
    @Resource
    private StorageDAO storageDAO;

    /**
     * 减库存
     *
     * @param commodityCode
     * @param count
     */
    @Transactional(rollbackFor = Exception.class)
    public void deduct(String commodityCode, int count) {
        if (commodityCode.equals("product-2")) {
            throw new RuntimeException("异常:模拟业务异常:Storage branch exception");
        }
        Storage storage = storageDAO.selectByCode(commodityCode);
        storage.setCount(storage.getCount() - count);
        storageDAO.update(storage);
    }
}
