package com.chj.bridging;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.bridging
 * @className: XiaoMiBrand
 * @author: chj
 * @description:
 * @date: Created in  2023/7/19 19:57
 * @version: 1.0
 */
public class XiaoMiBrand implements Brand{
    @Override
    public void call() {
        System.out.println("小米打电话");
    }
}
