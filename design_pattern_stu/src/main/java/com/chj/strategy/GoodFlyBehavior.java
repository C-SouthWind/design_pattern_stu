package com.chj.strategy;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.strategy
 * @className: GoodFlyBehavior
 * @author: chj
 * @description:
 * @date: Created in  2023/10/16 20:08
 * @version: 1.0
 */
public class GoodFlyBehavior implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("飞的很好的鸭子");
    }
}
