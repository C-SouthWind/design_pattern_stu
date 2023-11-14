package com.chj.principles.interface_segregation_principle;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.principles.interface_segregation_principle
 * @className: Client
 * @author: chj
 * @description: 测试
 * @date: Created in  2023/7/4 20:07
 * @version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        new GateOne().function();
        System.out.println("==============");
        new GateTwo().function();
    }
}
