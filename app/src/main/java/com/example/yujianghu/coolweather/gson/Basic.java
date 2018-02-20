package com.example.yujianghu.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by yujianghu on 2018/2/19.
 */

public class Basic {

    @SerializedName("cid")
    public String weatherId;

    @SerializedName("location")
    public String cityName;

    @SerializedName("parent_city")
    public String parentCity;

    @SerializedName("admin_area")
    public String adminArea;

    public String cnty;

    public String lat;

    public String lon;

    public String tz;

}
