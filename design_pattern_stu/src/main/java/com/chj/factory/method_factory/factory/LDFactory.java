package com.chj.factory.method_factory.factory;

import com.chj.factory.method_factory.pizza.GreekPizza;
import com.chj.factory.method_factory.pizza.PepperPizza;
import com.chj.factory.method_factory.pizza.Pizza;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.factory.method_factory.factory
 * @className: LDFactory
 * @author: chj
 * @description:
 * @date: Created in  2023/7/12 19:39
 * @version: 1.0
 */
public class LDFactory extends SimpleFactory{

    @Override
    public void createPizza(String orderType) {
        Pizza pizza = null;
        switch (orderType){
            case "希腊" : pizza = new GreekPizza(); break;
            case "胡椒" : pizza = new PepperPizza();break;
        }
        pizza.pizzaFlow("伦敦"+orderType);
    }
}