package com.coolweather.android.gson;

/**
 * Created by Akalin on 2017/1/7.
 */
public class AQI {

    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
