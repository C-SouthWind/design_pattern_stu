package com.chj.builder.demo1;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.builder.demo1
 * @className: AbstractHouse
 * @author: chj
 * @description:
 * @date: Created in  2023/7/17 19:34
 * @version: 1.0
 */
public abstract class AbstractHouse {

    abstract void buildBasic();
    abstract void buildWalls();
    abstract void roofed();

    public void build(){
        buildBasic();
        buildWalls();
        roofed();
    }
}
