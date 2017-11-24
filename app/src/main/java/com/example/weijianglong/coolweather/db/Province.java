package com.example.weijianglong.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by weijianglong on 2017/11/24.
 */

public class Province extends DataSupport{
    private int id;
    private String provinceName;
    private int provinceCode;//省的代号

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getProvinceName(){
        return provinceName;
    }
    public void setProvinceName(String provinceName){
        this.provinceName = provinceName;
    }
    public int getProvinceCode(){
        return provinceCode;
    }
    public void setProvinceCode(int provinceCode){
        this.provinceCode = provinceCode;
    }

}
