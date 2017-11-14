package pl.kkas.weatherapp;

import pl.kkas.weatherstation.WeatherStation;
import pl.kkas.weatherstation.FakeTempSensor;
import pl.kkas.weatherstation.TempSensor;

public class Cli {
    public static void main(String[] args) {
        String city = "Krakow";
        
        TempSensor tempSensor = new FakeTempSensor();
        WeatherStation station = new WeatherStation(tempSensor);

        Double temp = station.temperature();

        System.out.printf("Weather in %s| Temp: %s\n", city, temp);
    }
}

