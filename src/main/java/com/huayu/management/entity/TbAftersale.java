package com.huayu.management.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 售后服务表
 * </p>
 *
 * @author Song
 * @since 2020-09-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class TbAftersale implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 售后服务id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 主题
     */
    private String theme;

    /**
     * 步骤
     */
    private String step;

    /**
     * 任责人
     */
    private String personliable;

    /**
     * 参与人
     */
    private String participants;

    /**
     * 客户名称
     */
    private String customername;

    /**
     * 合同编号
     */
    private String contractno;

    /**
     * 合同主要信息
     */
    private String mcinformation;

    /**
     * 对方联系人
     */
    private String conperson;

    /**
     * 固定电话
     */
    private String fixtelephone;

    /**
     * 移动电话
     */
    private String mobphone;

    /**
     * 邮箱qq
     */
    private String emailqq;

    /**
     * 服务类型
     */
    private String servicetype;

    /**
     * 服务方式
     */
    private String servicem;

    /**
     * 开始时间
     */
    private String startime;

    /**
     * 结束时间
     */
    private String endtime;

    /**
     * 服务内容
     */
    private String sercontent;

    /**
     * 客户反馈
     */
    private String cusfeedba;

    /**
     * 服务人员
     */
    private String serperson;

    /**
     * 服务评分
     */
    private String serrating;

    /**
     * 相关附件
     */
    private String relattachm;


}
