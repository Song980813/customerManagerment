package com.huayu.management.bo;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class WeekCount {
    private String name;
    private Integer sjweek1;
    private Integer sjweek2;
    private Integer cjweek1;
    private Integer cjweek2;
    private Integer gdweek1;
    private Integer gdweek2;
    private Integer htweek1;
    private Integer htweek2;
}
