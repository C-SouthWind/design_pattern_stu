package com.chj.command;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.command
 * @className: Client
 * @author: chj
 * @description:
 * @date: Created in  2023/9/4 20:01
 * @version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        RemoteController remoteController = new RemoteController();
        Command lightOffCommand = new LightOffCommand(new LightReceiver());
        Command lightOnCommand = new LightOnCommand(new LightReceiver());
        remoteController.setCommand(1,lightOnCommand,lightOffCommand);
        remoteController.offButtonWasPushed(1);
        remoteController.undoButtonWasPushed();
    }
}
