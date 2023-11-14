package com.chj.garnisher.drink;

import com.chj.garnisher.Drink;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.garnisher
 * @className: Coffee
 * @author: chj
 * @description: 咖啡
 * @date: Created in  2023/7/20 20:05
 * @version: 1.0
 */
public abstract class Coffee extends Drink {
    @Override
    public float cost() {
        return super.getPrice();
    }
}
