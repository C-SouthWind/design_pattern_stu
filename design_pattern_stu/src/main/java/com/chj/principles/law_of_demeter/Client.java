package com.chj.principles.law_of_demeter;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.principles.law_of_demeter
 * @className: Client
 * @author: chj
 * @description:
 * @date: Created in  2023/7/4 20:29
 * @version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        Agent agent = new Agent(
                new Star("张三"),
                new Fans("李四"),
                new Company("王五")
        );
        agent.meeting();
        agent.business();
    }
}
