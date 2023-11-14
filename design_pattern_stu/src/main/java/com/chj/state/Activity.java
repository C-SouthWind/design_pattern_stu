package com.chj.state;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.state
 * @className: Activity
 * @author: chj
 * @description: 抽奖活动
 * @date: Created in  2023/10/11 20:28
 * @version: 1.0
 */
public class Activity {

    State state = null;
    int count = 0;

    State noRaffleState =  new NoRaffleState(this);
    State canRaffleState =  new CanRaffleState(this);
    State dispenseState =  new DispenseState(this);
    State dispenseOutSate =  new DispenseOutSate(this);

    //初始化当前的状态为 noRaffleState （不能抽奖状态）
    //初始化奖品数量
    public Activity(int count) {
        this.state = getNoRaffleState();
        this.count = count;
    }
    //调用当前状态的扣分
    public void deductMoney(){
        state.deduceMoney();
    }
    //调用当前状态的抽奖
    public void raffle(){
        //抽奖成功
        if (state.raffle()) {
            //领取奖品
            state.dispensePrize();
        }
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getCount() {
        int curCount = count;
        count --;
        return curCount;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public State getNoRaffleState() {
        return noRaffleState;
    }

    public void setNoRaffleState(State noRaffleState) {
        this.noRaffleState = noRaffleState;
    }

    public State getCanRaffleState() {
        return canRaffleState;
    }

    public void setCanRaffleState(State canRaffleState) {
        this.canRaffleState = canRaffleState;
    }

    public State getDispenseState() {
        return dispenseState;
    }

    public void setDispenseState(State dispenseState) {
        this.dispenseState = dispenseState;
    }

    public State getDispenseOutSate() {
        return dispenseOutSate;
    }

    public void setDispenseOutSate(State dispenseOutSate) {
        this.dispenseOutSate = dispenseOutSate;
    }
}
