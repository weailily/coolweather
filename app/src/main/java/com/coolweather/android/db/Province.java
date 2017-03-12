package com.coolweather.android.db;

import org.litepal.crud.DataSupport;


public class Province extends DataSupport {
    private int id;//实体中都应该有的字段

    private String provinceName;

    private int provinceCode;//省代号

    public void setId(int id) {
        this.id = id;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getProvinceName() {

        return provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public int getId() {

        return id;
    }



}
