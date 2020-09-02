package com.huayu.management.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 帖子回复表
 * </p>
 *
 * @author Song
 * @since 2020-09-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class TbReply implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 回复id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 回复帖子
     */
    private Integer postid;

    /**
     * 回复人
     */
    private Integer empid;

    /**
     * 回复内容
     */
    private String content;

    /**
     * 回复时间
     */
    private String startime;


}
