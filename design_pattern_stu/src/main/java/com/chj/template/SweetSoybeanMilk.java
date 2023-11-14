package com.chj.template;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.template
 * @className: SweetSoybeanMilk
 * @author: chj
 * @description: 甜豆浆
 * @date: Created in  2023/8/30 20:01
 * @version: 1.0
 */
public class SweetSoybeanMilk extends SoyaMilk{
    @Override
    protected void add() {
        System.out.println("添加糖");
    }
}
