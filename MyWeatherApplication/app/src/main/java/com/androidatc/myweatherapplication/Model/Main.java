package com.androidatc.myweatherapplication.Model;


public class Main {
    private double temp;
    private double pressure;
    private int humidity;
    private double temp_min;
    private double temp_max;

    public Main(double temp, double pressure, int humidity, double temp_min, double temp_max) {
        this.temp = temp;
        this.pressure = pressure;
        this.humidity = humidity;
        this.temp_min = temp_min;
        this.temp_max = temp_max;
    }

    public double getTemp() {
        double farenheit;
        farenheit=(temp*9/5)+32;
        return farenheit;
    }

    public void setTemp(double temp) {
        double farenheit;
        farenheit=(temp*9/5)+32;
        this.temp = farenheit;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public double getTemp_min() {
        double farenheit_min;
        farenheit_min=(temp_min*9/5)+32;

        return farenheit_min;
    }

    public void setTemp_min(double temp_min) {
        double farenheit_min;
        farenheit_min=(temp_min*9/5)+32;
        this.temp_min = farenheit_min;
    }

    public double getTemp_max() {
        double farenheit_max;
        farenheit_max=(temp_max*9/5)+32;
        return farenheit_max;
    }

    public void setTemp_max(double temp_max) {
        double farenheit_max;
        farenheit_max=(temp_max*9/5)+32;
        this.temp_max = farenheit_max;
    }
}
