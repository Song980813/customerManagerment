package com.huayu.management.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.huayu.management.bo.Counts;
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
    public LayuiEntity queryAll(Integer page,Integer limit, String no, String title,String s){
        System.out.println(no+title+s);
        return aftersaleService.selectAll(page,limit,no,title,s);
    }

    @RequestMapping("addnew")
    @ResponseBody
    public LayuiEntity save1(TbAftersale aftersale){
        LayuiEntity i=aftersaleService.afterAdd(aftersale);
         return i;
    }
    @RequestMapping("addnew2")
    @ResponseBody
    public LayuiEntity save2(TbAftersale aftersale){
        LayuiEntity i=aftersaleService.afterAdd1(aftersale);
        return i;
    }
    @RequestMapping("addnew3")
    @ResponseBody
    public LayuiEntity save3(TbAftersale aftersale){
        LayuiEntity i=aftersaleService.afterAdd2(aftersale);
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
    @RequestMapping("selecttime")
    @ResponseBody
    public LayuiEntity selectTime(Integer page,Integer limit, String date){
        return aftersaleService.selectDate(page,limit,date);
    }
    @RequestMapping("update1")
    @ResponseBody
    public LayuiEntity update1(TbAftersale tbAftersale){
        return aftersaleService.update(tbAftersale);
    }
    @RequestMapping("update2")
    @ResponseBody
    public LayuiEntity update2(TbAftersale tbAftersale){
        return aftersaleService.update(tbAftersale);
    }

    @RequestMapping("selectcount")
    @ResponseBody
    public Counts selectCount(){
        return aftersaleService.queryCount();
    }
}
