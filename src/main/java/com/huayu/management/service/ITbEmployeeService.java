package com.huayu.management.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.huayu.management.entity.TbEmployee;

/**
 * <p>
 * 员工表 服务类
 * </p>
 *
 * @author Song
 * @since 2020-09-02
 */

public interface ITbEmployeeService extends IService<TbEmployee> {

    Integer addlog(TbEmployee tbEmployee);

}
