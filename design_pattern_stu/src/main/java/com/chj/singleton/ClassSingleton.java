package com.chj.singleton;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.singleton
 * @className: ClassSingleton
 * @author: chj
 * @description: 内部类单例
 * @date: Created in  2023/7/5 20:02
 * @version: 1.0
 */
public class ClassSingleton {

    private ClassSingleton(){}

    private static class ClassSingletonObj{
        private static final ClassSingleton INSTANCE = new ClassSingleton();
    }

    public static ClassSingleton getInstance(){
        return ClassSingletonObj.INSTANCE;
    }
}
