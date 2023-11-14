package com.chj.principles.open_close_principle;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.principles.open_close_principle.demo1
 * @className: ChjSkin
 * @author: chj
 * @description: chj皮肤
 * @date: Created in  2023/6/29 20:21
 * @version: 1.0
 */
public class ChjSkin extends AbstractSkin{
    @Override
    public void display() {
        System.out.println("chj皮肤");
    }
}
