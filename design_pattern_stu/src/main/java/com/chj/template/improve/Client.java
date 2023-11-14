package com.chj.template.improve;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.template
 * @className: Client
 * @author: chj
 * @description:
 * @date: Created in  2023/8/30 20:03
 * @version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        SoyaMilk soyaMilk = new NoSoyMilk();
        soyaMilk.make();
    }
}
