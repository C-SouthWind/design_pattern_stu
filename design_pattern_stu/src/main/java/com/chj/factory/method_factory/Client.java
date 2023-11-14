package com.chj.factory.method_factory;

import com.chj.factory.method_factory.order.BJOrderPizza;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.factory.method_factory
 * @className: Client
 * @author: chj
 * @description:
 * @date: Created in  2023/7/12 19:40
 * @version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        BJOrderPizza bjOrderPizza = new BJOrderPizza();
        bjOrderPizza.getPizza("希腊");
    }
}
