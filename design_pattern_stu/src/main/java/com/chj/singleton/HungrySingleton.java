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
public class HungrySingleton {

    private HungrySingleton(){}

    private static HungrySingleton hungrySingleton = new HungrySingleton();

    public static HungrySingleton getHungrySingleton(){
        return hungrySingleton;
    }
}
