package com.example.weather;
import com.fasterxml.jackson.annotation.JsonProperty;

public class WeatherData {
    @JsonProperty("id")
    private int id;

    @JsonProperty("temp")
    private double temp;

    @JsonProperty("feels_like")
    private double feels_like;

    @JsonProperty("main")
    private String main;

    @JsonProperty("wind_speed")
    private double wind_speed;

    @JsonProperty("humidity")
    private int humidity;

    public WeatherData() {}

    public WeatherData(double temp, double feels_like, String main, double wind_speed, int humidity) {
        this.temp = temp;
        this.feels_like = feels_like;
        this.main = main;
        this.wind_speed = wind_speed;
        this.humidity = humidity;
    }

    public int getId() {
        return humidity;
    }

    public void setId(int humidity) {
        this.humidity = humidity;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getFeels_like() {
        return feels_like;
    }

    public void setFeels_like(double feels_like) {
        this.feels_like = feels_like;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public double getWind_speed() {
        return wind_speed;
    }

    public void setWind_speed(double wind_speed) {
        this.wind_speed = wind_speed;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }
}
