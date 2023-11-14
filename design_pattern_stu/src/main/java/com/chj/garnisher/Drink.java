package com.chj.garnisher;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.garnisher
 * @className: Drink
 * @author: chj
 * @description: 喝
 * @date: Created in  2023/7/20 20:04
 * @version: 1.0
 */
public abstract class Drink {

    private String des; // 描述
    private float price = 0.0f;



    public abstract float cost();



    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
