package com.unifs.seatastorageservice.common;

import java.util.List;

/**
 * @version V1.0
 * @title: BaseMapper
 * @projectName springcloud-alibaba
 * @description: TODO
 * @author： 张恭雨
 * @date 2020/12/23 16:09
 */
public interface BaseMapper<T> {
    int insert(T t);
    int update(T t);
    List<T> selectAll();
    int delete(String id);

}
