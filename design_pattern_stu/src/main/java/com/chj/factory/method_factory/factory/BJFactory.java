package com.chj.factory.method_factory.factory;

import com.chj.factory.method_factory.pizza.GreekPizza;
import com.chj.factory.method_factory.pizza.PepperPizza;
import com.chj.factory.method_factory.pizza.Pizza;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.factory.method_factory.factory
 * @className: BJFactory
 * @author: chj
 * @description:
 * @date: Created in  2023/7/12 19:36
 * @version: 1.0
 */
public class BJFactory extends SimpleFactory{

    @Override
    public void createPizza(String orderType) {
        Pizza pizza = null;
        switch (orderType){
            case "希腊" : pizza = new GreekPizza(); break;
            case "胡椒" : pizza = new PepperPizza();break;
        }
        pizza.pizzaFlow("北京"+orderType);
    }
}
