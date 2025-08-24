package com.example.demo.weatherService;

import com.example.demo.WeatherDATA.WeatherResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class serviceforweather {

    @Value("${weather.api.key}")       // اینجا اسم کلید رو نوشتیم که در application.properties هست اصل کلید اونجا هست نه اینجا
    private String apikey;

    //یک کلاس از اسپرینگ برای ارسال درخواست‌های HTTP به APIهای خارجی است.
    private final RestTemplate restTemplate = new RestTemplate();

    private final ObjectMapper objectMapper;

    public serviceforweather(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

//    public String getWeather(String city){
//        //  ادرس زیر ادرس همون سایتی هستت که ازش api گرفتیم
//        String url = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&units=metric&appid=" + apikey ;
//
//        return restTemplate.getForObject(url , String.class);
//    }

    public WeatherResponse GETweather(String city) throws JsonProcessingException {
        String url = "https://api.openweathermap.org/data/2.5/weather?q=" + city
                + "&units=metric&appid=" + apikey;

        String json = restTemplate.getForObject(url, String.class);
        return objectMapper.readValue(json, WeatherResponse.class);
    }












}
