package com.huayu.management.controller;

import com.huayu.management.bo.LayuiEntity;
import com.huayu.management.entity.TbBusiness;
import com.huayu.management.service.ITbBusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * <p>
 * 商机表
 前端控制器
 * </p>
 *
 * @author Song
 * @since 2020-09-02
 */
@RestController
@RequestMapping("/management/tb-business")
public class TbBusinessController {

    @Autowired
    private ITbBusinessService iTbBusinessService;




    @GetMapping("/selebuin.do")
    @ResponseBody
    public LayuiEntity selebuin(Integer page, Integer limit, TbBusiness tbBusiness,String yhxm){
        System.out.println("当前条件商机负责人"+yhxm);
        LayuiEntity layuiEntity= iTbBusinessService.selebuin(page,limit,tbBusiness,yhxm);
        return layuiEntity;
    }

    @GetMapping("/addbusin.do")
    public ModelAndView addbusin( TbBusiness tbBusiness,ModelAndView modelAndView){
        System.out.println("当前走添加方法");
       boolean i=iTbBusinessService.save(tbBusiness);
       System.out.println("當前添加狀態"+i);
        modelAndView.setViewName("/customer/custmergl.html");
        return modelAndView;
    }

}
