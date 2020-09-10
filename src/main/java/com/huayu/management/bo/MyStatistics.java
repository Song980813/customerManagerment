package com.huayu.management.bo;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 我的统计实体类
 * @author @Song
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class MyStatistics {

    /**
     * 统计时间段
     */
    Integer cNum;
    /**
     * 统计数量
     */
    Integer counts;
}
