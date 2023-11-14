package com.chj.command;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.command
 * @className: LightOnCommand
 * @author: chj
 * @description: 关灯命令
 * @date: Created in  2023/9/4 19:38
 * @version: 1.0
 */
public class LightOffCommand implements Command{

    LightReceiver lightReceiver;

    @Override
    public void execute() {
        lightReceiver.off();
    }

    @Override
    public void undo() {
        lightReceiver.on();
    }

    public LightOffCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }
}
