package com.chj.flyweight;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.flyweight
 * @className: ConcreteWebSite
 * @author: chj
 * @description:
 * @date: Created in  2023/7/26 19:42
 * @version: 1.0
 */
public class ConcreteWebSite extends WebSite{

    private String type = ""; //网站发布的形式

    public ConcreteWebSite(String type ){
        this.type = type;
    }

    @Override
    void use(User user) {
        System.out.println("网站发布的形式"+type+", 使用的是"+user.getName());
    }
}
