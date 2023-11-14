package com.chj.bridging;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.bridging
 * @className: Client
 * @author: chj
 * @description:
 * @date: Created in  2023/7/19 20:03
 * @version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        Brand xiaoMiBrand = new XiaoMiBrand();
        FoldedPhone foldedPhone = new FoldedPhone();
        foldedPhone.setBrand(xiaoMiBrand);
        foldedPhone.call();

    }
}
