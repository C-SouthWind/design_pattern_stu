package com.chj.singleton;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.singleton
 * @className: Client
 * @author: chj
 * @description:
 * @date: Created in  2023/7/5 19:39
 * @version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        HungrySingleton hungrySingleton = HungrySingleton.getHungrySingleton();
        HungrySingleton hungrySingleton1 = HungrySingleton.getHungrySingleton();

        System.out.println(hungrySingleton.equals(hungrySingleton1));


        IdlerSingleton idlerSingleton = IdlerSingleton.getInstance();
        IdlerSingleton idlerSingleton1 = IdlerSingleton.getInstance();
        System.out.println(idlerSingleton.equals(idlerSingleton1));


        ClassSingleton instance = ClassSingleton.getInstance();
        ClassSingleton instance1 = ClassSingleton.getInstance();
        System.out.println(instance.equals(instance1));


        EnumSingleton instance2 = EnumSingleton.INSTANCE;
        EnumSingleton instance3 = EnumSingleton.INSTANCE;

        System.out.println(instance2.equals(instance3));
    }
}
