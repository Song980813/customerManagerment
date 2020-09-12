package com.huayu.management.service;

import com.huayu.management.entity.TbContract;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 合同表
 服务类
 * </p>
 *
 * @author Song
 * @since 2020-09-02
 */
public interface ITbContractService extends IService<TbContract> {
    //查询全部的合同    传的值是下拉框选中的值和文本框输入的值刚开始的时候让他查询全部
    public List<TbContract> selectall(String xiala,String shuru);

}
