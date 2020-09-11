package com.huayu.management.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.huayu.management.entity.TbEmployee;
import com.huayu.management.mapper.TbEmployeeMapper;
import com.huayu.management.service.ITbEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 员工表 服务实现类
 * </p>
 *
 * @author Song
 * @since 2020-09-02
 */
@Service
@Transactional
public class TbEmployeeServiceImpl extends ServiceImpl<TbEmployeeMapper, TbEmployee> implements ITbEmployeeService {
    @Autowired
   private TbEmployeeMapper tbEmployeeMapper;

    @Override
    public Integer addlog(TbEmployee tbEmployee){

           return tbEmployeeMapper.insert(tbEmployee);

    }
}
