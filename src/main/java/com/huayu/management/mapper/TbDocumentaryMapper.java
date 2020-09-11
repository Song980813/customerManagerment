package com.huayu.management.mapper;

import com.huayu.management.entity.TbDocumentary;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

/**
 * <p>
 * 跟单表 Mapper 接口
 * </p>
 *
 * @author Song
 * @since 2020-09-02
 */
public interface TbDocumentaryMapper extends BaseMapper<TbDocumentary> {

    /**
     * 查询本周跟单数量
     * @return
     */
    @Select("select count(*) from tb_documentary where YEARWEEK(date_format(merchandisingtime,'%Y-%m-%d'),1) = YEARWEEK(now(),1) ")
    public Integer statNowWeek();
    /**
     * 查询上周跟单数量
     * @return
     */
    @Select("select count(*) from tb_documentary where YEARWEEK(date_format(merchandisingtime,'%Y-%m-%d'),1) = YEARWEEK(now(),1)-1 ")
    public Integer statLastWeek();

    /**
     * 查询本月跟单数量
     * @return
     */
    @Select("select count(*) from tb_documentary where date_format(merchandisingtime,'%Y-%m')=date_format(now(),'%Y-%m') ")
    public Integer statNowMon();
    /**
     * 查询上月跟单数量
     * @return
     */
    @Select("select count(*) from tb_documentary where date_format(merchandisingtime,'%Y-%m')=date_format(DATE_SUB(curdate(), INTERVAL 1 MONTH),'%Y-%m') ")
    public Integer statLastMon();

    /**
     * 查询本季度跟单数量
     * @return
     */
    @Select("select count(*) from tb_documentary where YEAR(merchandisingtime)=YEAR(now()) AND QUARTER(merchandisingtime) = QUARTER(NOW())")
    public Integer statNowQuarter();
    /**
     * 查询上季度跟单数量
     * @return
     */
    @Select("select count(*) from tb_documentary where YEAR(merchandisingtime)=YEAR(now()) AND  QUARTER(merchandisingtime)=QUARTER(DATE_SUB(now(),interval 1 QUARTER))")
    public Integer statLastQuarter();

    /**
     * 查询本年度跟单数量
     * @return
     */
    @Select("select count(*) from tb_documentary where YEAR(merchandisingtime)=YEAR(NOW())")
    public Integer statNowYear();
    /**
     * 查询上年度跟单数量
     * @return
     */
    @Select("select count(*) from tb_documentary where YEAR(merchandisingtime)=YEAR(NOW())")
    public Integer statLastYear();

    /*
    * 查个人的各个时间段数量
    * */
    /**
     * 查询本周跟单数量
     * @return
     */
    @Select("select count(*) from tb_documentary where YEARWEEK(date_format(merchandisingtime,'%Y-%m-%d'),1) = YEARWEEK(now(),1) and merchandisingpeople=#{eid}")
    public Integer statNowWeek1(Integer eid);
    /**
     * 查询上周跟单数量
     * @return
     */
    @Select("select count(*) from tb_documentary where YEARWEEK(date_format(merchandisingtime,'%Y-%m-%d'),1) = YEARWEEK(now(),1)-1 and merchandisingpeople=#{eid}")
    public Integer statLastWeek1(Integer eid);

    /**
     * 查询本月跟单数量
     * @return
     */
    @Select("select count(*) from tb_documentary where date_format(merchandisingtime,'%Y-%m')=date_format(now(),'%Y-%m') and merchandisingpeople=#{eid}")
    public Integer statNowMon1(Integer eid);
    /**
     * 查询上月跟单数量
     * @return
     */
    @Select("select count(*) from tb_documentary where date_format(merchandisingtime,'%Y-%m')=date_format(DATE_SUB(curdate(), INTERVAL 1 MONTH),'%Y-%m') and merchandisingpeople=#{eid}")
    public Integer statLastMon1(Integer eid);

    /**
     * 查询本季度跟单数量
     * @return
     */
    @Select("select count(*) from tb_documentary where YEAR(merchandisingtime)=YEAR(now()) AND QUARTER(merchandisingtime) = QUARTER(NOW()) and merchandisingpeople=#{eid}")
    public Integer statNowQuarter1(Integer eid);
    /**
     * 查询上季度跟单数量
     * @return
     */
    @Select("select count(*) from tb_documentary where YEAR(merchandisingtime)=YEAR(now()) AND  QUARTER(merchandisingtime)=QUARTER(DATE_SUB(now(),interval 1 QUARTER)) and merchandisingpeople=#{eid}")
    public Integer statLastQuarter1(Integer eid);

    /**
     * 查询本年度跟单数量
     * @return
     */
    @Select("select count(*) from tb_documentary where YEAR(merchandisingtime)=YEAR(NOW()) and merchandisingpeople=#{eid}")
    public Integer statNowYear1(Integer eid);
    /**
     * 查询上年度跟单数量
     * @return
     */
    @Select("select count(*) from tb_documentary where YEAR (merchandisingtime) = YEAR (date_sub(now(), INTERVAL 1 YEAR)) and merchandisingpeople=#{eid}")
    public Integer statLastYear1(Integer eid);
}
