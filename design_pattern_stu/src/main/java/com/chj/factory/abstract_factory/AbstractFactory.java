package com.chj.factory.abstract_factory;

import com.chj.factory.abstract_factory.pizza.Pizza;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.factory.abstract_factory
 * @className: AbstractFactory
 * @author: chj
 * @description:
 * @date: Created in  2023/7/12 19:56
 * @version: 1.0
 */
public interface AbstractFactory {
    Pizza createPizza();
}
