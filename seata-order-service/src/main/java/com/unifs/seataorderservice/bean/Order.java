package com.unifs.seataorderservice.bean;



import lombok.Data;
import lombok.experimental.Accessors;

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
@Data
@Accessors(chain = true)
public class Order {
  private Integer id;
  private String userId;
  private String commodityCode;
  private Integer count;
  private BigDecimal money;

}
