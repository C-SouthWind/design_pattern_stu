package com.chj.strategy;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.strategy
 * @className: ToyDuck
 * @author: chj
 * @description:
 * @date: Created in  2023/10/16 20:11
 * @version: 1.0
 */
public class ToyDuck extends Duck{
    @Override
    public void fly(FlyBehavior flyBehavior) {
        flyBehavior.fly();
    }
}
