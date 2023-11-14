package com.chj.Iterator;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.Iterator
 * @className: Department
 * @author: chj
 * @description:
 * @date: Created in  2023/9/6 19:24
 * @version: 1.0
 */
public class Department {
    private String name;
    private String desc;

    public Department(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
