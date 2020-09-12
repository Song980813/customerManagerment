package com.huayu.management.service.impl;

import com.huayu.management.bo.*;
import com.huayu.management.entity.TbCustomer;
import com.huayu.management.entity.TbEmployee;
import com.huayu.management.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

/**
 * 统计专用服务
 * @author Song
 */
@Service
public class MyStatisticsService{
    /**
     * 商机mapper
     */
    @Autowired
    private TbBusinessMapper businessMapper;
    /**
     * 用户mapper
     */
    @Autowired
    private TbEmployeeMapper employeeMapper;
    /**
     * //跟单mapper
     */
    @Autowired
    private TbDocumentaryMapper documentaryMapper;
    /**
     * //客户mapper
     */
    @Autowired
    private TbCustomerMapper customerMapper;

    /**
     * //合同mapper
     */
    @Autowired
    private TbContractMapper contractMapper;

    public List<MyStatistics> selects() {
        List<MyStatistics> list=new ArrayList<>();
        /*
        * 商机
        * */
        MyStatistics state_1=new MyStatistics();
        state_1.setCNum(1);
        state_1.setCounts(businessMapper.statNowWeek());
        list.add(state_1);
        MyStatistics state_2=new MyStatistics();
        state_2.setCNum(2);
        state_2.setCounts(businessMapper.statLastWeek());
        list.add(state_2);

        MyStatistics state_3=new MyStatistics();
        state_3.setCNum(9);
        state_3.setCounts(businessMapper.statNowMon());
        list.add(state_3);
        MyStatistics state_4=new MyStatistics();
        state_4.setCNum(10);
        state_4.setCounts(businessMapper.statLastMon());
        list.add(state_4);

        MyStatistics state_5=new MyStatistics();
        state_5.setCNum(17);
        state_5.setCounts(businessMapper.statNowQuarter());
        list.add(state_5);
        MyStatistics state_6=new MyStatistics();
        state_6.setCNum(18);
        state_6.setCounts(businessMapper.statLastQuarter());
        list.add(state_6);

        MyStatistics state_7=new MyStatistics();
        state_7.setCNum(25);
        state_7.setCounts(businessMapper.statNowYear());
        list.add(state_7);
        MyStatistics state_8=new MyStatistics();
        state_8.setCNum(26);
        state_8.setCounts(businessMapper.statLastYear());
        list.add(state_8);


        /*
         * 成交
         * */
        MyStatistics deal_1=new MyStatistics();
        deal_1.setCNum(3);
        deal_1.setCounts(businessMapper.statNowWeek1());
        list.add(deal_1);
        MyStatistics deal_2=new MyStatistics();
        deal_2.setCNum(4);
        deal_2.setCounts(businessMapper.statLastWeek1());
        list.add(deal_2);
        MyStatistics deal_3=new MyStatistics();
        deal_3.setCNum(11);
        deal_3.setCounts(businessMapper.statNowMon1());
        list.add(deal_3);
        MyStatistics deal_4=new MyStatistics();
        deal_4.setCNum(12);
        deal_4.setCounts(businessMapper.statLastMon1());
        list.add(deal_4);
        MyStatistics deal_5=new MyStatistics();
        deal_5.setCNum(19);
        deal_5.setCounts(businessMapper.statNowQuarter1());
        list.add(deal_5);
        MyStatistics deal_6=new MyStatistics();
        deal_6.setCNum(20);
        deal_6.setCounts(businessMapper.statLastQuarter1());
        list.add(deal_6);
        MyStatistics deal_7=new MyStatistics();
        deal_7.setCNum(27);
        deal_7.setCounts(businessMapper.statNowYear1());
        list.add(deal_7);
        MyStatistics deal_8=new MyStatistics();
        deal_8.setCNum(28);
        deal_8.setCounts(businessMapper.statLastYear1());
        list.add(deal_8);

        /*
         * 跟单
         * */
        MyStatistics docu_1=new MyStatistics();
        docu_1.setCNum(5);
        docu_1.setCounts(documentaryMapper.statNowWeek());
        list.add(docu_1);
        MyStatistics docu_2=new MyStatistics();
        docu_2.setCNum(6);
        docu_2.setCounts(documentaryMapper.statLastWeek());
        list.add(docu_2);


        MyStatistics docu_3=new MyStatistics();
        docu_3.setCNum(13);
        docu_3.setCounts(documentaryMapper.statNowMon());
        list.add(docu_3);
        MyStatistics docu_4=new MyStatistics();
        docu_4.setCNum(14);
        docu_4.setCounts(documentaryMapper.statLastMon());
        list.add(docu_4);

        MyStatistics docu_5=new MyStatistics();
        docu_5.setCNum(21);
        docu_5.setCounts(documentaryMapper.statNowQuarter());
        list.add(docu_5);
        MyStatistics docu_6=new MyStatistics();
        docu_6.setCNum(22);
        docu_6.setCounts(documentaryMapper.statLastQuarter());
        list.add(docu_6);

        MyStatistics docu_7=new MyStatistics();
        docu_7.setCNum(29);
        docu_7.setCounts(documentaryMapper.statNowYear());
        list.add(docu_7);
        MyStatistics docu_8=new MyStatistics();
        docu_8.setCNum(30);
        docu_8.setCounts(documentaryMapper.statLastYear());
        list.add(docu_8);

        /*
         * 合同
         * */
        MyStatistics cont_1=new MyStatistics();
        cont_1.setCNum(7);
        cont_1.setCounts(contractMapper.statNowWeek());
        list.add(cont_1);
        MyStatistics cont_2=new MyStatistics();
        cont_2.setCNum(8);
        cont_2.setCounts(contractMapper.statLastWeek());
        list.add(cont_2);


        MyStatistics cont_3=new MyStatistics();
        cont_3.setCNum(15);
        cont_3.setCounts(contractMapper.statNowMon());
        list.add(cont_3);
        MyStatistics cont_4=new MyStatistics();
        cont_4.setCNum(16);
        cont_4.setCounts(contractMapper.statLastMon());
        list.add(cont_4);

        MyStatistics cont_5=new MyStatistics();
        cont_5.setCNum(23);
        cont_5.setCounts(contractMapper.statNowQuarter());
        list.add(cont_5);
        MyStatistics cont_6=new MyStatistics();
        cont_6.setCNum(24);
        cont_6.setCounts(contractMapper.statLastQuarter());
        list.add(cont_6);

        MyStatistics cont_7=new MyStatistics();
        cont_7.setCNum(31);
        cont_7.setCounts(contractMapper.statNowYear());
        list.add(cont_7);
        MyStatistics cont_8=new MyStatistics();
        cont_8.setCNum(32);
        cont_8.setCounts(contractMapper.statLastYear());
        list.add(cont_8);
        return list;
    }

