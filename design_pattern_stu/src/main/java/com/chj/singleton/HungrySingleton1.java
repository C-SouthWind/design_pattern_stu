package com.chj.singleton;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.singleton
 * @className: HungrySingleton
 * @author: chj
 * @description: 饿汉单例
 * @date: Created in  2023/7/5 19:36
 * @version: 1.0
 */
public class HungrySingleton1 {

    private HungrySingleton1(){}

    private static HungrySingleton1 hungrySingleton;

    static {
        hungrySingleton = new HungrySingleton1();
    }
    public static HungrySingleton1 getHungrySingleton(){
        return hungrySingleton;
    }
}
