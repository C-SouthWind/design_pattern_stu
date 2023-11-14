package com.chj.factory.simple_factory;

import com.chj.factory.simple_factory.order.OrderPizza;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.factory.simple_factory.my
 * @className: Client
 * @author: chj
 * @description:
 * @date: Created in  2023/7/6 20:10
 * @version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        OrderPizza orderPizza = new OrderPizza();
        orderPizza.getPizza("希腊");
    }
}
