package com.chj.Iterator;

import java.util.Iterator;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.Iterator
 * @className: ComputerCollegeIterator
 * @author: chj
 * @description:
 * @date: Created in  2023/9/6 19:24
 * @version: 1.0
 */
public class ComputerCollegeIterator implements Iterator {

    //这里我们需要Department 是以怎样的方式存放
    Department[] departments;
    int position = 0;//遍历的位置

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    //判断是否还有下一个元素
    @Override
    public boolean hasNext() {
        if (position >= departments.length || departments[position] == null) {
            return false;
        }else {
            return true;
        }
    }

    @Override
    public Object next() {
        Department department = departments[position];
        position += 1;
        return department;
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }
}





































