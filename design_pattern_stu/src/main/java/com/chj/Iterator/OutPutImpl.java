package com.chj.Iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.Iterator
 * @className: OutPutImpl
 * @author: chj
 * @description:
 * @date: Created in  2023/9/6 19:49
 * @version: 1.0
 */
public class OutPutImpl {

    List<College> collegeList;

    public OutPutImpl(List<College> collegeList) {
        this.collegeList = collegeList;
    }

    public void printCollege(){
        Iterator<College> iterator = collegeList.iterator();
        while (iterator.hasNext()){
            College college = iterator.next();
            System.out.println(college.getName());
            printDepartment(college.createIterator());
        }
    }


    public void printDepartment(Iterator iterator){
        while (iterator.hasNext()){
            Department d = (Department)iterator.next();
            System.out.println(d.getName());
        }
    }
}










































