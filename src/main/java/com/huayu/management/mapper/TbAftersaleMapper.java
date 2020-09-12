package com.huayu.management.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.huayu.management.entity.TbAftersale;
import org.apache.ibatis.annotations.Select;

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

    /**
     * 查询各个状态数量
     * @return
     */
    @Select("select count(*) from tb_aftersale where statistics ='处理中' ")
    public Integer statCount1();

    @Select("select count(*) from tb_aftersale where statistics ='已完成' ")
    public Integer statCount2();

    @Select("select count(*) from tb_aftersale where statistics ='已撤出' ")
    public Integer statCount3();

    /**
     * 查询各个时间段数量
     * @return
     */
    @Select("SELECT count(*) FROM tb_aftersale WHERE YEARWEEK(date_format(startime,'%Y-%m-%d'),1) = YEARWEEK(now(),1)")
    public Integer dateCount4();//本周
    @Select("SELECT count(*)  FROM tb_aftersale WHERE YEARWEEK(date_format(startime,'%Y-%m-%d'),1) = YEARWEEK(now(),1)-1")
    public Integer dateCount5();//上周

    @Select("select count(*)  from tb_aftersale where date_format(startime,'%Y-%m')=date_format(now(),'%Y-%m')")
    public Integer dateCount6();//本月
    @Select("select count(*)  from tb_aftersale where date_format(startime,'%Y-%m')=date_format(DATE_SUB(curdate(), INTERVAL 1 MONTH),'%Y-%m')")
    public Integer dateCount7();//上月

    @Select("select count(*)  from tb_aftersale WHERE YEAR(startime)=YEAR(now()) AND QUARTER(startime) = QUARTER(NOW())")
    public Integer dateCount8();//本季度
    @Select("select count(*)  from tb_aftersale where YEAR(startime)=YEAR(now()) AND  QUARTER(startime)=QUARTER(DATE_SUB(now(),interval 1 QUARTER))")
    public Integer dateCount9();//上季度

}
