package com.example.demo.WeatherDATA;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import org.springframework.stereotype.Component;

import java.util.List;

@JacksonXmlRootElement(localName = "WeatherResponse")
@Component
public class WeatherResponse {

    @JsonProperty("name")
    @JacksonXmlProperty(localName = "location")
    private String city;

    @JsonProperty("main")
    private Main main;

    @JsonProperty("weather")
    private List<WeatherData> weather;


    @JacksonXmlProperty(localName = "City")
    public String getCity() {
        return city != null ? city : "Unknown" ;
    }

    @JacksonXmlProperty(localName = "temprature")
    public double getTemprature(){
        return main != null ? main.temp : 0.0;
    }

    @JacksonXmlProperty(localName = "Condition")
    public String getCondition() {
        if (weather != null && !weather.isEmpty()){
            return weather.get(0).getDescription();
        }
        return "No data";
    }





    public static class Main{
        @JsonProperty("temp")
        public double temp;
    }

    public static class weather{
        @JsonProperty("description")
        public String description;
    }
}
