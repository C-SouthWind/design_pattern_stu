package com.chj.builder.demo2;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.builder.demo2
 * @className: Client
 * @author: chj
 * @description:
 * @date: Created in  2023/7/17 19:58
 * @version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        new HouseDirector(new CommonHouse()).constructHouse();
    }
}
