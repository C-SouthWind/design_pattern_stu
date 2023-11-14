package com.chj.template.improve;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.template
 * @className: OriginalSoyMilk
 * @author: chj
 * @description: 原味豆浆
 * @date: Created in  2023/8/30 20:02
 * @version: 1.0
 */
public class OriginalSoyMilk extends SoyaMilk {
    @Override
    protected void add() {
        System.out.println("原味材料");
    }
}
