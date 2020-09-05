package com.huayu.management.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.huayu.management.bo.LayuiEntity;
import com.huayu.management.entity.TbCustomer;

/**
 * <p>
 * 客户表 服务类
 * </p>
 *
 * @author Song
 * @since 2020-09-02
 */
public interface ITbCustomerService extends IService<TbCustomer> {

  LayuiEntity selequu(Integer page,Integer limit);
}
