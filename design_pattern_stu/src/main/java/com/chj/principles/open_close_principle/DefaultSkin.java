package com.chj.principles.open_close_principle;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.principles.open_close_principle.demo1
 * @className: DefaultSkin
 * @author: chj
 * @description: 默认皮肤
 * @date: Created in  2023/6/29 20:20
 * @version: 1.0
 */
public class DefaultSkin extends AbstractSkin{
    @Override
    public void display() {
        System.out.println("默认皮肤");
    }
}
