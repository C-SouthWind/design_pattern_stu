package com.chj.builder.demo2;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.builder.demo1
 * @className: CommonHouse
 * @author: chj
 * @description:
 * @date: Created in  2023/7/17 19:35
 * @version: 1.0
 */
public class CommonHouse extends AbstractHouseBuilder {
    @Override
    void buildBasic() {
        System.out.println("普通房子打地基");
    }

    @Override
    void buildWalls() {
        System.out.println("普通房子砌墙");
    }

    @Override
    void roofed() {
        System.out.println("普通房子封顶");
    }
}
