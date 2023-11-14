package com.chj.strategy;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.strategy
 * @className: Client
 * @author: chj
 * @description:
 * @date: Created in  2023/10/16 20:12
 * @version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        ToyDuck duck = new ToyDuck();
        duck.fly(new GoodFlyBehavior());
    }
}
