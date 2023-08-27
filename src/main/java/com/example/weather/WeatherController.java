package com.example.weather;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/weather")
public class WeatherController {

    @GetMapping("/data")
    public ResponseEntity<List<WeatherData>> getWeatherData() {
        try {
            // Create an instance of DataGenerator
            // DataGenerator dataGenerator = new DataGenerator();

            // Generate weather data using DataGenerator
            List<WeatherData> weatherData = DataGenerator.generateWeatherData();

            // Return the generated data as JSON
            return ResponseEntity.ok(weatherData);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}

