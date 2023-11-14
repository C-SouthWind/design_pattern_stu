package com.chj.adapter.ObjectAdapter;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.adapter.classAdapter
 * @className: Phone
 * @author: chj
 * @description:
 * @date: Created in  2023/7/18 20:02
 * @version: 1.0
 */
public class Phone {

    public void charging(IVoltage5V voltage5V){
        int i = voltage5V.output5V();
        if (i == 5) {
            System.out.println("电压为"+i+"，可以充电");
        }else {
            System.out.println("电压为"+i+"，不可以充电");
        }
    }
}
