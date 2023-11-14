package com.chj.strategy;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.strategy
 * @className: Duck
 * @author: chj
 * @description:
 * @date: Created in  2023/10/16 20:10
 * @version: 1.0
 */
public abstract class Duck {

    FlyBehavior flyBehavior;

    public Duck() {
    }

    public abstract void fly(FlyBehavior flyBehavior);
}
