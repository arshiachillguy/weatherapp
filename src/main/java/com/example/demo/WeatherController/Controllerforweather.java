package com.example.demo.WeatherController;

import com.example.demo.weatherService.serviceforweather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/weather") // ادرس پیش فرض در حال حاضر localhost:8080/weather
@RestController
public class Controllerforweather {

    // در نسخه های جدید اسپرینگ اگر کلا یک constructor داشته باشه کلاس ما به صورت خودکار میاد اینجا و نیازی به تزریق وابستگی با استفاده از AutoWired@ نیست
    //
    private final serviceforweather serviceforweather;

    public Controllerforweather(serviceforweather serviceforweather) {
        this.serviceforweather = serviceforweather;
    }
    // در صفحه وب ما کنترلر ما به ادرس پیشفرض پیام هارو میفرسته که این ادرس پیشفرض اخرش باید اسم شهر باشه تا این کنترلر کار کنه
    // دلیل استفاده از متد getmapping هم مشخصه ما فقط میخواییم اطلاعات رو بگیریم همین
    @GetMapping("/{city}")
    public String GetWeather(@PathVariable String city){
        return serviceforweather.getWeather(city);
    }



}
