package com.example.yujianghu.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by yujianghu on 2018/2/19.
 */

public class Forecast {
    @SerializedName("cond_code_d")
    public String condCodeD;
    @SerializedName("cond_code_n")
    public String condCodeN;

    @SerializedName("cond_txt_d")
    public String info;
    @SerializedName("cond_txt_n")
    public String condTxtN;
    public String date;

    public String hum;
    public String mr;
    public String ms;
    public String pcpn;
    public String pop;
    public String pres;
    public String sr;
    public String ss;

    @SerializedName("tem_max")
    public String max;
    @SerializedName("tem_min")
    public String min;
    @SerializedName("uv_index")
    public String uvIndex;
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
