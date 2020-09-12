package com.huayu.management.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.huayu.management.bo.LayuiEntity;
import com.huayu.management.bo.businutils;
import com.huayu.management.entity.TbBusiness;
import com.huayu.management.entity.TbDocumentary;
import com.huayu.management.entity.TbEmployee;
import com.huayu.management.entity.TbPost;
import com.huayu.management.mapper.TbBusinessMapper;
import com.huayu.management.mapper.TbDocumentaryMapper;
import com.huayu.management.mapper.TbEmployeeMapper;
import com.huayu.management.mapper.TbPostMapper;
import com.huayu.management.service.ITbBusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 商机表
 服务实现类
 * </p>
 *
 * @author Song
 * @since 2020-09-02
 */
@Service
public class TbBusinessServiceImpl extends ServiceImpl<TbBusinessMapper, TbBusiness> implements ITbBusinessService {
@Autowired
    TbBusinessMapper tbBusinessMapper;

@Autowired
    TbDocumentaryMapper tbDocumentaryMapper;
@Autowired
    TbPostMapper tbPostMapper;
@Autowired
    TbEmployeeMapper tbEmployeeMapper;
    @Override
    public LayuiEntity selebuin(int page, int limit, TbBusiness tbBusiness,String yhxm) {
        System.out.println("当前服务"+yhxm);
        Page page1=new Page(page,limit);
        QueryWrapper queryWrapper=new QueryWrapper();
        if (yhxm!= null && yhxm!="") {
            System.out.println("走判断了");
            QueryWrapper queryWrapper5=new QueryWrapper();
            queryWrapper5.eq("name",yhxm);
            List<TbEmployee> list7=tbEmployeeMapper.selectList(queryWrapper5);
            int yid=0;
            for (TbEmployee li1:list7) {
                yid=li1.getId();
            }
            queryWrapper.like("charge_person",yid);

        }
        if (null!=tbBusiness) {
            if (tbBusiness.getBoName() != null && tbBusiness.getBoName() != "") {
                queryWrapper.like("bo_name", tbBusiness.getBoName());
            }
            if (tbBusiness.getState() != null && tbBusiness.getState() != "") {
                queryWrapper.like("state", tbBusiness.getState());
            }

            if (tbBusiness.getDepartment() != null && tbBusiness.getDepartment() != "") {
                queryWrapper.like("department", tbBusiness.getChargePerson());
            }
            if (tbBusiness.getAmount() != null && tbBusiness.getAmount() != 0) {
                queryWrapper.like("department", tbBusiness.getAmount());
            }
            if (tbBusiness.getClosingdate() != null && tbBusiness.getClosingdate() != "") {
                queryWrapper.like("closingdate", tbBusiness.getChargePerson());
            }
        }else{
              queryWrapper=null;
        }
        Page page2=tbBusinessMapper.selectPage(page1,queryWrapper);
        List<TbBusiness> list1 = page2.getRecords();
        List<businutils> list3 = new ArrayList();

    for (TbBusiness list2:list1) {
        businutils businutils=new businutils();
   QueryWrapper queryWrapper3=new QueryWrapper();
   queryWrapper3.eq("id",list2.getChargePerson());
        TbEmployee employee=tbEmployeeMapper.selectById(list2.getChargePerson());

                QueryWrapper queryWrapper1=new QueryWrapper();
                queryWrapper1.eq("sid",list2.getSid());
                             List<TbDocumentary> list4=tbDocumentaryMapper.selectList(queryWrapper1);

        String gjsj="";
                            for (TbDocumentary list5:list4) {
                            	 gjsj=list5.getMerchandisingtime();//最后跟单时间
                            }
       List<TbPost> list6=tbPostMapper.selectList(queryWrapper1);

    	     businutils.setSid(list2.getSid());;//商机id
             businutils.setSjname(list2.getBoName());//商机的名称
             businutils.setSjjd(list2.getState());//商机阶段
             businutils.setYjcjnum(list2.getAmount());//预计成交金额
             businutils.setSjfz(employee.getName());//商机负责人
             businutils.setZhhd(gjsj);//跟单时间
             businutils.setTlb(list6.size());//讨论版长
        list3.add(businutils);
    }
        LayuiEntity layuiEntity = new LayuiEntity();
        layuiEntity.setCode(0);
        layuiEntity.setMsg("查询成功");
        layuiEntity.setCount(list3.size());
        layuiEntity.setData(list3);
        System.out.println(layuiEntity);
        return layuiEntity;


    }
}
