package com.chj.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.observer
 * @className: WeatherData
 * @author: chj
 * @description:
 * @date: Created in  2023/9/7 19:53
 * @version: 1.0
 */
public class WeatherData implements Subject{

    private float temperature;
    private float pressure;
    private float humidity;

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    private List<Observer> observerList = new ArrayList<>();

    @Override
    public void registerObserver(Observer o) {
        observerList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void registerObserver() {
        for (Observer observer : observerList) {
            observer.update(temperature,pressure,humidity);
        }
    }
}
