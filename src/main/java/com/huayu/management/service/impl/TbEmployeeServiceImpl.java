package com.huayu.management.service.impl;

import com.huayu.management.entity.TbEmployee;
import com.huayu.management.mapper.TbEmployeeMapper;
import com.huayu.management.service.ITbEmployeeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 员工表 服务实现类
 * </p>
 *
 * @author Song
 * @since 2020-09-02
 */
@Service
public class TbEmployeeServiceImpl extends ServiceImpl<TbEmployeeMapper, TbEmployee> implements ITbEmployeeService {

}
