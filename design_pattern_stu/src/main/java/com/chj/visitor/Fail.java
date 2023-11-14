package com.chj.visitor;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.visitor
 * @className: Fail
 * @author: chj
 * @description:
 * @date: Created in  2023/9/5 19:55
 * @version: 1.0
 */
public class Fail extends Action{

    @Override
    public void getResult(Person person) {
        System.out.println("失败");
    }
}
