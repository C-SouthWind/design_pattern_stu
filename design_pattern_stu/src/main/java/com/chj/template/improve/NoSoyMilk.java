package com.chj.template.improve;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.template.improve
 * @className: NoSoyMilk
 * @author: chj
 * @description: 没有添加
 * @date: Created in  2023/8/30 20:16
 * @version: 1.0
 */
public class NoSoyMilk extends SoyaMilk{
    @Override
    protected void add() {
        System.out.println("无添加");
    }

    @Override
    boolean customerWantCondeiments() {
        return false;
    }
}
