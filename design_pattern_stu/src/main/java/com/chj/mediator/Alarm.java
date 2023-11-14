package com.chj.mediator;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.mediator
 * @className: Alarm
 * @author: chj
 * @description: 闹钟
 * @date: Created in  2023/9/11 19:43
 * @version: 1.0
 */
public class Alarm extends Colleague{

    public Alarm(Mediator mediator, String name) {
        super(mediator,name);
        mediator.register(name,this);
    }

    @Override
    public void sendMessage() {
        this.getMediator().getMessage(name);
    }

    @Override
    public void handle() {
        System.out.println("闹钟");
    }

}
