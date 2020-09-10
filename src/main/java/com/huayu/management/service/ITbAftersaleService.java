package com.huayu.management.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.huayu.management.bo.LayuiEntity;
import com.huayu.management.entity.TbAftersale;

/**
 * <p>
 * 售后服务表 服务类
 * </p>
 *
 * @author Song
 * @since 2020-09-02
 */
public interface ITbAftersaleService extends IService<TbAftersale> {
    /**
     *售后服务详情查询
     * @param page 当前页
     * @param limit 每页多少行
     * @param no 分类查询条件
     * @param title 条件参数
     * @return
     */
    LayuiEntity selectAll(Integer page,Integer limit,Integer no, String title );

    /**
     *新增售后服务详情
     * @return 返回0失败 >0成功
     */
    LayuiEntity afterAdd(TbAftersale aftersale);
    /**
     *查询最新一条数据
     * @return 返回0失败 >0成功
     */
    TbAftersale queryNew();
}
