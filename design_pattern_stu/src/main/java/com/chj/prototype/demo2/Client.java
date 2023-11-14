package com.chj.prototype.demo2;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.prototype
 * @className: Client
 * @author: chj
 * @description:
 * @date: Created in  2023/7/13 19:24
 * @version: 1.0
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep sheep1 = new Sheep("tom", 1, "白色");
        Sheep sheep2 = (Sheep)sheep1.clone();
        Sheep sheep3 = (Sheep)sheep1.clone();
        Sheep sheep4 = (Sheep)sheep1.clone();
        Sheep sheep5 = (Sheep)sheep1.clone();
        Sheep sheep6 = (Sheep)sheep1.clone();
    }
}
