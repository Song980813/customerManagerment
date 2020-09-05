package com.huayu.management.mapper;

import com.huayu.management.entity.TbAftersale;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

/**
 * <p>
 * 售后服务表 Mapper 接口
 * </p>
 *
 * @author Song
 * @since 2020-09-02
 */
public interface TbAftersaleMapper extends BaseMapper<TbAftersale> {

    @Select("select * from tb_aftersale order by id DESC limit 1")
    public TbAftersale queryone();
}
