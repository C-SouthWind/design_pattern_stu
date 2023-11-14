package com.chj.factory.abstract_factory;

import com.chj.factory.abstract_factory.order.OrderPizza;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.factory.abstract_factory
 * @className: Client
 * @author: chj
 * @description:
 * @date: Created in  2023/7/12 20:02
 * @version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        OrderPizza orderPizza = new OrderPizza();
        //orderPizza.setAbstractFactory(new BJFactory());
        orderPizza.setAbstractFactory(new LDFactory());

    }
}
