package com.chj.prototype.demo2;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.prototype
 * @className: Sheep
 * @author: chj
 * @description:
 * @date: Created in  2023/7/13 19:22
 * @version: 1.0
 */
public class Sheep implements Cloneable{
    private String name;
    private int age;
    private String color;

    private Sheep sheep;

    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        //浅拷贝
        //return super.clone();
        //深拷贝
        Sheep sheep1 = null;

        //对基本数据类型进行拷贝
        sheep1 = (Sheep)super.clone();

        sheep1.sheep = (Sheep)sheep.clone();

        return sheep1;
    }
}
