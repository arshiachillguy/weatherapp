package com.example.demo.WeatherDATA;

import lombok.Setter;

import java.time.LocalDateTime;

public class WeatherData {

    @Setter
    private String city;
    @Setter
    private int temperature;
    @Setter
    private String description;
    @Setter
    private int humidity;
    @Setter
    private int windSpeed;
    private LocalDateTime timestamp;


    // constructor
    public WeatherData(){
        this.timestamp = LocalDateTime.now();
    }


    public String getCity() {
        return city;
    }

    public int getTemperature() {
        return temperature;
    }

    public String getDescription() {
        return description;
    }

    public int getHumidity() {
        return humidity;
    }

    public int getWindSpeed() {
        return windSpeed;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString(){
        return "WeatherData{" + "cityname = " + city + '\'' +  ", temperature = " + temperature + "description = "
                   + description +  '\'' + ", humidity" + humidity + ", windSpeed =" + windSpeed + ", timestamp" + timestamp +'}'; }
}
