package com.chj.principles.law_of_demeter;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.principles.law_of_demeter
 * @className: Company
 * @author: chj
 * @description: 媒体
 * @date: Created in  2023/7/4 20:23
 * @version: 1.0
 */
public class Company {
    private String name;

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
