package com.huayu.management.bo;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class YearCount {
    private String name;
    private Integer sjyear1;
    private Integer sjyear2;
    private Integer cjyear1;
    private Integer cjyear2;
    private Integer gdyear1;
    private Integer gdyear2;
    private Integer htyear1;
    private Integer htyear2;
}
