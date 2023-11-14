package com.chj.builder.demo2;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.builder.demo2
 * @className: HouseDirector
 * @author: chj
 * @description:
 * @date: Created in  2023/7/17 19:54
 * @version: 1.0
 */
public class HouseDirector {

    AbstractHouseBuilder houseBuilder = null;

    public HouseDirector(AbstractHouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House constructHouse(){
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }
}
