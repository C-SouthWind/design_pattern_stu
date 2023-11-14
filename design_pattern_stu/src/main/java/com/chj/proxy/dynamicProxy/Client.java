package com.chj.proxy.dynamicProxy;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.proxy.dynamicProxy
 * @className: Client
 * @author: chj
 * @description:
 * @date: Created in  2023/8/22 19:34
 * @version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        ITeacherDao proxyInstance = (ITeacherDao)new ProxyFactory(new TeacherDao()).getProxyInstance();
        proxyInstance.teach();
    }
}
