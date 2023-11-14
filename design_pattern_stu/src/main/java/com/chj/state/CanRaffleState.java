package com.chj.state;

import java.util.Random;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.state
 * @className: CanRaffleState
 * @author: chj
 * @description: 可以抽奖状态
 * @date: Created in  2023/10/11 20:29
 * @version: 1.0
 */
public class CanRaffleState implements State{
    Activity activity;

    public CanRaffleState(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void deduceMoney() {
        System.out.println("已经扣取过积分");
    }

    @Override
    public boolean raffle() {
        System.out.println("正在抽奖，请稍等");
        Random random = new Random();
        int i = random.nextInt(10);
        if (i == 0) {
            //改变活动状态为发放奖品
            activity.setState(activity.getDispenseState());
            return true;
        }
        System.out.println("很遗憾没有抽中奖品");
        //改变状态为不能抽奖
        activity.setState(activity.getNoRaffleState());
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("没有中奖，不能发放奖品");
    }
}
