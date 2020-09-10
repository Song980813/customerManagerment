package com.huayu.management.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.huayu.management.bo.CustomerUtlis;
import com.huayu.management.bo.LayuiEntity;
import com.huayu.management.entity.*;
import com.huayu.management.mapper.*;
import com.huayu.management.service.ITbCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 客户表 服务实现类
 * </p>
 *
 * @author Song
 * @since 2020-09-02
 */
@Service
public class TbCustomerServiceImpl extends ServiceImpl<TbCustomerMapper, TbCustomer> implements ITbCustomerService {
    @Autowired
    public TbCustomerMapper tbCustomerMapper;
    @Autowired
    public TbBusinessMapper tbBusinessMapper;
    @Autowired
    public TbContractMapper tbContractMapper;
    @Autowired
    public TbIncomeMapper tbIncomeMapper;
    @Autowired
    public TbAftersaleMapper tbAftersaleMapper;

    @Override
    public LayuiEntity selequu(Integer page, Integer limit,String classification,String pinyin) {
        Page page1=new Page(page,limit);
        QueryWrapper queryWrapper = new QueryWrapper();
        if(pinyin=="" || pinyin==null){
            queryWrapper=null;
        }else {
            queryWrapper.like(classification,pinyin);
        }
        Page page2 = tbCustomerMapper.selectPage(page1,queryWrapper);//查询客户
        List<TbCustomer> list1 = page2.getRecords();
        List<CustomerUtlis> list9 = new ArrayList();
        for (TbCustomer page3 : list1) {
            CustomerUtlis customerUtlis = new CustomerUtlis();
            QueryWrapper queryWrapper1 = new QueryWrapper();
            queryWrapper1.eq("cid", page3.getCid());
            List<TbBusiness> list2 = tbBusinessMapper.selectList(queryWrapper1);
            int yj = 0;
            for (TbBusiness list11 : list2) {
                if(list11.getAmount()==null){
                    yj=0;
                }else {
                yj += list11.getAmount();
            }
            }
            List<TbContract> list3 = tbContractMapper.selectList(queryWrapper1);//去根据客户id查询合同
            int htje = 0;
            float sr = 0;
            int fwpf = 0;
            int fwpff=0;
            List<TbAftersale> list5 = null;
             int fwcs=0;
            for (TbContract list : list3) {                //循环查询出来的合同
                htje += list.getSum();
                String htbh = list.getContractCode();//拿到合同的编号在去收入记录表去查询
                QueryWrapper queryWrapper3 = new QueryWrapper();
                queryWrapper3.eq("acsdgual", htbh);
                List<TbIncome> list4 = tbIncomeMapper.selectList(queryWrapper3);
                for (TbIncome list7 : list4) {
                    sr += list7.getIncomeamount();//拿到输入金额
                }
                QueryWrapper queryWrapper4 = new QueryWrapper();
                queryWrapper4.eq("contractno",htbh);
                list5 = tbAftersaleMapper.selectList(queryWrapper4);
                for (TbAftersale lis6 : list5) {
                    fwcs+=1;
                    fwpf = lis6.getSerrating();//服务评分
                }
                fwpff=fwpf/list5.size();
            }
            customerUtlis.setShfwnum(fwcs);//售后服务次数
            customerUtlis.setFwjf(fwpff);//服务均分
            customerUtlis.setHkmoney(sr);//回款金额
            customerUtlis.setHtnum(list3.size());//合同数量
            customerUtlis.setHtmoney(htje);//合同金额
            customerUtlis.setYjmoney(yj);//预计成交金额
            customerUtlis.setBuinsnum(list2.size());//商机数量
            customerUtlis.setKname(page3.getCustomerName());//客户名称
            customerUtlis.setKid(page3.getCid());//客户id
            list9.add(customerUtlis);
        }
        LayuiEntity layuiEntity = new LayuiEntity();
        layuiEntity.setCode(0);
        layuiEntity.setMsg("查询成功");
        layuiEntity.setCount(list9.size());
        layuiEntity.setData(list9);
        return layuiEntity;
    }

    @Override
    public Integer update1(TbCustomer tbCustomer) {
        return tbCustomerMapper.updateById(tbCustomer);

    }

}
