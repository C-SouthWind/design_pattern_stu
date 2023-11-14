package com.chj.factory.simple_factory.pizza;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.factory.simple_factory.my.pizza
 * @className: PepperPizza
 * @author: chj
 * @description: 胡椒披萨
 * @date: Created in  2023/7/6 20:04
 * @version: 1.0
 */
public class PepperPizza extends AbstractPizza{
    @Override
    public void prepare() {
        System.out.println("胡椒披萨准备中" + name);
    }
}
