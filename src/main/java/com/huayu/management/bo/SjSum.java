package com.huayu.management.bo;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class SjSum {
    String stat;
    Integer sjCount;
    Integer moneySum;
    public SjSum(String stat,Integer sjCount,Integer moneySum){
        this.stat=stat;
        this.moneySum=moneySum;
        this.sjCount=sjCount;
    }
}
