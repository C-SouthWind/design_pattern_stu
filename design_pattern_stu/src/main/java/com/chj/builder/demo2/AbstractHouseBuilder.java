package com.chj.builder.demo2;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.builder.demo2
 * @className: AbstractHouseBuilder
 * @author: chj
 * @description:
 * @date: Created in  2023/7/17 19:48
 * @version: 1.0
 */
public abstract class AbstractHouseBuilder{

    protected House house = new House();

    abstract void buildBasic();
    abstract void buildWalls();
    abstract void roofed();

    public House buildHouse(){
        return house;
    }
}
