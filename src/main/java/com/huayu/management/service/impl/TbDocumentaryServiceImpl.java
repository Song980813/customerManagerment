package com.huayu.management.service.impl;

import com.huayu.management.bo.DocuTheme;
import com.huayu.management.bo.LayuiEntity;
import com.huayu.management.entity.TbBusiness;
import com.huayu.management.entity.TbContract;
import com.huayu.management.entity.TbCustomer;
import com.huayu.management.entity.TbDocumentary;
import com.huayu.management.mapper.TbBusinessMapper;
import com.huayu.management.mapper.TbContractMapper;
import com.huayu.management.mapper.TbCustomerMapper;
import com.huayu.management.mapper.TbDocumentaryMapper;
import com.huayu.management.service.ITbDocumentaryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.commons.collections.bag.SynchronizedSortedBag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * <p>
 * 跟单表 服务实现类
 * </p>
 *
 * @author Song
 * @since 2020-09-02
 */
@Service
public class TbDocumentaryServiceImpl extends ServiceImpl<TbDocumentaryMapper, TbDocumentary> implements ITbDocumentaryService {
    @Autowired
    private TbDocumentaryMapper tbDocumentaryMapper;
    @Autowired
    private TbBusinessMapper tbBusinessMapper;
    @Autowired
    private TbCustomerMapper tbCustomerMapper;

    public LayuiEntity add(TbDocumentary documentary){
        LayuiEntity layuiEntity=new LayuiEntity();
        documentary.setMerchandisingtime(new Date().toString());
        System.out.println(documentary);
        int b=tbDocumentaryMapper.insert(documentary);
        System.out.println(b);
        if(b>0){
            layuiEntity.setMsg("添加成功");
        }else{
            layuiEntity.setMsg("添加失败");
        }
        return layuiEntity;
    }
     //查询全部的跟单
    @Override
    public List<TbDocumentary> selectall(String xiala,String shuru) {
        List<TbDocumentary>list= tbDocumentaryMapper.selectList(null);
        return list;
    }
    @Override
    public  List<DocuTheme> slecttheme(){

        List<DocuTheme> l=new ArrayList<>();
        /**
         * 查询所有商机
         */
        List<TbBusiness> list1=tbBusinessMapper.selectList(null);
        for(TbBusiness li:list1){
            /**
             * 根据商机表的客户ID查询响应客户
             */
            TbCustomer tbc=tbCustomerMapper.selectById(li.getCid());
            System.out.println(tbc.toString());
            DocuTheme dth=new DocuTheme();
            dth.setName1(li.getSid());
            dth.setName2(tbc.getCustomerName()+"-"+li.getBoName());
            System.out.println(tbc.getCustomerName()+"-"+li.getBoName());
            l.add(dth);
        }
        System.out.println(l.size());
        return l;
    }
}
