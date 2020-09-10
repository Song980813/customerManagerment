package com.huayu.management.mapper;

import com.huayu.management.entity.TbBusiness;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

/**
 * <p>
 * 商机表
 Mapper 接口
 * </p>
 *
 * @author Song
 * @since 2020-09-02
 */
public interface TbBusinessMapper extends BaseMapper<TbBusiness> {

    /**
     * 查询本周商机数量
     * @return
     */
    @Select("select count(*) from tb_business where YEARWEEK(date_format(addtime,'%Y-%m-%d'),1) = YEARWEEK(now(),1) ")
    public Integer statNowWeek();
    /**
     * 查询上周商机数量
     * @return
     */
    @Select("select count(*) from tb_business where YEARWEEK(date_format(addtime,'%Y-%m-%d'),1) = YEARWEEK(now(),1)-1 ")
    public Integer statLastWeek();

    /**
     * 查询本月商机数量
     * @return
     */
    @Select("select count(*) from tb_business where date_format(addtime,'%Y-%m')=date_format(now(),'%Y-%m') ")
    public Integer statNowMon();
    /**
     * 查询上月商机数量
     * @return
     */
    @Select("select count(*) from tb_business where date_format(addtime,'%Y-%m')=date_format(DATE_SUB(curdate(), INTERVAL 1 MONTH),'%Y-%m') ")
    public Integer statLastMon();

    /**
     * 查询本季度商机数量
     * @return
     */
    @Select("select count(*) from tb_business where YEAR(addtime)=YEAR(now()) AND QUARTER(addtime) = QUARTER(NOW())")
    public Integer statNowQuarter();
    /**
     * 查询上季度商机数量
     * @return
     */
    @Select("select count(*) from tb_business where YEAR(addtime)=YEAR(now()) AND  QUARTER(addtime)=QUARTER(DATE_SUB(now(),interval 1 QUARTER))")
    public Integer statLastQuarter();

    /**
     * 查询本年度商机数量
     * @return
     */
    @Select("select count(*) from tb_business where YEAR(addtime)=YEAR(NOW())")
    public Integer statNowYear();
    /**
     * 查询上年度商机数量
     * @return
     */
    @Select("select count(*) from tb_business where YEAR(addtime)=YEAR(NOW())")
    public Integer statLastYear();


    /**
     * 查询本周成交数量
     * @return
     */
    @Select("select count(*) from tb_business where YEARWEEK(date_format(addtime,'%Y-%m-%d'),1) = YEARWEEK(now(),1) and state='成交'")
    public Integer statNowWeek1();
    /**
     * 查询上周成交数量
     * @return
     */
    @Select("select count(*) from tb_business where YEARWEEK(date_format(addtime,'%Y-%m-%d'),1) = YEARWEEK(now(),1)-1 and state='成交'")
    public Integer statLastWeek1();

    /**
     * 查询本月成交数量
     * @return
     */
    @Select("select count(*) from tb_business where date_format(addtime,'%Y-%m')=date_format(now(),'%Y-%m')and state='成交' ")
    public Integer statNowMon1();
    /**
     * 查询上月成交数量
     * @return
     */
    @Select("select count(*) from tb_business where date_format(addtime,'%Y-%m')=date_format(DATE_SUB(curdate(), INTERVAL 1 MONTH),'%Y-%m') and state='成交'")
    public Integer statLastMon1();

    /**
     * 查询本季度成交数量
     * @return
     */
    @Select("select count(*) from tb_business where YEAR(addtime)=YEAR(now()) AND QUARTER(addtime) = QUARTER(NOW())and state='成交'")
    public Integer statNowQuarter1();
    /**
     * 查询上季度成交数量
     * @return
     */
    @Select("select count(*) from tb_business where YEAR(addtime)=YEAR(now()) AND  QUARTER(addtime)=QUARTER(DATE_SUB(now(),interval 1 QUARTER)) and state='成交'")
    public Integer statLastQuarter1();

    /**
     * 查询本年度成交数量
     * @return
     */
    @Select("select count(*) from tb_business where YEAR(addtime)=YEAR(NOW()) and state='成交'")
    public Integer statNowYear1();
    /**
     * 查询上年度成交数量
     * @return
     */
    @Select("select count(*) from tb_business where YEAR(addtime)=YEAR(NOW()) and state='成交'")
    public Integer statLastYear1();
}
