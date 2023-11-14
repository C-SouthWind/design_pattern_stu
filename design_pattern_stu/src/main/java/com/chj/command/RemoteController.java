package com.chj.command;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.command
 * @className: RemoteController
 * @author: chj
 * @description:
 * @date: Created in  2023/9/4 19:46
 * @version: 1.0
 */
public class RemoteController {

    //按下开按钮
    public void onButtonWasPushed(int no){
        onCommands[no].execute();
        //记录这次操作
        unCommand = onCommands[no];
    }
    //按下关按钮
    public void offButtonWasPushed(int no){
        offCommands[no].execute();
        //记录这次操作
        unCommand = offCommands[no];
    }

    public void undoButtonWasPushed(){
        unCommand.undo();
    }

    //对按钮进行初始化
    public RemoteController(){
        onCommands = new Command[5];
        offCommands = new Command[5];
        for (int i = 0; i < 5; i++) {
            onCommands[i] = new NoCommand();
            onCommands[i] = new NoCommand();
        }
    }

    public void setCommand(int no, Command onCommand, Command offCommand){
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }

    //开按钮的命令
    Command[] onCommands;
    Command[] offCommands;

    //执行撤销的命令
    Command unCommand;

}
