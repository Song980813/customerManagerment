package com.huayu.management.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.huayu.management.bo.LayuiEntity;
import com.huayu.management.entity.TbCustomer;
import com.huayu.management.mapper.TbBusinessMapper;
import com.huayu.management.mapper.TbCustomerMapper;
import com.huayu.management.service.ITbCustomerService;
import org.springframework.stereotype.Service;

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
    public  TbCustomerMapper tbCustomerMapper;
     public TbBusinessMapper tbBusinessMapper;
    @Override
    public LayuiEntity selequu(Integer page, Integer limit) {
    /*    Page page1=new Page(page,limit);
             QueryWrapper queryWrapper=new QueryWrapper();

        Page page2=tbCustomerMapper.selectPage(page1,queryWrapper);
        List<TbCustomer> list1 = page2.getRecords();
             for (TbCustomer page3: list1) {
                   int kid=page3.getCid();
                   QueryWrapper queryWrapper1=new QueryWrapper();
                       queryWrapper.eq("",)
                 tbBusinessMapper.selectList();


             }
*/

        return null;
    }


}
