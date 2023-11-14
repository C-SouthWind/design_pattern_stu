package com.chj.proxy.staticproxy;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.proxy.staticproxy
 * @className: TeacherDaoProxy
 * @author: chj
 * @description:
 * @date: Created in  2023/8/2 19:56
 * @version: 1.0
 */
public class TeacherDaoProxy implements ITeacherDao{

    private ITeacherDao teacherDao;

    public TeacherDaoProxy(ITeacherDao teacherDao) {
        this.teacherDao = teacherDao;
    }

    @Override
    public void teach() {
        System.out.println("代理开始");
        teacherDao.teach();
        System.out.println("代理结束");
    }
}
