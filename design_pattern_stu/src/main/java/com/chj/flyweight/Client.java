package com.chj.flyweight;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.flyweight
 * @className: Client
 * @author: chj
 * @description:
 * @date: Created in  2023/7/26 19:49
 * @version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        User user = new User();
        user.setName("小明");

        WebSiteFactory webSiteFactory = new WebSiteFactory();
        WebSite aNew = webSiteFactory.getWebSiteCategory("new");
        aNew.use(user);
        WebSite message = webSiteFactory.getWebSiteCategory("message");
        message.use(user);

        System.out.println(webSiteFactory.getWebSiteCount());
    }
}
