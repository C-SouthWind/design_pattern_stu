package com.chj.garnisher.decorator;

import com.chj.garnisher.Drink;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.garnisher.decorator
 * @className: Milk
 * @author: chj
 * @description:
 * @date: Created in  2023/7/20 20:17
 * @version: 1.0
 */
public class Milk extends Decorator{
    public Milk(Drink drink) {
        super(drink);
        setDes(" 牛奶 ");
        setPrice(2.0f);
    }
}
