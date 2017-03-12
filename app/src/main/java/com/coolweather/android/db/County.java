package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by weailily on 2017/3/12 0012.
 */
public class County extends DataSupport {

    private int id;

    private  String countyName;//记录县名

    private String weatherId;//县所对应的的天气ID

    private int cityId;//当前所属市ID

    public int getId() {
        return id;
    }

    public int getCityId() {
        return cityId;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
