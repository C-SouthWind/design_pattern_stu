package com.chj.factory.simple_factory.pizza;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.factory.simple_factory.my.pizza
 * @className: Pizza
 * @author: chj
 * @description: 披萨类
 * @date: Created in  2023/7/6 19:56
 * @version: 1.0
 */
public abstract class AbstractPizza implements Pizza{

    protected String name;

    public void pizzaFlow(String name){
        this.name = name;
        prepare();
        bake();
        cut();
        box();
    }

    abstract void prepare();

    protected void bake(){
        System.out.println("烤制披萨"+name);
    }
    protected void cut(){
        System.out.println("切割披萨"+name);
    }

    protected void box(){
        System.out.println("打包披萨"+name);
    }
}
