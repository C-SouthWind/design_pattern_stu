package com.chj.appearance;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.appearance
 * @className: Client
 * @author: chj
 * @description:
 * @date: Created in  2023/7/25 19:54
 * @version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        HomeFacade homeFacade = new HomeFacade();
        homeFacade.ready();
        homeFacade.play();
        homeFacade.end();
    }
}
