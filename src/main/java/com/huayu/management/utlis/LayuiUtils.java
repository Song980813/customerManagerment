package com.huayu.management.utlis;

import java.util.List;

public class LayuiUtils {

    @Override
    public String toString() {
        return "LayuiUtils{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", count='" + count + '\'' +
                ", data=" + data +
                '}';
    }

    private  String code;
    private  String msg;
    private int count;
    private List data;
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }


    public List getData() {
        return data;
    }

    public void setData(List data) {
        this.data = data;
    }

}
