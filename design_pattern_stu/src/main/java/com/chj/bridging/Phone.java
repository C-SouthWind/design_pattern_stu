package com.chj.bridging;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.bridging
 * @className: Phone
 * @author: chj
 * @description: 手机
 * @date: Created in  2023/7/19 19:56
 * @version: 1.0
 */
public abstract class Phone {

    private Brand brand;

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    protected void call(){
        brand.call();
    }
}
