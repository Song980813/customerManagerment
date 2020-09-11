package com.huayu.management.mapper;

import com.huayu.management.bo.Counts;
import com.huayu.management.bo.SjSum;
import com.huayu.management.bo.sjResource;
import com.huayu.management.entity.TbBusiness;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

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
    @Select("select count(*) from tb_business where YEAR (addtime) = YEAR (" +
            "date_sub(now(), INTERVAL 1 YEAR)" +
            ")")
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
    @Select("select count(*) from tb_business where YEAR (addtime) = YEAR (date_sub(now(), INTERVAL 1 YEAR)) and state='成交'")
    public Integer statLastYear1();




    //单个发的说所所所所所所所所所所所所所所
    /**
     * 查询本周商机数量
     * @return
     */
    @Select("select count(*) from tb_business where YEARWEEK(date_format(addtime,'%Y-%m-%d'),1) = YEARWEEK(now(),1) and charge_person=#{eid}")
    public Integer statNowWeek2(Integer eid);
    /**
     * 查询上周商机数量
     * @return
     */
    @Select("select count(*) from tb_business where YEARWEEK(date_format(addtime,'%Y-%m-%d'),1) = YEARWEEK(now(),1)-1 and charge_person=#{eid}")
    public Integer statLastWeek2(Integer eid);

    /**
     * 查询本月商机数量
     * @return
     */
    @Select("select count(*) from tb_business where date_format(addtime,'%Y-%m')=date_format(now(),'%Y-%m') and charge_person=#{eid}")
    public Integer statNowMon2(Integer eid);
    /**
     * 查询上月商机数量
     * @return
     */
    @Select("select count(*) from tb_business where date_format(addtime,'%Y-%m')=date_format(DATE_SUB(curdate(), INTERVAL 1 MONTH),'%Y-%m') and charge_person=#{eid}")
    public Integer statLastMon2(Integer eid);

    /**
     * 查询本季度商机数量
     * @return
     */
    @Select("select count(*) from tb_business where YEAR(addtime)=YEAR(now()) AND QUARTER(addtime) = QUARTER(NOW()) and charge_person=#{eid}")
    public Integer statNowQuarter2(Integer eid);
    /**
     * 查询上季度商机数量
     * @return
     */
    @Select("select count(*) from tb_business where YEAR(addtime)=YEAR(now()) AND  QUARTER(addtime)=QUARTER(DATE_SUB(now(),interval 1 QUARTER)) and charge_person=#{eid}")
    public Integer statLastQuarter2(Integer eid);

    /**
     * 查询本年度商机数量
     * @return
     */
    @Select("select count(*) from tb_business where YEAR(addtime)=YEAR(NOW()) and charge_person=#{eid}")
    public Integer statNowYear2(Integer eid);
    /**
     * 查询上年度商机数量
     * @return
     */
    @Select("select count(*) from tb_business where YEAR (addtime) = YEAR (date_sub(now(), INTERVAL 1 YEAR))and charge_person=#{eid}")
    public Integer statLastYear2(Integer eid);


    /**
     * 查询本周成交数量
     * @return
     */
    @Select("select count(*) from tb_business where YEARWEEK(date_format(addtime,'%Y-%m-%d'),1) = YEARWEEK(now(),1) and state='成交' and charge_person=#{eid}")
    public Integer statNowWeek3(Integer eid);
    /**
     * 查询上周成交数量
     * @return
     */
    @Select("select count(*) from tb_business where YEARWEEK(date_format(addtime,'%Y-%m-%d'),1) = YEARWEEK(now(),1)-1 and state='成交' and charge_person=#{eid}")
    public Integer statLastWeek3(Integer eid);

    /**
     * 查询本月成交数量
     * @return
     */
    @Select("select count(*) from tb_business where date_format(addtime,'%Y-%m')=date_format(now(),'%Y-%m')and state='成交'and charge_person=#{eid} ")
    public Integer statNowMon3(Integer eid);
    /**
     * 查询上月成交数量
     * @return
     */
    @Select("select count(*) from tb_business where date_format(addtime,'%Y-%m')=date_format(DATE_SUB(curdate(), INTERVAL 1 MONTH),'%Y-%m') and state='成交' and charge_person=#{eid}")
    public Integer statLastMon3(Integer eid);

    /**
     * 查询本季度成交数量
     * @return
     */
    @Select("select count(*) from tb_business where YEAR(addtime)=YEAR(now()) AND QUARTER(addtime) = QUARTER(NOW())and state='成交' and charge_person=#{eid}")
    public Integer statNowQuarter3(Integer eid);
    /**
     * 查询上季度成交数量
     * @return
     */
    @Select("select count(*) from tb_business where YEAR(addtime)=YEAR(now()) AND  QUARTER(addtime)=QUARTER(DATE_SUB(now(),interval 1 QUARTER)) and state='成交' and charge_person=#{eid}")
    public Integer statLastQuarter3(Integer eid);

    /**
     * 查询本年度成交数量
     * @return
     */
    @Select("select count(*) from tb_business where YEAR(addtime)=YEAR(NOW()) and state='成交' and charge_person=#{eid}")
    public Integer statNowYear3(Integer eid);
    /**
     * 查询上年度成交数量
     * @return
     */
    @Select("select count(*) from tb_business where YEAR (addtime) = YEAR (" +
            "date_sub(now(), INTERVAL 1 YEAR)" +
            ") and state='成交' and charge_person=#{eid}")
    public Integer statLastYear3(Integer eid);

    /**
     * 根据行业查询商机数量 金额
     * @return
     */
    @Select("select sum(sj.amount) moneySum,count(*) sjCount,kh.industry state from tb_business sj,tb_customer kh where sj.cid=kh.cid GROUP BY kh.industry")
    public List<SjSum> selectSum();

    /**
     * 根据来源查询商机数量 金额
     * @return
     */
    @Select("select sum(amount) moneySum,count(*) sjCount,coustomer_resource resource from tb_business  GROUP BY coustomer_resource")
    public List<sjResource> sjSum();

    /**
     * 查全部商机
     * @return
     */
    @Select("select count(*) from tb_business")
    public Integer sjzongS();
    /**
     * 根据所有商机 金额
     * @return
     */
    @Select("select state state,sum(amount) moneySum,count(*) sjCount  from tb_business Group by state")
    public List<SjSum> sjtongji();

    /**
     * 根据上年度商机 金额
     * @return
     */
    @Select("select state state,sum(amount) moneySum,count(*) sjCount  from tb_business where YEAR (addtime) = YEAR (date_sub(now(), INTERVAL 1 YEAR)) and state='成交' and charge_person=#{eid} Group by state")
    public List<SjSum> sjtong2();
    /**
     * 根据本年度商机 金额
     * @return
     */
    @Select("select state state,sum(amount) moneySum,count(*) sjCount  from tb_business where YEAR(addtime)=YEAR(NOW())  Group by state")
    public List<SjSum> sjtong3();

    /**
     * 根据上季度商机 金额
     * @return
     */
    @Select("select state state,sum(amount) moneySum,count(*) sjCount  from tb_business where YEAR(addtime)=YEAR(now()) AND  QUARTER(addtime)=QUARTER(DATE_SUB(now(),interval 1 QUARTER)) Group by state")
    public List<SjSum> sjtong4();
    /**
     * 根据本季度商机 金额
     * @return
     */
    @Select("select state state,sum(amount) moneySum,count(*) sjCount  from tb_business where YEAR(addtime)=YEAR(now()) AND QUARTER(addtime) = QUARTER(NOW()) Group by state")
    public List<SjSum> sjtong5();
}
