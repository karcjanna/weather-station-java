package pl.kkas.weatherstation;

public class WeatherStation {
   
   private TempSensor tempSensor;
   
   public WeatherStation(TempSensor tempSensor) {
       this.tempSensor = tempSensor;
   }

   public double temperature() {
       return tempSensor.read();
   }
}
