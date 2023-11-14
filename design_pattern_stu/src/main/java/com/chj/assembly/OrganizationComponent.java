package com.chj.assembly;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.assembly
 * @className: OrganizationComponent
 * @author: chj
 * @description:
 * @date: Created in  2023/7/24 19:37
 * @version: 1.0
 */
public abstract class OrganizationComponent {

    private String name;
    private String des;

    public OrganizationComponent(String name, String des) {
        this.name = name;
        this.des = des;
    }

    protected void add(OrganizationComponent organizationComponent){
            throw new UnsupportedOperationException();
    }
    protected void remove(OrganizationComponent organizationComponent){
        throw new UnsupportedOperationException();
    }

    protected abstract void print();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