    /**
     * 本周和上周的各个数量
     * @return
     */
    public List<WeekCount>  selectWeek(){
        List<TbEmployee> empList=employeeMapper.selectList(null);
        List<WeekCount> weeklist=new ArrayList<>();
        for(TbEmployee emp:empList){
            WeekCount w=new WeekCount();
            w.setName(emp.getName());
            w.setSjweek1(businessMapper.statNowWeek2(emp.getId()));
            w.setSjweek2(businessMapper.statLastWeek2(emp.getId()));
            w.setCjweek1(businessMapper.statNowWeek3(emp.getId()));
            w.setCjweek2(businessMapper.statLastWeek3(emp.getId()));
            w.setGdweek1(documentaryMapper.statNowWeek1(emp.getId()));
            w.setGdweek2(documentaryMapper.statLastWeek1(emp.getId()));
            w.setHtweek1(contractMapper.statNowWeek1(emp.getId()));
            w.setHtweek2(contractMapper.statLastWeek1(emp.getId()));
            weeklist.add(w);
        }

        return weeklist;
    }
    /**
     * 本月和上月的各个数量
     * @return
     */
    public List<MonCount> selectMon(){
        List<TbEmployee> empList=employeeMapper.selectList(null);
        List<MonCount> monlist=new ArrayList<>();
        for(TbEmployee emp:empList){
            MonCount w=new MonCount();
            w.setName(emp.getName());
            w.setSjmon1(businessMapper.statNowMon2(emp.getId()));
            w.setSjmon2(businessMapper.statLastMon2(emp.getId()));
            w.setCjmon1(businessMapper.statNowMon3(emp.getId()));
            w.setCjmon2(businessMapper.statLastMon3(emp.getId()));
            w.setGdmon1(documentaryMapper.statNowMon1(emp.getId()));
            w.setGdmon2(documentaryMapper.statLastMon1(emp.getId()));
            w.setHtmon1(contractMapper.statNowMon1(emp.getId()));
            w.setHtmon2(contractMapper.statLastMon1(emp.getId()));
            monlist.add(w);
        }
        return monlist;
    }
    /**
     * 本季度和上季度的各个数量
     * @return
     */
    public List<JiduCount> selectJidu(){
        List<TbEmployee> empList=employeeMapper.selectList(null);
        List<JiduCount> jidulist=new ArrayList<>();
        for(TbEmployee emp:empList){
            JiduCount w=new JiduCount();
            w.setName(emp.getName());
            w.setSjjidu1(businessMapper.statNowQuarter2(emp.getId()));
            w.setSjjidu2(businessMapper.statLastQuarter2(emp.getId()));
            w.setCjjidu1(businessMapper.statNowQuarter3(emp.getId()));
            w.setCjjidu2(businessMapper.statLastQuarter3(emp.getId()));
            w.setGdjidu1(documentaryMapper.statNowQuarter1(emp.getId()));
            w.setGdjidu2(documentaryMapper.statLastQuarter1(emp.getId()));
            w.setHtjidu1(contractMapper.statNowQuarter1(emp.getId()));
            w.setHtjidu2(contractMapper.statLastQuarter1(emp.getId()));
            jidulist.add(w);
        }
        return jidulist;
    }
    /**
     * 本年和上年的各个数量
     * @return
     */
    public List<YearCount>  selectYear(){
        List<TbEmployee> empList=employeeMapper.selectList(null);
        List<YearCount> yearlist=new ArrayList<>();
        for(TbEmployee emp:empList){
            YearCount w=new YearCount();
            w.setName(emp.getName());
            w.setSjyear1(businessMapper.statNowYear2(emp.getId()));
            w.setSjyear2(businessMapper.statLastYear2(emp.getId()));
            w.setCjyear1(businessMapper.statNowYear3(emp.getId()));
            w.setCjyear2(businessMapper.statLastYear3(emp.getId()));
            w.setGdyear1(documentaryMapper.statNowYear1(emp.getId()));
            w.setGdyear2(documentaryMapper.statLastYear1(emp.getId()));
            w.setHtyear1(contractMapper.statNowYear1(emp.getId()));
            w.setHtyear2(contractMapper.statLastYear1(emp.getId()));
            yearlist.add(w);
        }

        return yearlist;
    }

