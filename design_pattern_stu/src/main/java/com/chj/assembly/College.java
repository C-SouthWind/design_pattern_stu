package com.chj.assembly;

import java.util.ArrayList;
import java.util.List;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.assembly
 * @className: College
 * @author: chj
 * @description: 院系
 * @date: Created in  2023/7/24 19:46
 * @version: 1.0
 */
public class College extends OrganizationComponent{
    public College(String name, String des) {
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
