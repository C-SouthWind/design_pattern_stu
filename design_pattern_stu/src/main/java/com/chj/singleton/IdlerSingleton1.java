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
public class IdlerSingleton1 {

    private IdlerSingleton1(){}

    private static volatile IdlerSingleton1 idlerSingleton ;

    public static IdlerSingleton1 getInstance(){
        if (null == idlerSingleton) {
            synchronized (IdlerSingleton1.class) {
                if (null == idlerSingleton) {
                    idlerSingleton = new IdlerSingleton1();
                }
            }
        }
        return idlerSingleton;
    }
}
