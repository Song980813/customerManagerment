package com.huayu.management.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.huayu.management.bo.LayuiEntity;
import com.huayu.management.entity.TbAftersale;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 售后服务表 服务类
 * </p>
 *
 * @author Song
 * @since 2020-09-02
 */
public interface ITbAftersaleService extends IService<TbAftersale> {
    LayuiEntity selectAll(Integer page,Integer limit,TbAftersale tbAftersale);
}
