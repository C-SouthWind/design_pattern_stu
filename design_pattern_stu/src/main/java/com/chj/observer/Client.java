package com.chj.observer;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.observer
 * @className: Client
 * @author: chj
 * @description:
 * @date: Created in  2023/9/7 19:56
 * @version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        weatherData.registerObserver(new CurrentConditions());
        weatherData.registerObserver(new Baidu());
        weatherData.setTemperature(1);
        weatherData.setHumidity(2);
        weatherData.setPressure(3);
        weatherData.registerObserver();
    }
}
