package com.huayu.management.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.huayu.management.bo.LayuiEntity;
import com.huayu.management.entity.TbAftersale;
import com.huayu.management.service.ITbAftersaleService;
import com.huayu.management.service.ITbEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;
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
@Controller
@RequestMapping("/management/tb-aftersale")
public class TbAftersaleController {
    @Autowired
    ITbAftersaleService aftersaleService;

    @RequestMapping("selectall")
    @ResponseBody
    public LayuiEntity queryAll(Integer page,Integer limit, Integer no, String title){
        return aftersaleService.selectAll(page,limit,no,title);
    }

    @RequestMapping("addnew")
    @ResponseBody
    public LayuiEntity save(TbAftersale aftersale){
        LayuiEntity i=aftersaleService.afterAdd(aftersale);
         return i;
    }

    @RequestMapping("queryone")
    public String queryOne(Model model){
        TbAftersale tbafter=aftersaleService.queryNew();
        model.addAttribute("after",tbafter);
        return "/song/aftersaledetails.html";
    }

    @RequestMapping("selectone")
    public String selectOne(Integer id,Model model){
        //model.addAttribute("after",aftersaleService.getById(id));
        return "/song/aftersaledetails.html";
    }
}
