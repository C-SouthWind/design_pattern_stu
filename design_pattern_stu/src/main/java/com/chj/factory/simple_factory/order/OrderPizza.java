package com.chj.factory.simple_factory.order;

import com.chj.factory.simple_factory.factory.SimpleFactory;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.factory.simple_factory.my.order
 * @className: OrderPizza
 * @author: chj
 * @description: 订单
 * @date: Created in  2023/7/6 20:05
 * @version: 1.0
 */
public class OrderPizza {
    
    public void getPizza(String name){
        SimpleFactory.createPizza(name);
    }
}
