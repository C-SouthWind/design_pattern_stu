package com.chj.state;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.state
 * @className: NoRaffleState
 * @author: chj
 * @description: 不能抽奖的状态
 * @date: Created in  2023/10/11 20:28
 * @version: 1.0
 */
public class NoRaffleState implements State{

    //初始化时传入活动引用，扣除积分后改变其状态
    Activity activity;

    public NoRaffleState(Activity activity) {
        this.activity = activity;
    }

    //当前状态可以扣积分，扣除积分后设置为可以抽奖状态
    @Override
    public void deduceMoney() {
        System.out.println("扣除50积分，可以抽奖了");
        activity.setState(activity.getCanRaffleState());
    }

    //当前不能抽奖
    @Override
    public boolean raffle() {
        System.out.println("扣了积分才可以抽奖");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("不能发放奖品");
    }
}
