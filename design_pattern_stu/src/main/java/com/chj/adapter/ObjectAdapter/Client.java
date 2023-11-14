package com.chj.adapter.ObjectAdapter;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.adapter.classAdapter
 * @className: Client
 * @author: chj
 * @description:
 * @date: Created in  2023/7/18 20:06
 * @version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("对象适配器模式");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter(new Voltage220V()));
    }
}
