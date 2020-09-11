package com.huayu.management.bo;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Song
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class sjResource {
    private String resource;
    private Integer moneySum;
    private  Integer sjCount;

    public sjResource(String resource,Integer moneySum,Integer sjCount){
        this.resource=resource;
        this.moneySum=moneySum;
        this.sjCount=sjCount;
    }
}
