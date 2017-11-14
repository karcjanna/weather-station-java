package pl.kkas.openweatherapi;

import pl.kkas.weatherstation.TempSensor;

class ApiTempSensor implements TempSensor {
    
    public double read() {
       return 1.00;
    }
}
