package com.example.yujianghu.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by yujianghu on 2018/2/19.
 */

public class Weather {

    public Basic basic;

    public Update update;

    public String status;

//    public AQI aqi;

    public Now now;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;

    @SerializedName("lifestyle")
    public List<Suggestion> suggestionList;

//    @SerializedName("sunrise_sunset")
//    public List<Sun> sunList;



}
