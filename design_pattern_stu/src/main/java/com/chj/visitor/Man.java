package com.chj.visitor;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.visitor
 * @className: Man
 * @author: chj
 * @description:
 * @date: Created in  2023/9/5 19:33
 * @version: 1.0
 */
public class Man extends Person{
    @Override
    public void accept(Action action) {
        action.getResult(this);
    }
}
