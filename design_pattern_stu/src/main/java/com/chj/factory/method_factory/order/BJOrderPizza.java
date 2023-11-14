package com.chj.factory.method_factory.order;

import com.chj.factory.method_factory.factory.BJFactory;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.factory.method_factory.order
 * @className: BJOrderPizza
 * @author: chj
 * @description:
 * @date: Created in  2023/7/12 19:42
 * @version: 1.0
 */
public class BJOrderPizza {
    public void getPizza(String name){
        new BJFactory().createPizza(name);
    }
}
