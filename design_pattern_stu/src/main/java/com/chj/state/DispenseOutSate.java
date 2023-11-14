package com.chj.state;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.state
 * @className: DispenseOutSate
 * @author: chj
 * @description: 奖品发放完毕状态
 * @date: Created in  2023/10/11 20:29
 * @version: 1.0
 */
public class DispenseOutSate implements State{

    Activity activity;

    public DispenseOutSate(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void deduceMoney() {
        System.out.println("奖品发送完了，请下次再参加");
    }

    @Override
    public boolean raffle() {
        System.out.println("奖品发送完了，请下次再参加");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("奖品发送完了，请下次再参加");
    }
}
