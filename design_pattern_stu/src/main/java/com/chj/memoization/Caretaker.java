package com.chj.memoization;

import java.util.ArrayList;
import java.util.List;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.memoization
 * @className: Caretaker
 * @author: chj
 * @description:
 * @date: Created in  2023/9/13 19:22
 * @version: 1.0
 */
public class Caretaker {

    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento memento){
        mementoList.add(memento);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}
