package com.example.weijianglong.coolweather.gson;

/**
 * Created by weijianglong on 2017/11/24.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
