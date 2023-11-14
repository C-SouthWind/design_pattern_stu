package com.chj.garnisher.decorator;

import com.chj.garnisher.Drink;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.garnisher.decorator
 * @className: Chocolate
 * @author: chj
 * @description: 巧克力
 * @date: Created in  2023/7/20 20:15
 * @version: 1.0
 */
public class Chocolate extends Decorator {
    public Chocolate(Drink drink) {
        super(drink);
        setDes("  巧克力  ");
        setPrice(3.0f);
    }
}
