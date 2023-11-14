package com.chj.adapter.ObjectAdapter;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.adapter.classAdapter
 * @className: Voltage220V
 * @author: chj
 * @description: 被适配的类
 * @date: Created in  2023/7/18 19:58
 * @version: 1.0
 */
public class Voltage220V {

    public int output220V(){
        int src = 220;
        System.out.println("电压=" + src + "伏");
        return src;
    }
}
