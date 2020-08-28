package com.huayu.management.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 收入登记
 * </p>
 *
 * @author Song
 * @since 2020-08-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class TbIncome implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 收入id
     */
    @TableId(value = "revenueid", type = IdType.AUTO)
    private Integer revenueid;

    /**
     * 收入日期
     */
    private String revenuedate;

    /**
     * 收入分类
     */
    private String classification;

    /**
     * 收入金额
     */
    private Float incomeamount;

    /**
     * 大写
     */
    private String capitalize;

    /**
     * 收款方式
     */
    private String paymentmethod;

    /**
     * 登记人
     */
    private String registrant;

    /**
     * 关联人员
     */
    private String relapersonnel;

    /**
     * 关联部门
     */
    private String reladepartments;

    /**
     * 对方单位
     */
    private String oppositeunit;

    /**
     * 关联合同
     */
    private String acsdgual;

    /**
     * 收入说明
     */
    private String statement;


}
