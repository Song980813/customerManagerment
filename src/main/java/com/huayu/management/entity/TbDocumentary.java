package com.huayu.management.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 跟单表
 * </p>
 *
 * @author Song
 * @since 2020-09-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class TbDocumentary implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 跟单时间
     */
    private String merchandisingtime;

    /**
     * 分类
     */
    private String classify;

    /**
     * 跟单人
     */
    private Integer merchandisingpeople;

    /**
     * 详细内容
     */
    private String details;

    /**
     * 相关附件
     */
    private String enclosure;

    /**
     * 跟单主题
     */

    private String documentarytheme;
    /**
     * 商机id
     */

    private String sid;
    @Override
    public String toString() {
        return "TbDocumentary{" +
                "id=" + id +
                ", merchandisingtime='" + merchandisingtime + '\'' +
                ", classify='" + classify + '\'' +
                ", merchandisingpeople=" + merchandisingpeople +
                ", details='" + details + '\'' +
                ", enclosure='" + enclosure + '\'' +
                ", documentarytheme='" + documentarytheme + '\'' +
                '}';
    }
}
