package com.chj.command;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.command
 * @className: LightOnCommand
 * @author: chj
 * @description: 开灯命令
 * @date: Created in  2023/9/4 19:38
 * @version: 1.0
 */
public class LightOnCommand implements Command{

    LightReceiver lightReceiver;

    @Override
    public void execute() {
        lightReceiver.on();
    }

    @Override
    public void undo() {
        lightReceiver.off();
    }

    public LightOnCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }
}
