package com.huayu.management.controller;


import com.huayu.management.bo.LayuiEntity;
import com.huayu.management.entity.TbContract;
import com.huayu.management.entity.TbCustomer;
import com.huayu.management.service.ITbContractService;
import com.huayu.management.service.ITbCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 合同表
 前端控制器
 * </p>
 *
 * @author Song
 * @since 2020-09-02
 */
@Controller
@RequestMapping("/management/tb-contract")
public class TbContractController {
  @Autowired
  private ITbContractService iTbContractService;
  @Autowired
    private ITbCustomerService iTbCustomerService;


//  查询客户的名称赋值给合同添加的下拉框里面
  @RequestMapping("selectcustomer")
  @ResponseBody
    public List<TbCustomer> selectcustomer(){
    List<TbCustomer>list=iTbCustomerService.list();
    return list;
  }
//根据客户的名称查询客户信息放在客户信息里面
  @RequestMapping("selectcyst")
  @ResponseBody
    public TbCustomer selectcyst(Integer cid){
    System.out.println(cid);
    TbCustomer tb=iTbCustomerService.getById(cid);
    return  tb;
  }
  //添加合同
  @RequestMapping("addcontract")
  @ResponseBody
  public LayuiEntity addcontract(TbContract contract){
  Boolean la= iTbContractService.save(contract);
  LayuiEntity lay=new LayuiEntity();
  if (la==false){
    lay.setCode(1);
    lay.setMsg("添加成功");
  }else {
    lay.setCode(2);
    lay.setMsg("添加失败");
  }
    return lay;
  }
//查询全部合同
   @RequestMapping("selectall")
  @ResponseBody
  public LayuiEntity selctall(String xiala,String shuru){
    List<TbContract>list= iTbContractService.list();
    LayuiEntity la=new LayuiEntity();
     la.setCode(0);
     la.setMsg("查询成功");
     la.setCount(list.size());
     la.setData(list);
     return  la;
   }
}
