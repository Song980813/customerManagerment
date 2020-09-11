package com.huayu.management.bo;

public class CustomerUtlis {
    private int  kid ;//客户id
    private  String kname;//客户名称

    public int getKid() {
        return kid;
    }

    public float getHkmoney() {
        return hkmoney;
    }

    @Override
    public String toString() {
        return "CustomerUtlis{" +
                "kid=" + kid +
                ", kname='" + kname + '\'' +
                ", buinsnum=" + buinsnum +
                ", yjmoney=" + yjmoney +
                ", htnum=" + htnum +
                ", htmoney=" + htmoney +
                ", hkmoney=" + hkmoney +
                ", shfwnum=" + shfwnum +
                ", fwjf=" + fwjf +
                '}';
    }

    public void setHkmoney(float hkmoney) {
        this.hkmoney = hkmoney;
    }

    public void setKid(int kid) {
        this.kid = kid;
    }

    public String getKname() {
        return kname;
    }

    public void setKname(String kname) {
        this.kname = kname;
    }

    public int getBuinsnum() {
        return buinsnum;
    }

    public void setBuinsnum(int buinsnum) {
        this.buinsnum = buinsnum;
    }

    public int getYjmoney() {
        return yjmoney;
    }

    public void setYjmoney(int yjmoney) {
        this.yjmoney = yjmoney;
    }

    public int getHtnum() {
        return htnum;
    }

    public void setHtnum(int htnum) {
        this.htnum = htnum;
    }

    public int getHtmoney() {
        return htmoney;
    }

    public void setHtmoney(int htmoney) {
        this.htmoney = htmoney;
    }



    public int getShfwnum() {
        return shfwnum;
    }

    public void setShfwnum(int shfwnum) {
        this.shfwnum = shfwnum;
    }

    public int getFwjf() {
        return fwjf;
    }

    public void setFwjf(int fwjf) {
        this.fwjf = fwjf;
    }

    private  int buinsnum;//商机数
    private  int  yjmoney;//预计成交金额
    private  int htnum;//合同数量
    private  int htmoney;//合同金额
    private  float hkmoney;//回款额
    private  int  shfwnum;//售后服务输数
    private  int fwjf;//服务均分


}
