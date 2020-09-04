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
    public LayuiEntity selectAll(Integer page,Integer limit,TbAftersale tbAftersale) {
        //声明一个wrapper 拼接条件
        QueryWrapper wrapper= new QueryWrapper();
        //判断传过来的对象 为不为空若为空给wrapper一个null
        if(StringUtils.isEmpty(tbAftersale)){
            wrapper=null;
        }else{
            //判断需要的参数
            if(!StringUtils.isEmpty(tbAftersale.getTheme())){
                wrapper.like("theme",tbAftersale.getTheme());
            }
            if(!StringUtils.isEmpty(tbAftersale.getServicetype())){
                wrapper.like("servicetype",tbAftersale.getServicetype());
            }
            if(!StringUtils.isEmpty(tbAftersale.getStartime())){
                wrapper.like("startime",tbAftersale.getStartime());
            }
            if(!StringUtils.isEmpty(tbAftersale.getSerperson())){
                wrapper.like("serperson",tbAftersale.getSerperson());
            }
            if(!StringUtils.isEmpty(tbAftersale.getSerrating())){
                wrapper.like("serrating",tbAftersale.getSerrating());
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
}
