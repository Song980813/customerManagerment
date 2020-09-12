package com.huayu.management.bo;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class JiduCount {
    private String name;
    private Integer sjjidu1;
    private Integer sjjidu2;
    private Integer cjjidu1;
    private Integer cjjidu2;
    private Integer gdjidu1;
    private Integer gdjidu2;
    private Integer htjidu1;
    private Integer htjidu2;
}
