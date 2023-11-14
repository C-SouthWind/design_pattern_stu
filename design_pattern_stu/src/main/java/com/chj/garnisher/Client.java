package com.chj.garnisher;

import com.chj.garnisher.decorator.Chocolate;
import com.chj.garnisher.decorator.Milk;
import com.chj.garnisher.drink.ShortBlackCoffee;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.garnisher
 * @className: Client
 * @author: chj
 * @description:
 * @date: Created in  2023/7/20 20:20
 * @version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        Drink drink = new ShortBlackCoffee();
        System.out.println(drink.cost());


        drink = new Milk(drink);
        System.out.println(drink.cost());


        drink = new Chocolate(drink);
        System.out.println(drink.cost());
    }
}
