package com.chj.visitor;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.visitor
 * @className: Woman
 * @author: chj
 * @description:
 * @date: Created in  2023/9/5 19:34
 * @version: 1.0
 */
public class Woman extends Person{
    @Override
    public void accept(Action action) {
        action.getResult(this);
    }
}
