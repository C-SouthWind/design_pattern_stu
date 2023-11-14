package com.chj.principles.open_close_principle;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.principles.open_close_principle.demo1
 * @className: SouGouInput
 * @author: chj
 * @description:
 * @date: Created in  2023/6/29 20:27
 * @version: 1.0
 */
public class SouGouInput {

    private AbstractSkin skin;

    public void display(){
        skin.display();
    }

    public void setSkin(AbstractSkin skin) {
        this.skin = skin;
    }
}
