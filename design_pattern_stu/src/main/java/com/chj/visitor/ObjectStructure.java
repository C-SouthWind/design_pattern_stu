package com.chj.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.visitor
 * @className: ObjectStructure
 * @author: chj
 * @description:
 * @date: Created in  2023/9/5 20:03
 * @version: 1.0
 */
public class ObjectStructure {

    private List<Person> persons = new LinkedList<>();

    public void attach(Person p){
        persons.add(p);
    }
    public void detach(Person p){
        persons.remove(p);
    }

    public void display(Action action){
        for (Person person : persons) {
            person.accept(action);
        }
    }
}