    /**
     * 根据行业查数量和金额
     */
    public List<SjSum> selectHy(){

        String[] str = new String[]{
                "IT|互联网|通信|电子",
                "房产|建筑建设|物业",
                "管理咨询|教育科研|中介服务",
                "加工制造|仪表设备",
                "金融|银行|保险",
                "酒店旅游",
                "能源矿产|石油化工",
                "消费零售|贸易|交通物流",
                "医药生物|医疗保健",
                "政府|非赢利机构|科研",
                "其他"};
        List<SjSum> slist=businessMapper.selectSum();
        List list1 = new ArrayList<>();
        if(slist.size()>0){
            for(SjSum b:slist){
                list1.add(b.getStat());
            }
            for(int i=0;i<str.length;i++){
                if(!list1.contains(str[i])){
                    slist.add(new SjSum(str[i],0,0));
                }
            }
        }else{
            for(int i=0;i<str.length;i++){
                    slist.add(new SjSum(str[i],0,0));
            }
        }

        return slist;
    }

    /**
     * 根据商机来源查数量和金额
     */
    public List<sjResource> selectRe(){

        String[] str = new String[]{
                "电话访问",
                "独立开发",
                "二次销售",
                "合作伙伴",
                "互联网",
                "客户介绍",
                "客户来电",
                "老客户",
                "媒体宣传"};
        List<sjResource> list = businessMapper.sjSum();
        List list1 = new ArrayList<>();
        if(list.size()>0){
            for(sjResource b:list){
                list1.add(b.getResource());
            }
            for(int i=0;i<str.length;i++){
                if(!list1.contains(str[0])){
                    list.add(new sjResource(str[0],0,0));
                }
            }
        }else{
            for(int i=0;i<str.length;i++){
                    list.add(new sjResource(str[i],0,0));
            }
        }

        return list;
    }



    /**
     * 查询所有商机数量 ，客户数量，合同数量
     */
    public Counts zTongji(){
        /*
        * a:客户b:合同：c:商机
        * */
        Integer c=businessMapper.sjzongS();
        Integer b=contractMapper.contracts();
        Integer a=customerMapper.customer();
        Counts coun=new Counts();
        coun.setStat1(a);
        coun.setStat2(b);
        coun.setStat3(c);

        return coun;
    }


