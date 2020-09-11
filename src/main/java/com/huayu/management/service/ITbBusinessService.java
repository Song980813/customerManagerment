package com.huayu.management.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.huayu.management.bo.LayuiEntity;
import com.huayu.management.entity.TbBusiness;

/**
 * <p>
 * 商机表
 服务类
 * </p>
 *
 * @author Song
 * @since 2020-09-02
 */
public interface ITbBusinessService extends IService<TbBusiness> {


    LayuiEntity selebuin(int page, int limit, TbBusiness tbBusiness,String yhxm);
}
