package com.chj.principles.open_close_principle;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.principles.open_close_principle.demo1
 * @className: Client
 * @author: chj
 * @description: 测试类
 * @date: Created in  2023/6/29 20:28
 * @version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        //1、创建搜狗输入法
        SouGouInput souGouInput = new SouGouInput();
        //2、设置默认皮肤
        souGouInput.setSkin(new DefaultSkin());
        //3、使用皮肤
        souGouInput.display();
    }
}
