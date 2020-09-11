package com.huayu.management.bo;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class MonCount {
    private String name;
    private Integer sjmon1;
    private Integer sjmon2;
    private Integer cjmon1;
    private Integer cjmon2;
    private Integer gdmon1;
    private Integer gdmon2;
    private Integer htmon1;
    private Integer htmon2;
}
