package com.chj.principles.interface_segregation_principle;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.principles.interface_segregation_principle
 * @className: GateOne
 * @author: chj
 * @description: 第一个门
 * @date: Created in  2023/7/4 20:06
 * @version: 1.0
 */
public class GateTwo implements Fireproof,Security,Gate{
    @Override
    public void fireproof() {
        System.out.println("防火");
    }

    @Override
    public void security() {
        System.out.println("防盗");
    }

    @Override
    public void function() {
        fireproof();
        security();
    }
}
