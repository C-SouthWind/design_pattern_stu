package com.chj.template.improve;

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
        if(customerWantCondeiments()){
            add();
        }
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

    //钩子方法，决定是都需要添加配料
    boolean customerWantCondeiments(){
        return true;
    }
}
