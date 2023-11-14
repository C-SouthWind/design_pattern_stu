package com.chj.command;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.command
 * @className: Command
 * @author: chj
 * @description: 命令接口
 * @date: Created in  2023/9/4 19:37
 * @version: 1.0
 */
public interface Command {

    //执行
    void execute();
    //撤销
    void undo();
}
