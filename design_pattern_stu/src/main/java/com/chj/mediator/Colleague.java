package com.chj.mediator;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.mediator
 * @className: Colleague
 * @author: chj
 * @description: 同事类
 * @date: Created in  2023/9/11 19:41
 * @version: 1.0
 */
public abstract class Colleague {

    private Mediator mediator;
    protected String name;

    public Colleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public abstract void sendMessage();

    public abstract void handle();
}
