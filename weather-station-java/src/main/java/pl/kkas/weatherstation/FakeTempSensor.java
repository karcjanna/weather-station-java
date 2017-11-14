package pl.kkas.weatherstation;

public class FakeTempSensor implements TempSensor {
  public double read() {
    return -14.80;
  }
}
