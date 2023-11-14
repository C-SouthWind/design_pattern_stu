package com.chj.principles.law_of_demeter;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.principles.law_of_demeter
 * @className: Star
 * @author: chj
 * @description: 明星
 * @date: Created in  2023/7/4 20:23
 * @version: 1.0
 */
public class Star {
    private String name;

    public Star(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
