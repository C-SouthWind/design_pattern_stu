package com.chj.proxy.staticproxy;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.proxy.staticproxy
 * @className: client
 * @author: chj
 * @description:
 * @date: Created in  2023/8/2 20:02
 * @version: 1.0
 */
public class client {
    public static void main(String[] args) {
        ITeacherDao proxy = new TeacherDaoProxy(new TeacherDao());
        proxy.teach();
    }
}
