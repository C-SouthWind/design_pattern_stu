package com.chj.Iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.Iterator
 * @className: InfoColleageIterator
 * @author: chj
 * @description:
 * @date: Created in  2023/9/6 19:30
 * @version: 1.0
 */
public class InfoColleageIterator implements Iterator {

    List<Department> departmentList;
    int index = -1;

    public InfoColleageIterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    @Override
    public boolean hasNext() {
        if (index >= departmentList.size() - 1) {
            return false;
        }else {
            index += 1;
            return true;
        }
    }

    @Override
    public Object next() {
        return departmentList.get(index);
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }
}






































