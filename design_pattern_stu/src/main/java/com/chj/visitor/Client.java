package com.chj.visitor;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.visitor
 * @className: Client
 * @author: chj
 * @description:
 * @date: Created in  2023/9/5 19:39
 * @version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attach(new Man());
        objectStructure.display(new Success());
    }
}
