package com.huayu.management.mapper;

import com.huayu.management.entity.TbContract;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

/**
 * <p>
 * 合同表
 Mapper 接口
 * </p>
 *
 * @author Song
 * @since 2020-09-02
 */
public interface TbContractMapper extends BaseMapper<TbContract> {
    /**
     * 查询本周合同数量
     * @return
     */
    @Select("select count(*) from tb_contract where YEARWEEK(date_format(contract_date,'%Y-%m-%d'),1) = YEARWEEK(now(),1) ")
    public Integer statNowWeek();
    /**
     * 查询上周合同数量
     * @return
     */
    @Select("select count(*) from tb_contract where YEARWEEK(date_format(contract_date,'%Y-%m-%d'),1) = YEARWEEK(now(),1)-1 ")
    public Integer statLastWeek();

    /**
     * 查询本月合同数量
     * @return
     */
    @Select("select count(*) from tb_contract where date_format(contract_date,'%Y-%m')=date_format(now(),'%Y-%m') ")
    public Integer statNowMon();
    /**
     * 查询上月合同数量
     * @return
     */
    @Select("select count(*) from tb_contract where date_format(contract_date,'%Y-%m')=date_format(DATE_SUB(curdate(), INTERVAL 1 MONTH),'%Y-%m') ")
    public Integer statLastMon();

    /**
     * 查询本季度合同数量
     * @return
     */
    @Select("select count(*) from tb_contract where YEAR(contract_date)=YEAR(now()) AND QUARTER(contract_date) = QUARTER(NOW())")
    public Integer statNowQuarter();
    /**
     * 查询上季度合同数量
     * @return
     */
    @Select("select count(*) from tb_contract where YEAR(contract_date)=YEAR(now()) AND  QUARTER(contract_date)=QUARTER(DATE_SUB(now(),interval 1 QUARTER))")
    public Integer statLastQuarter();

    /**
     * 查询本年度合同数量
     * @return
     */
    @Select("select count(*) from tb_contract where YEAR(contract_date)=YEAR(NOW())")
    public Integer statNowYear();
    /**
     * 查询上年度合同数量
     * @return
     */
    @Select("select count(*) from tb_contract where YEAR(contract_date)=YEAR(NOW())")
    public Integer statLastYear();

    /*
    * 查询个人各个时间段合同数量
    * */
    /**
     * 查询本周合同数量
     * @return
     */
    @Select("select count(*) from tb_contract where YEARWEEK(date_format(contract_date,'%Y-%m-%d'),1) = YEARWEEK(now(),1) and associate=#{eid}")
    public Integer statNowWeek1(Integer eid);
    /**
     * 查询上周合同数量
     * @return
     */
    @Select("select count(*) from tb_contract where YEARWEEK(date_format(contract_date,'%Y-%m-%d'),1) = YEARWEEK(now(),1)-1 and associate=#{eid}")
    public Integer statLastWeek1(Integer eid);

    /**
     * 查询本月合同数量
     * @return
     */
    @Select("select count(*) from tb_contract where date_format(contract_date,'%Y-%m')=date_format(now(),'%Y-%m') and associate=#{eid}")
    public Integer statNowMon1(Integer eid);
    /**
     * 查询上月合同数量
     * @return
     */
    @Select("select count(*) from tb_contract where date_format(contract_date,'%Y-%m')=date_format(DATE_SUB(curdate(), INTERVAL 1 MONTH),'%Y-%m') and associate=#{eid}")
    public Integer statLastMon1(Integer eid);

    /**
     * 查询本季度合同数量
     * @return
     */
    @Select("select count(*) from tb_contract where YEAR(contract_date)=YEAR(now()) AND QUARTER(contract_date) = QUARTER(NOW()) and associate=#{eid}")
    public Integer statNowQuarter1(Integer eid);
    /**
     * 查询上季度合同数量
     * @return
     */
    @Select("select count(*) from tb_contract where YEAR(contract_date)=YEAR(now()) AND  QUARTER(contract_date)=QUARTER(DATE_SUB(now(),interval 1 QUARTER)) and associate=#{eid}")
    public Integer statLastQuarter1(Integer eid);

    /**
     * 查询本年度合同数量
     * @return
     */
    @Select("select count(*) from tb_contract where YEAR(contract_date)=YEAR(NOW()) and associate=#{eid}")
    public Integer statNowYear1(Integer eid);
    /**
     * 查询上年度合同数量
     * @return
     */
    @Select("select count(*) from tb_contract where  YEAR (contract_date) = YEAR (date_sub(now(), INTERVAL 1 YEAR)) and associate=#{eid}")
    public Integer statLastYear1(Integer eid);

    /**
     * 查询全部合同数量
     * @return
     */
    @Select("select count(*) from tb_contract")
    public Integer contracts();
}
