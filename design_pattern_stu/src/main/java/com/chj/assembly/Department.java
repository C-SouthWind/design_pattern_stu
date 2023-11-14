package com.chj.assembly;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.assembly
 * @className: Department
 * @author: chj
 * @description: 系
 * @date: Created in  2023/7/24 19:48
 * @version: 1.0
 */
public class Department extends OrganizationComponent{
    public Department(String name, String des) {
        super(name, des);
    }

    @Override
    protected void print() {
        System.out.println(getName());
    }

}
