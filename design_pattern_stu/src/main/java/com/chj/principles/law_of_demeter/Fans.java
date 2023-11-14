package com.chj.principles.law_of_demeter;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.principles.law_of_demeter
 * @className: Fans
 * @author: chj
 * @description: 粉丝
 * @date: Created in  2023/7/4 20:23
 * @version: 1.0
 */
public class Fans {
    private String name;

    public Fans(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
