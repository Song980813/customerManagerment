package com.huayu.management.controller;

import com.huayu.management.bo.LayuiEntity;
import com.huayu.management.entity.TbCustomer;
import com.huayu.management.service.ITbCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * <p>
 * 客户表 前端控制器
 * </p>
 *
 * @author Song
 * @since 2020-09-02
 */
@Controller
@RequestMapping("/management/tb-customer")
public class TbCustomerController {
    @Autowired
    private ITbCustomerService tbCustomerService;

    @GetMapping("/selecrm.do")
    @ResponseBody
    public LayuiEntity query(Integer page, Integer limit,  String classification, String pinyin){
        LayuiEntity layuiEntity=tbCustomerService.selequu(page,limit,classification,pinyin);
         return layuiEntity;
    }
    @GetMapping("/selekhByid.do")
    public ModelAndView querybyid(int kid, Model model , ModelAndView modelAndView){
        TbCustomer layuiEntity=tbCustomerService.getById(kid);
        modelAndView.addObject("seleid",layuiEntity);
        modelAndView.setViewName("/customer/Upacustomer.html");
        return  modelAndView;
    }
    @GetMapping("/zzupdata.do")
    public String zzupdata(TbCustomer tbCustomer ,ModelAndView modelAndView) throws Exception {
        tbCustomerService.update1(tbCustomer);
        return "/customer/custmergl.html";
    }

    @GetMapping("/addcrm.do")
    public ModelAndView addcrm(TbCustomer tbCustomer,ModelAndView modelAndView){
        System.out.println("当前走添加方法");
        boolean i=tbCustomerService.save(tbCustomer);
        System.out.println("结果集"+i);
        modelAndView.setViewName("/customer/custmergl.html");
        return modelAndView;
    }
    @GetMapping("/delta.do")
    public ModelAndView delta(int cid,ModelAndView modelAndView){
        System.out.println("当前id"+cid);
        boolean i=tbCustomerService.removeById(cid);
        System.out.println("当前状态"+i);
        modelAndView.setViewName("/customer/custmergl.html");
        return modelAndView;

    }
}
