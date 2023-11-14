package com.chj.mediator;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.mediator
 * @className: Client
 * @author: chj
 * @description:
 * @date: Created in  2023/9/11 20:05
 * @version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        Mediator concreteMediator = new ConcreteMediator();
        Colleague tv = new TV(concreteMediator,"tv");
        Colleague alarm = new Alarm(concreteMediator,"alarm");
        concreteMediator.getMessage("alarm");
        concreteMediator.getMessage("tv");
    }
}
