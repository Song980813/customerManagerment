package com.huayu.management.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 客户表
 * </p>
 *
 * @author Song
 * @since 2020-09-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class TbCustomer implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    @TableId(value = "cid", type = IdType.AUTO)
    private Integer cid;

    /**
     * 客户名称
     */
    private String customerName;

    /**
     * 拼音
     */
    private String pinyin;

    /**
     * 分类
     */
    private String classification;

    /**
     * 客户来源
     */
    private String customerSource;

    /**
     * 所属行业
     */
    private String industry;

    /**
     * 客户网址
     */
    private String customerWebsite;

    /**
     * 国家地区
     */
    private String countryAddress;

    /**
     * 所在城市
     */
    private String city;

    /**
     * 详细地址
     */
    private String address;

    /**
     * 邮政编码
     */
    private Integer postalcode;

    /**
     * 传真
     */
    private String fax;

    /**
     * 联系人
     */
    private String contacts;

    /**
     * 所属部门
     */
    private String department;

    /**
     * 职务
     */
    private String job;

    /**
     * 办公电话
     */
    private String officePhone;

    /**
     * 移动电话
     */
    private Integer telephone;

    /**
     * 邮件qq
     */
    private String emailQq;

    /**
     * 法人
     */
    private String legalPerson;

    /**
     * 注册资本
     */
    private Integer capital;

    /**
     * 附加说明
     */
    private String notes;

    /**
     * 银行卡号
     */
    private Integer bankcard;

    /**
     * 开户人姓名
     */
    private String accountName;

    private String deposit;

    /**
     * 银行地址
     */
    private String bankAddress;

    /**
     * 税号
     */
    private String dutyParagraph;

    /**
     * 银行电话
     */
    private String bankPhone;

    /**
     * 添加时间
     */
    private String startime;


}
