package com.chj.mediator;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.mediator
 * @className: TV
 * @author: chj
 * @description:
 * @date: Created in  2023/9/11 20:04
 * @version: 1.0
 */
public class TV extends Colleague{
    public TV(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name, this);
    }

    @Override
    public void sendMessage() {
        getMediator().getMessage(name);
    }

    @Override
    public void handle() {
        System.out.println("电视机");
    }
}
