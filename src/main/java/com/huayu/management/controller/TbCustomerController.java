package com.huayu.management.controller;

import com.huayu.management.bo.LayuiEntity;
import com.huayu.management.service.ITbCustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import java.io.IOException;

/**
 * <p>
 * 客户表 前端控制器
 * </p>
 *
 * @author Song
 * @since 2020-09-02
 */
@RestController
@RequestMapping("/management/tb-customer")
public class TbCustomerController {
    private ITbCustomerService tbCustomerService;

    @GetMapping("/selecrm.do")
    @ResponseBody
    public LayuiEntity query(Integer page, Integer limit) throws IOException, ServletException {
        tbCustomerService.selequu(page,limit);
        System.out.println("===================");

        return null;
    }
}
