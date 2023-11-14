package com.chj.factory.method_factory.order;

import com.chj.factory.method_factory.factory.LDFactory;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.factory.method_factory.order
 * @className: LDOrderPizza
 * @author: chj
 * @description:
 * @date: Created in  2023/7/12 19:43
 * @version: 1.0
 */
public class LDOrderPizza {
    public void getPizza(String name){
        new LDFactory().createPizza(name);
    }
}
