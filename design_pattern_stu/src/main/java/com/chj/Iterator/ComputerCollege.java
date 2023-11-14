package com.chj.Iterator;

import java.util.Iterator;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.Iterator
 * @className: ComputerCollege
 * @author: chj
 * @description:
 * @date: Created in  2023/9/6 19:38
 * @version: 1.0
 */
public class ComputerCollege implements College{

    Department[] departments;
    int numDepartment = 0;

    public ComputerCollege() {
        departments = new Department[5];
        addDepartment("java","java");
        addDepartment("PHP","PHP");
        addDepartment("大数据","大数据");
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departments[numDepartment] = department;
        numDepartment += 1;
    }
}
