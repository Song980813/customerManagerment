package com.huayu.management.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.huayu.management.bo.LayuiEntity;
import com.huayu.management.entity.TbAftersale;
import com.huayu.management.service.ITbAftersaleService;
import com.huayu.management.service.ITbEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 售后服务表 前端控制器
 * </p>
 *
 * @author Song
 * @since 2020-09-02
 */
@RestController
@RequestMapping("/management/tb-aftersale")
public class TbAftersaleController {
    @Autowired
    ITbAftersaleService aftersaleService;

    @RequestMapping("selectall")
    public LayuiEntity queryAll(Integer page,Integer limit,TbAftersale tbAftersale){
        return aftersaleService.selectAll(page,limit,tbAftersale);
    }

}
