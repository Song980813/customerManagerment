package com.huayu.management.service.impl;

import com.huayu.management.bo.LayuiEntity;
import com.huayu.management.bo.MyStatistics;
import com.huayu.management.mapper.TbBusinessMapper;
import com.huayu.management.mapper.TbContractMapper;
import com.huayu.management.mapper.TbDocumentaryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
     * //跟单mapper
     */
    @Autowired
    private TbDocumentaryMapper documentaryMapper;

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
        cont_7.setCNum(21);
        cont_7.setCounts(contractMapper.statNowYear());
        list.add(cont_7);
        MyStatistics cont_8=new MyStatistics();
        cont_8.setCNum(32);
        cont_8.setCounts(contractMapper.statLastYear());
        list.add(cont_8);
        return list;
    }
}
