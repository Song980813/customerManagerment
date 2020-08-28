package com.huayu.management.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 开单据表
 * </p>
 *
 * @author Song
 * @since 2020-08-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class TbInvoice implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 开票id
     */
    @TableId(value = "invoiceid", type = IdType.AUTO)
    private Integer invoiceid;

    /**
     * 开票主题
     */
    private String theme;

    /**
     * 步骤
     */
    private String step;

    /**
     * 责任人
     */
    private String personliable;

    /**
     * 参与人
     */
    private String participants;

    /**
     * 详细地址
     */
    private String detailedaddress;

    /**
     * 声请人姓名
     */
    private String nameofapplicant;

    /**
     * 所属部门
     */
    private String department;

    /**
     * 申请日期
     */
    private String applicatdate;

    /**
     * 技术条款
     */
    private String technicalterms;

    /**
     * 对方单位名称
     */
    private String unitname;

    /**
     * 关联合同
     */
    private String associated;

    /**
     * 开票种类
     */
    private String invoicetype;

    /**
     * 税纳人编号
     */
    private Integer identification;

    /**
     * 开户行及账号
     */
    private String accountnum;

    /**
     * 地址和电话
     */
    private String addressnum;

    /**
     * 金额
     */
    private Float invoiceamount;

    /**
     * 金额大写
     */
    private String amountinwords;

    /**
     * 开票日期
     */
    private String invoicedate;

    /**
     * 开票号码
     */
    private String invoicenumber;

    /**
     * 附件
     */
    private String enclosure;


}
