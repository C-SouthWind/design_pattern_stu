package com.chj.Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.Iterator
 * @className: Client
 * @author: chj
 * @description:
 * @date: Created in  2023/9/6 19:56
 * @version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        List<College> collegeList = new ArrayList<>();

        ComputerCollege computerCollege = new ComputerCollege();
        InfoCollege infoCollege = new InfoCollege();
        collegeList.add(computerCollege);
        collegeList.add(infoCollege);
        OutPutImpl outPut = new OutPutImpl(collegeList);
        outPut.printCollege();
    }
}













































