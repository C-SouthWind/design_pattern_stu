package com.chj.memoization;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.memoization
 * @className: Client
 * @author: chj
 * @description:
 * @date: Created in  2023/9/13 19:25
 * @version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        originator.setState(" 状态1 ");
        caretaker.add(originator.saveStateMemento());
        originator.setState(" 状态2 ");
        System.out.println(originator.getState());
        originator.getStateFromMemento(caretaker.get(0));
        System.out.println(originator.getState());

    }
}































