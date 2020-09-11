package com.huayu.management.mapper;

import com.huayu.management.entity.TbCustomer;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

/**
 * <p>
 * 客户表 Mapper 接口
 * </p>
 *
 * @author Song
 * @since 2020-09-02
 */
public interface TbCustomerMapper extends BaseMapper<TbCustomer> {
    /**
     * 查全部客户数量
     * @return
     */
    @Select("select count(*) from tb_customer")
    public Integer customer();
}
