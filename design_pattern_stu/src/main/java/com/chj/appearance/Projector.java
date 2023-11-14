package com.chj.appearance;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.appearance
 * @className: Projector
 * @author: chj
 * @description: 投影仪
 * @date: Created in  2023/7/25 19:45
 * @version: 1.0
 */
public class Projector {
    private Projector(){}

    private static Projector instance = new Projector();

    public static Projector getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("投影仪 打开了");
    }

    public void off(){
        System.out.println("投影仪 关闭了");
    }

    public void play(){
        System.out.println("投影仪 开始投影");
    }
}
