package com.chj.factory.abstract_factory;

import com.chj.factory.abstract_factory.pizza.PepperPizza;
import com.chj.factory.abstract_factory.pizza.Pizza;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.factory.abstract_factory
 * @className: LDFactory
 * @author: chj
 * @description:
 * @date: Created in  2023/7/12 19:58
 * @version: 1.0
 */
public class LDFactory implements AbstractFactory{
    @Override
    public Pizza createPizza() {
        return new PepperPizza();
    }
}
