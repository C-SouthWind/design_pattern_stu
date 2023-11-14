package com.chj.factory.abstract_factory.order;

import com.chj.factory.abstract_factory.AbstractFactory;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.factory.abstract_factory.order
 * @className: OrderPizza
 * @author: chj
 * @description:
 * @date: Created in  2023/7/12 20:00
 * @version: 1.0
 */
public class OrderPizza {

    AbstractFactory abstractFactory;

    public void setAbstractFactory(AbstractFactory abstractFactory){
        abstractFactory.createPizza().pizzaFlow();
    }
}
