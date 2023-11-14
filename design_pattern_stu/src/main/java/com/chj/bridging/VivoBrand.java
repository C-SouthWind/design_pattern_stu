package com.chj.bridging;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.bridging
 * @className: VivoBrand
 * @author: chj
 * @description:
 * @date: Created in  2023/7/19 19:56
 * @version: 1.0
 */
public class VivoBrand implements Brand{
    @Override
    public void call() {
        System.out.println("vivo打电话");
    }
}
