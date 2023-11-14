package com.chj.mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.mediator
 * @className: ConcreteMediator
 * @author: chj
 * @description:
 * @date: Created in  2023/9/11 19:53
 * @version: 1.0
 */
public class ConcreteMediator extends Mediator{
    private Map<String, Colleague> colleagueHashMap;

    public ConcreteMediator() {
        colleagueHashMap = new HashMap<>();
    }

    @Override
    public void getMessage(String name) {
        colleagueHashMap.get(name).handle();
    }

    @Override
    public void register(String colleagueName, Colleague colleague) {
        colleagueHashMap.put(colleagueName,colleague);
    }
}
