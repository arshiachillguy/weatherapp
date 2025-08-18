package com.example.demo.WeatherDATA;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import org.springframework.stereotype.Component;

@JacksonXmlRootElement(localName = "WeatherResponse")
@Component
public class WeatherResponse {
    @JacksonXmlProperty(localName = "location")
    private String city;

    @JacksonXmlProperty(localName = "Temperature")
    private double temp;

    @JacksonXmlProperty(localName = "Condition")
    private String description;


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
