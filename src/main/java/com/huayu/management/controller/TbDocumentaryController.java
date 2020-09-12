package com.huayu.management.controller;


import com.huayu.management.bo.DocuTheme;
import com.huayu.management.bo.LayuiEntity;
import com.huayu.management.entity.TbBusiness;
import com.huayu.management.entity.TbDocumentary;
import com.huayu.management.service.ITbBusinessService;
import com.huayu.management.service.ITbDocumentaryService;
import com.huayu.management.service.impl.TbDocumentaryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.context.Theme;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.crypto.Data;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * <p>
 * 跟单表 前端控制器
 * </p>
 *
 * @author Song
 * @since 2020-09-02
 */
@Controller
@RequestMapping("/management/tb-documentary")
public class TbDocumentaryController {
    @Autowired
    private ITbBusinessService businessService;
    @Autowired
    private ITbDocumentaryService iTbDocumentaryService;


    //查询商机的商机名放在添加跟单的下拉框李
//    @RequestMapping("selectname")
//    @ResponseBody
//    public List<TbBusiness> queryAll(){
//      List<TbBusiness> list=businessService.list();
//      return list;
//    }

    @RequestMapping("selectname")
    @ResponseBody
    public List<DocuTheme> selectname(){
        List<DocuTheme> list=iTbDocumentaryService.slecttheme();
        return list;
    }


    /*添加跟单*/
    @RequestMapping("/adddoc.do")
    @ResponseBody
    public LayuiEntity adddocumentary(TbDocumentary documentary){
        return iTbDocumentaryService.add(documentary);
 }


// 查询全部跟单
    @RequestMapping("slelectdousumenta")
    @ResponseBody
    public LayuiEntity slelectdousumenta(String xiala,String shuru){
        List<TbDocumentary> list= iTbDocumentaryService.selectall(xiala,shuru);
       LayuiEntity la=new LayuiEntity();
       la.setCode(0);
       la.setMsg("查询成功");
       la.setCount(list.size());
       la.setData(list);
       return la;
    }

    //查询我得跟单
    @RequestMapping("selectdoucumentarty")
    @ResponseBody
    public void selectdoucumentarty(){
    }



}