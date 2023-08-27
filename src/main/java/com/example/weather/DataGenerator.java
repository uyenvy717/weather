package com.example.weather;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.InputStream;
import java.util.List;

import org.springframework.core.io.ClassPathResource;
public class DataGenerator {
    public static List<WeatherData> generateWeatherData() {
        List<WeatherData> items = null;
        try {
            // Create an ObjectMapper
            ObjectMapper objectMapper = new ObjectMapper();

            // Get an InputStream for the JSON file using ClassPathResource
            ClassPathResource resource = new ClassPathResource("sample-data.json");
            InputStream inputStream = resource.getInputStream();

            // Read the JSON file and convert it into a List of Item objects
            items = objectMapper.readValue(
                inputStream,
                new TypeReference<List<WeatherData>>() {}
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
        return items;
    }
}
