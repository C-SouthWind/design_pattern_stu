package com.chj.garnisher.decorator;

import com.chj.garnisher.Drink;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.garnisher
 * @className: Decorator
 * @author: chj
 * @description:
 * @date: Created in  2023/7/20 20:09
 * @version: 1.0
 */
public abstract class Decorator extends Drink {

    private Drink drink;

    public Decorator(Drink drink) {

        this.drink = drink;
    }

    @Override
    public float cost() {
        return super.getPrice() + drink.cost();
    }

    @Override
    public String getDes() {
        return super.getDes() + " " + super.getPrice() + " && " + drink.getDes();
    }
}
