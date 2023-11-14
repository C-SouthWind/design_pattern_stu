package com.chj.adapter.interfaceAdapter;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.adapter.interfaceAdapter
 * @className: Client
 * @author: chj
 * @description:
 * @date: Created in  2023/7/18 20:38
 * @version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        AbsAdapter adapter = new AbsAdapter() {
            @Override
            public void m1() {
                System.out.println("使用了m1方法");
            }
        };
        adapter.m1();
    }
}
