package com.chj.assembly;

import java.util.ArrayList;
import java.util.List;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.assembly
 * @className: University
 * @author: chj
 * @description: 大学
 * @date: Created in  2023/7/24 19:41
 * @version: 1.0
 */
public class University extends OrganizationComponent{
    public University(String name, String des) {
        super(name, des);
    }

    List<OrganizationComponent> organizationComponents = new ArrayList<>();
    @Override
    protected void print() {
        System.out.println("---------------------" + getName() + "---------------------");
        for (OrganizationComponent organizationComponent : organizationComponents) {
            organizationComponent.print();
        }
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }
}
