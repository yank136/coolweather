package com.example.yujianghu.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by yujianghu on 2018/2/19.
 */

public class Now {

    public String cloud;

    @SerializedName("cond_code")
    public String condCode;

    @SerializedName("cond_txt")
    public String info;

    public String fl;

    public String hum;

    public String pcpn;

    public String pres;

    @SerializedName("tmp")
    public String temperature;

    public String vis;
    @SerializedName("wind_deg")
    public String windDeg;
    @SerializedName("wind_dir")
    public String windDir;
    @SerializedName("wind_sc")
    public String windSc;
    @SerializedName("wind_spd")
    public String windSpd;
}
