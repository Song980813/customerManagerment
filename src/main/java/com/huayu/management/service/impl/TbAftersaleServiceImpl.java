package com.huayu.management.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.huayu.management.bo.LayuiEntity;
import com.huayu.management.bo.Counts;
import com.huayu.management.entity.TbAftersale;
import com.huayu.management.mapper.TbAftersaleMapper;
import com.huayu.management.service.ITbAftersaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * <p>
 * 售后服务表 服务实现类
 * </p>
 *
 * @author Song
 * @since 2020-09-02
 */
@Service
public class TbAftersaleServiceImpl extends ServiceImpl<TbAftersaleMapper, TbAftersale> implements ITbAftersaleService {
    @Autowired
    TbAftersaleMapper aftersaleMapper;

    @Override
    public LayuiEntity selectAll(Integer page,Integer limit,String no, String title, String  d ) {
        //声明一个wrapper 拼接条件
        QueryWrapper wrapper= new QueryWrapper();
        //判断传过来的对象 为不为空若为空给wrapper一个null
        if(StringUtils.isEmpty(title)){
            wrapper=null;
        }else if(!StringUtils.isEmpty(title)){
            //判断需要的参数
                wrapper.like(no, title);
        }else if(!StringUtils.isEmpty(d)){
            wrapper.eq("statistics",d);
        }
        //对当前页和每页多少条进行封装
        Page page1 = new Page(page,limit);
        //查询 返回结果不是我们想要的集合
        Page p = aftersaleMapper.selectPage(page1,wrapper);
        //转换集合
        List<TbAftersale> list = p.getRecords();
        //对查询结果进行格式化
        LayuiEntity layuiEntity= new LayuiEntity();
        layuiEntity.setCode(0);
        layuiEntity.setMsg("查询成功");
        layuiEntity.setCount(list.size());
        layuiEntity.setData(list);
        return layuiEntity;
    }

    @Override
    public LayuiEntity afterAdd(TbAftersale aftersale) {
        aftersale.setStatistics("新增");
         int i=aftersaleMapper.insert(aftersale);

        LayuiEntity layuiEntity= new LayuiEntity();
        if(i==0){
            layuiEntity.setCode(0);
            layuiEntity.setMsg("新增售后服务失败");
        }else{
            layuiEntity.setCode(i);
            layuiEntity.setMsg("新增售后服务成功");
        }
        return layuiEntity;
    }

    @Override
    public LayuiEntity afterAdd1(TbAftersale aftersale) {
        aftersale.setStatistics("处理中");
        int i=aftersaleMapper.insert(aftersale);

        LayuiEntity layuiEntity= new LayuiEntity();
        if(i==0){
            layuiEntity.setCode(0);
            layuiEntity.setMsg("新增售后服务失败");
        }else{
            layuiEntity.setCode(i);
            layuiEntity.setMsg("新增售后服务成功");
        }
        return layuiEntity;
    }

    @Override
    public LayuiEntity afterAdd2(TbAftersale aftersale) {
        aftersale.setStatistics("已完成");
        int i=aftersaleMapper.insert(aftersale);

        LayuiEntity layuiEntity= new LayuiEntity();
        if(i==0){
            layuiEntity.setCode(0);
            layuiEntity.setMsg("新增售后服务失败");
        }else{
            layuiEntity.setCode(i);
            layuiEntity.setMsg("新增售后服务成功");
        }
        return layuiEntity;
    }

    @Override
    public TbAftersale queryNew() {
        aftersaleMapper.queryone();
        return null;
    }



    @Override
    public LayuiEntity selectDate(Integer page,Integer limit, String date) {
        //声明一个wrapper 拼接条件
        QueryWrapper wrapper= new QueryWrapper();
        //判断传过来的对象 为不为空若为空给wrapper一个null
        if(StringUtils.isEmpty(date)){
            wrapper=null;
        }else if(date.equals("week1")){
            System.out.println(date);
            wrapper.eq("EARWEEK(date_format(startime,'%Y-%m-%d'),1)","YEARWEEK(now(),1)");
        }else if(date.equals("week2")){
            wrapper.eq("YEARWEEK(date_format(startime,'%Y-%m-%d'),1) ","YEARWEEK(now(),1)-1");
        }else if(date.equals("mon1")){
            wrapper.eq("date_format(startime,'%Y-%m')","date_format(now(),'%Y-%m')");
        }else if(date.equals("mon2")){
            wrapper.eq("date_format(startime,'%Y-%m')","date_format(DATE_SUB(curdate(), INTERVAL 1 MONTH),'%Y-%m')");
        }else if(date.equals("quarter1")){
            wrapper.eq("YEAR(startime)","YEAR(now())" );
            wrapper.eq( "QUARTER(startime) "," QUARTER(NOW())");
        }else if(date.equals("quarter1")){
            wrapper.eq("YEAR(startime)","YEAR(now())" );
            wrapper.eq( "QUARTER(startime) ","QUARTER(DATE_SUB(now(),interval 1 QUARTER))");
        }
        //对当前页和每页多少条进行封装
        Page page1 = new Page(page,limit);
        //查询 返回结果不是我们想要的集合
        Page p = aftersaleMapper.selectPage(page1,wrapper);
        //转换集合
        List<TbAftersale> list = p.getRecords();
        //对查询结果进行格式化
        LayuiEntity layuiEntity= new LayuiEntity();
        layuiEntity.setCode(0);
        layuiEntity.setMsg("查询成功");
        layuiEntity.setCount(list.size());
        layuiEntity.setData(list);
        return layuiEntity;
    }

    @Override
    public LayuiEntity update(TbAftersale tbAftersale) {
        tbAftersale.setStatistics("处理中");
        int i = aftersaleMapper.updateById(tbAftersale);
        //对返回消息封装
        LayuiEntity layuiEntity= new LayuiEntity();
        if(i==0){
            layuiEntity.setCode(0);
            layuiEntity.setMsg("修改售后服务失败");
        }else{
            layuiEntity.setCode(i);
            layuiEntity.setMsg("修改售后服务成功");
        }
        return layuiEntity;
    }

    @Override
    public LayuiEntity update1(TbAftersale tbAftersale) {
        tbAftersale.setStatistics("已完成");
        int i = aftersaleMapper.updateById(tbAftersale);
        //对返回消息封装
        LayuiEntity layuiEntity= new LayuiEntity();
        if(i==0){
            layuiEntity.setCode(0);
            layuiEntity.setMsg("修改售后服务失败");
        }else{
            layuiEntity.setCode(i);
            layuiEntity.setMsg("修改售后服务成功");
        }
        return layuiEntity;
    }

    @Override
    public Counts queryCount() {
        Counts li=new Counts();
        //处理中
        Integer a1=aftersaleMapper.statCount1();
        li.setStat1(a1);
        //已完成
        Integer a2=aftersaleMapper.statCount2();
        li.setStat2(a2);
        //已撤销
        Integer a3=aftersaleMapper.statCount3();
        li.setStat3(a3);

        Integer b1=aftersaleMapper.dateCount4();
        li.setQ1(b1);
        Integer b2=aftersaleMapper.dateCount5();
        li.setQ2(b2);
        Integer b3=aftersaleMapper.dateCount6();
        li.setQ3(b3);
        Integer b4=aftersaleMapper.dateCount7();
        li.setQ4(b4);
        Integer b5=aftersaleMapper.dateCount8();
        li.setQ5(b5);
        Integer b6=aftersaleMapper.dateCount9();
        li.setQ6(b6);
        return li;
    }
}
