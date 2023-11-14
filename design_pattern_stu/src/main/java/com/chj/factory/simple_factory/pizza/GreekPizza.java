package com.chj.factory.simple_factory.pizza;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.factory.simple_factory.my.pizza
 * @className: GreekPizza
 * @author: chj
 * @description: 希腊披萨
 * @date: Created in  2023/7/6 20:00
 * @version: 1.0
 */
public class GreekPizza extends AbstractPizza{
    @Override
    public void prepare() {
        System.out.println("希腊披萨准备中" + name);
    }
}
