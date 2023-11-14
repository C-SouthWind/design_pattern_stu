package com.chj.principles.law_of_demeter;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.principles.law_of_demeter
 * @className: Agent
 * @author: chj
 * @description: 经纪人
 * @date: Created in  2023/7/4 20:23
 * @version: 1.0
 */
public class Agent {
    private Star star;
    private Fans fans;
    private Company company;

    public Agent(Star star, Fans fans, Company company) {
        this.star = star;
        this.fans = fans;
        this.company = company;
    }

    public void meeting(){
        System.out.println(star.getName() + fans.getName());
    }
    public void business(){
        System.out.println(star.getName() + company.getName());
    }

}
