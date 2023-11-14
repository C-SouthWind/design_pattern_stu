package com.chj.memoization;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.memoization
 * @className: Originator
 * @author: chj
 * @description:
 * @date: Created in  2023/9/13 19:18
 * @version: 1.0
 */
public class Originator {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento saveStateMemento(){
        return new Memento(state);
    }

    public void getStateFromMemento(Memento memento){
        state = memento.getState();
    }
}
