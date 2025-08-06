package com.example.demo.weatherService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class serviceforweather {

    @Value("${weather.api.key}")       // اینجا اسم کلید رو نوشتیم که در application.properties هست اصل کلید اونجا هست نه اینجا
    private String apikey;

    //یک کلاس از اسپرینگ برای ارسال درخواست‌های HTTP به APIهای خارجی است.
    private final RestTemplate restTemplate = new RestTemplate();

    public String getWeather(String city){
        //  ادرس زیر ادرس همون سایتی هستت که ازش  api گرفتیم
        String url = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&units=metric&appid=" + apikey ;

        return restTemplate.getForObject(url , String.class);
    }













}
