package com.chj.mediator;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.mediator
 * @className: Mediator
 * @author: chj
 * @description:
 * @date: Created in  2023/9/11 19:43
 * @version: 1.0
 */
public abstract class Mediator {

    public abstract void getMessage(String name);

    public abstract void register(String colleagueName, Colleague colleague);
}
