package com.huayu.management.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 合同表

 * </p>
 *
 * @author Song
 * @since 2020-09-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class TbContract implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 客户名称
     */
    private Integer cid;

    /**
     * 合同名称
     */
    private String contract;

    /**
     * 合同编号
     */
    private String contractCode;

    /**
     * 合同金额
     */
    private String sum;

    /**
     * 签约日期
     */
    private String contractDate;

    /**
     * 生效日期
     */
    private String effectiveDate;

    /**
     * 服务期至
     */
    private String expirationTime;

    /**
     * 对方联系人
     */
    private String customerPeople;

    /**
     * 固定电话
     */
    private String customerPhone;

    private Integer cellPhone;

    /**
     * 邮件qq
     */
    private String emailQq;

    /**
     * 主要技术条款
     */
    private String technicalTerm;

    /**
     * 主要商务条款
     */
    private String commerceClause;

    /**
     * 相关附件
     */
    private String accessory;

    /**
     * 部门
     */
    private String department;

    /**
     * 关联人员
     */
    private String associate;


}
