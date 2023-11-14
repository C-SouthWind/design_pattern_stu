package com.chj.Iterator;

import java.util.Iterator;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.Iterator
 * @className: College
 * @author: chj
 * @description:
 * @date: Created in  2023/9/6 19:35
 * @version: 1.0
 */
public interface College {

    String getName();
    Iterator createIterator();

    void addDepartment(String name, String desc);

}