    /**
     * 查商机数量和金额
     */
    public List<SjSum> sjZTong(){

        List<SjSum> list = businessMapper.sjtongji();
        List<SjSum> list2 = new ArrayList<>();
        Integer i=0;
        if(list.size()>0){
            for (SjSum s:list){
                if(s.getStat().equals("进行中")){
                    list2.add(new SjSum(s.getStat(),s.getSjCount(),s.getMoneySum()));
                }
                if(s.getStat().equals("已丢单")){
                    list2.add(new SjSum(s.getStat(),s.getSjCount(),s.getMoneySum()));
                }
                if(s.getStat().equals("已搁置")){
                    list2.add(new SjSum(s.getStat(),s.getSjCount(),s.getMoneySum()));
                }
                if(!s.getStat().equals("进行中")&&!s.getStat().equals("进行中")&&!s.getStat().equals("进行中")){

                    list2.add(new SjSum(s.getStat(),s.getSjCount(),i+s.getMoneySum()));
                }
            }
        }else{
            list2.add(new SjSum("进行中",0,0));
            list2.add(new SjSum("已成交",0,0));
            list2.add(new SjSum("已搁置",0,0));
            list2.add(new SjSum("已丢单",0,0));
        }

        return list2;
    }

    /**
     * 根据上年度查数量和金额
     */
    public List<SjSum> selectAllCount(){

        String[] str = new String[]{
                "初期沟通",
                "方案和报价",
                "竞争和投标",
                "商务谈判",
                "成交"};
        List<SjSum> list = businessMapper.sjtongji();
        List<String> list1 = new ArrayList<>();
        if(list.size()>0){
            for(SjSum b:list){
                list1.add(b.getStat());
            }
            for(int i=0;i<str.length;i++){
                if(!list1.contains(str[0])){
                    list.add(new SjSum(str[0],0,0));
                }
            }
        }else{
            for(int i=0;i<str.length;i++){
                list.add(new SjSum(str[i],0,0));
            }
        }

        return list;
    }

    /**
     * 根据本年度查数量和金额
     */
    public List<SjSum> selectAllCount1(){
        String[] str = new String[]{
                "初期沟通",
                "方案和报价",
                "竞争和投标",
                "商务谈判",
                "成交"};
        List<SjSum> list = businessMapper.sjtong3();
        List<String> list1 = new ArrayList<>();
        if(list.size()>0){
            for(SjSum b:list){
                list1.add(b.getStat());
            }
            for(int i=0;i<str.length;i++){
                if(!list1.contains(str[0])){
                    list.add(new SjSum(str[0],0,0));
                }
            }
        }else{
            for(int i=0;i<str.length;i++){
                list.add(new SjSum(str[i],0,0));
            }
        }

        return list;
    }
    /**
     * 根据上年度查数量和金额
     */
    public List<SjSum> selectAllCount2(){
        String[] str = new String[]{
                "初期沟通",
                "方案和报价",
                "竞争和投标",
                "商务谈判",
                "成交"};
        List<SjSum> list = businessMapper.sjtong2();
        List<String> list1 = new ArrayList<>();
        if(list.size()>0){
            for(SjSum b:list){
                list1.add(b.getStat());
            }
            for(int i=0;i<str.length;i++){
                if(!list1.contains(str[0])){
                    list.add(new SjSum(str[0],0,0));
                }
            }
        }else{
            for(int i=0;i<str.length;i++){
                list.add(new SjSum(str[i],0,0));
            }
        }

        return list;
    }

    /**
     * 根据本季度查数量和金额
     */
    public List<SjSum> selectAllCount3(){
        String[] str = new String[]{
                "初期沟通",
                "方案和报价",
                "竞争和投标",
                "商务谈判",
                "成交"};
        List<SjSum> list = businessMapper.sjtong5();
        List<String> list1 = new ArrayList<>();
        if(list.size()>0){
            for(SjSum b:list){
                list1.add(b.getStat());
            }
            for(int i=0;i<str.length;i++){
                if(!list1.contains(str[0])){
                    list.add(new SjSum(str[0],0,0));
                }
            }
        }else{
            for(int i=0;i<str.length;i++){
                list.add(new SjSum(str[i],0,0));
            }
        }

        return list;
    }
    /**
     * 根据上季度查数量和金额
     */
    public List<SjSum> selectAllCount4(){
        String[] str = new String[]{
                "初期沟通",
                "方案和报价",
                "竞争和投标",
                "商务谈判",
                "成交"};
        List<SjSum> list = businessMapper.sjtong4();
        List<String> list1 = new ArrayList<>();
        if(list.size()>0){
            for(SjSum b:list){
                list1.add(b.getStat());
            }
            for(int i=0;i<str.length;i++){
                if(!list1.contains(str[0])){
                    list.add(new SjSum(str[0],0,0));
                }
            }
        }else{
            for(int i=0;i<str.length;i++){
                list.add(new SjSum(str[i],0,0));
            }
        }

        return list;
    }
}
