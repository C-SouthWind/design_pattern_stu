package com.chj.factory.abstract_factory;

import com.chj.factory.abstract_factory.pizza.GreekPizza;
import com.chj.factory.abstract_factory.pizza.Pizza;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.factory.abstract_factory
 * @className: BJFactory
 * @author: chj
 * @description:
 * @date: Created in  2023/7/12 19:57
 * @version: 1.0
 */
public class BJFactory implements AbstractFactory{
    @Override
    public Pizza createPizza() {
        return new GreekPizza();
    }
}
