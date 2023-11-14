package com.chj.factory.method_factory.factory;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.factory.simple_factory.factory
 * @className: SimpleFactory
 * @author: chj
 * @description: 披萨工厂
 * @date: Created in  2023/7/6 20:20
 * @version: 1.0
 */
public abstract class SimpleFactory {

    public abstract void createPizza(String orderType);

//    public static void createPizza(String orderType){
//        Pizza pizza = null;
//        switch (orderType){
//            case "希腊" : pizza = new GreekPizza(); break;
//            case "胡椒" : pizza = new PepperPizza();break;
//        }
//        pizza.pizzaFlow(orderType);
//    }
}
