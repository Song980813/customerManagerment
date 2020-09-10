package com.huayu.management.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * <p>
 * 商机表

 * </p>
 *
 * @author Song
 * @since 2020-09-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class TbBusiness implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "sid", type = IdType.AUTO)
    private Integer sid;

    /**
     * 商机名称
     */
    private String boName;

    /**
     * 客户来源
     */
    private String coustomerResource;

    /**
     * 预计成交金额
     */
    private Integer amount;

    /**
     * 预计截单日期
     */
    private String closingdate;

    /**
     * 联系人
     */
    private String coustomer;

    /**
     * 所属部门
     */
    private String deptment;

    /**
     * 职务
     */
    private String job;

    /**
     * 固定电话
     */
    private String telephone;

    /**
     * 移动电话
     */
    private Integer mobilePhone;

    /**
     * 邮件QQ
     */
    private String emailQq;

    /**
     * 主要业务需求
     */
    private String requirements;

    /**
     * 相关附件
     */
    private String enclosure;

    /**
     * 商机所属部门
     */
    private String department;

    /**
     * 商机负责人
     */
    private Integer chargePerson;

    /**
     * 参与人
     */
    private String participants;

    /**
     * 商机关注人
     */
    private Integer focusPeople;

    /**
     * 状态
     */
    private String state;

    /**
     * 客户ID
     */
    private int cid;
    /**
     *
     */
    private String cname;
    /**
     * 所属行业
     */
    private String industry;
    /**
     * 所在城市
     */
    private String city;
    /**
     * 详细地址
     */
    private String address;
}
