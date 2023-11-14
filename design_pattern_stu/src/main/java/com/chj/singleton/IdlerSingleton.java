package com.chj.singleton;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.singleton
 * @className: IdlerSingleton
 * @author: chj
 * @description: 懒汉单例
 * @date: Created in  2023/7/5 19:47
 * @version: 1.0
 */
public class IdlerSingleton {

    private IdlerSingleton(){}

    private static IdlerSingleton idlerSingleton ;

    public static synchronized IdlerSingleton getInstance(){
        if (null == idlerSingleton) {
            idlerSingleton = new IdlerSingleton();
        }
        return idlerSingleton;
    }
}
