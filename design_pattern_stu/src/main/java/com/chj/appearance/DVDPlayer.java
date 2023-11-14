package com.chj.appearance;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.appearance
 * @className: DVDPlayer
 * @author: chj
 * @description: dvd
 * @date: Created in  2023/7/25 19:40
 * @version: 1.0
 */
public class DVDPlayer {

    private DVDPlayer(){}

    private static DVDPlayer instance = new DVDPlayer();

    public static DVDPlayer getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("dvd 打开了");
    }

    public void off(){
        System.out.println("dvd 关闭了");
    }

    public void play(){
        System.out.println("dvd 开始播放");
    }
}
