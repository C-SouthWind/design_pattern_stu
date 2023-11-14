package com.chj.state;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.state
 * @className: DispenseState
 * @author: chj
 * @description: 发放奖品状态
 * @date: Created in  2023/10/11 20:29
 * @version: 1.0
 */
public class DispenseState implements State{
    Activity activity;

    public DispenseState(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void deduceMoney() {
        System.out.println("不能扣除积分");
    }

    @Override
    public boolean raffle() {
        System.out.println("不能抽奖");
        return false;
    }

    @Override
    public void dispensePrize() {
        if (activity.getCount() > 0) {
            System.out.println("恭喜你中奖了");
            //改变状态为不能抽奖
            activity.setState(activity.getNoRaffleState());
        }else {
            System.out.println("很遗憾，奖品发送完了");
            activity.setState(activity.getDispenseOutSate());
        }
    }
}
