package com.chj.memoization;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.memoization
 * @className: Memento
 * @author: chj
 * @description:
 * @date: Created in  2023/9/13 19:20
 * @version: 1.0
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
