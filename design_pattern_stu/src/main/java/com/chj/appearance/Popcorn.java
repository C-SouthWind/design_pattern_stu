package com.chj.appearance;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.appearance
 * @className: Popcorn
 * @author: chj
 * @description: 爆米花
 * @date: Created in  2023/7/25 19:43
 * @version: 1.0
 */
public class Popcorn {
    private Popcorn(){}

    private static Popcorn instance = new Popcorn();

    public static Popcorn getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("爆米花 打开了");
    }

    public void off(){
        System.out.println("爆米花 关闭了");
    }

    public void play(){
        System.out.println("爆米花 开始爆");
    }
}
