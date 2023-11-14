package com.chj.factory.simple_factory.factory;

import com.chj.factory.simple_factory.pizza.GreekPizza;
import com.chj.factory.simple_factory.pizza.PepperPizza;
import com.chj.factory.simple_factory.pizza.Pizza;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.factory.simple_factory.factory
 * @className: SimpleFactory
 * @author: chj
 * @description: 披萨工厂
 * @date: Created in  2023/7/6 20:20
 * @version: 1.0
 */
public class SimpleFactory {

    public static void createPizza(String orderType){
        Pizza pizza = null;
        switch (orderType){
            case "希腊" : pizza = new GreekPizza(); break;
            case "胡椒" : pizza = new PepperPizza();break;
        }
        pizza.pizzaFlow(orderType);
    }
}
