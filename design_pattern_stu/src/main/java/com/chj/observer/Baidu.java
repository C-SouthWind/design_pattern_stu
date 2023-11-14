package com.chj.observer;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.observer
 * @className: Baidu
 * @author: chj
 * @description:
 * @date: Created in  2023/9/7 19:58
 * @version: 1.0
 */
public class Baidu implements Observer{

    private float temperature;
    private float pressure;
    private float humidity;

    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }
    public void display(){
        System.out.println("baidu==================");
        System.out.println("temperature = " + temperature);
        System.out.println("pressure = " + pressure);
        System.out.println("humidity = " + humidity);
    }
}
