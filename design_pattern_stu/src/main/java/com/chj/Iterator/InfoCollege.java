package com.chj.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.Iterator
 * @className: InfoCollege
 * @author: chj
 * @description:
 * @date: Created in  2023/9/6 19:44
 * @version: 1.0
 */
public class InfoCollege implements College{
    List<Department> departmentList;

    public InfoCollege() {
        departmentList = new ArrayList<>();
        addDepartment("信息","信息");
        addDepartment("网络","网络");
        addDepartment("服务器","服务器");
    }

    @Override
    public String getName() {
        return "信息工程";
    }

    @Override
    public Iterator createIterator() {
        return new InfoColleageIterator(departmentList);
    }

    @Override
    public void addDepartment(String name, String desc) {
        departmentList.add(new Department(name,desc));
    }
}





























