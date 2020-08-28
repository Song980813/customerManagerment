package com.huayu.management.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 发帖表
 * </p>
 *
 * @author Song
 * @since 2020-08-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class TbPost implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    /**
     * 贴子分类
     */
    private String postclass;

    /**
     * 标签
     */
    private String label;

    /**
     * 主题
     */
    private String theme;

    /**
     * 附件
     */
    private String enclosure;

    /**
     * 帖子内容
     */
    private String content;

    /**
     * 发帖人
     */
    private Integer empid;

    /**
     * 点赞数
     */
    private Integer likesNum;

    /**
     * 回复数
     */
    private Integer repliesNum;

    /**
     * 发帖时间
     */
    private String startime;


}
