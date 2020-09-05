package com.huayu.management.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.huayu.management.bo.LayuiEntity;
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
    public LayuiEntity selectAll(Integer page,Integer limit,Integer no, String title  ) {
        //声明一个wrapper 拼接条件
        QueryWrapper wrapper= new QueryWrapper();
        //判断传过来的对象 为不为空若为空给wrapper一个null
        if(StringUtils.isEmpty(title)){
            wrapper=null;
        }else{
            //判断需要的参数
            if(no==1){
                wrapper.like("theme", title);
            }else if(no==2){
                wrapper.like("servicetype", title);
            }else if(no==3){
                wrapper.like("startime", title);
            }else if(no==4){
                wrapper.like("serperson", title);
            }else if(no==5){
                wrapper.like("serrating", title);
            }
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
         int i=aftersaleMapper.insert(aftersale);
        //对查询结果进行格式化
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

}
