package com.chj.principles.liskov_substitution_principle;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.principles.liskov_substitution_principle.demo1
 * @className: Rectangle
 * @author: chj
 * @description: 长方形类
 * @date: Created in  2023/6/29 20:40
 * @version: 1.0
 */
public class Rectangle {
    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
