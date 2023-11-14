package com.chj.assembly;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.assembly
 * @className: Client
 * @author: chj
 * @description:
 * @date: Created in  2023/7/24 19:50
 * @version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        University university = new University("清华大学", "清华");
        College college = new College("信息学院", "信息");
        university.add(college);
        college.add(new Department("计算机系","系"));
        university.print();
    }
}
