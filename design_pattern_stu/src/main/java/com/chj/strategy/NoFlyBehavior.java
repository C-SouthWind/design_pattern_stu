package com.chj.strategy;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.strategy
 * @className: NoFlyBehavior
 * @author: chj
 * @description:
 * @date: Created in  2023/10/16 20:09
 * @version: 1.0
 */
public class NoFlyBehavior implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("不会飞的鸭子");
    }
}
