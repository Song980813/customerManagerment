package com.huayu.management.service.impl;

import com.huayu.management.entity.TbContract;
import com.huayu.management.mapper.TbContractMapper;
import com.huayu.management.service.ITbContractService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 合同表
 服务实现类
 * </p>
 *
 * @author Song
 * @since 2020-09-02
 */
@Service
public class TbContractServiceImpl extends ServiceImpl<TbContractMapper, TbContract> implements ITbContractService {
    @Autowired
    private TbContractMapper tbContractMapper;
    //查询全部的合同
    @Override
    public List<TbContract> selectall(String xiala,String shuru){
    List<TbContract> list=tbContractMapper.selectList(null);
    return  list;
}
}
