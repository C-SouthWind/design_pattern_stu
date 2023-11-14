package com.chj.template;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.template
 * @className: SoyaMilk
 * @author: chj
 * @description:
 * @date: Created in  2023/8/30 19:59
 * @version: 1.0
 */
public abstract class SoyaMilk {

    public void make(){
        select();
        add();
        soak();
        beat();
    }

    private void select(){
        System.out.println("选材");
    }

    protected abstract void add();

    private void soak(){
        System.out.println("侵泡");
    }

    private void beat(){
        System.out.println("打豆浆");
    }
}
