package com.huayu.management.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.huayu.management.bo.Counts;
import com.huayu.management.bo.LayuiEntity;
import com.huayu.management.entity.TbAftersale;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

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
     *售后服务查询 各种条件
     * @param page 当前页
     * @param limit 每页多少行
     * @param no 分类查询条件
     * @param title 条件参数
     * @param s 状态条件
     * @return
     */
    LayuiEntity selectAll(Integer page,Integer limit,String no, String title, String s );

    /**
     *新增售后服务详情初始状态
     * @return 返回0失败 >0成功
     */
    LayuiEntity afterAdd(TbAftersale aftersale);
    /**
     *新增售后服务详情处理中状态
     * @return 返回0失败 >0成功
     */
    LayuiEntity afterAdd1(TbAftersale aftersale);
    /**
     *新增售后服务详情已完成状态
     * @return 返回0失败 >0成功
     */
    LayuiEntity afterAdd2(TbAftersale aftersale);
    /**
     *查询最新一条数据
     * @return 返回0失败 >0成功
     */
    TbAftersale queryNew();

    /**
     *查询某一时间段的售后服务
     * @return
     */
    LayuiEntity selectDate(Integer page,Integer limit, String date);
    /**
     *修改状态
     * @return
     */
    LayuiEntity update(TbAftersale tbAftersale);
    /**
     *修改状态
     * @return
     */
    LayuiEntity update1(TbAftersale tbAftersale);
    /**
     *查询各项数量
     * @return
     */
    Counts queryCount();
}
