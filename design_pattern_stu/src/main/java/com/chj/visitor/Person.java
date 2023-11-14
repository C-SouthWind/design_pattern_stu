package com.chj.visitor;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.visitor
 * @className: Person
 * @author: chj
 * @description:
 * @date: Created in  2023/9/5 19:33
 * @version: 1.0
 */
public abstract class Person {

    public abstract void accept(Action action);
}
