package com.chj.state;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.state
 * @className: State
 * @author: chj
 * @description: 状态抽奖接口
 * @date: Created in  2023/10/11 20:27
 * @version: 1.0
 */
public interface State {

    //扣除积分
    void deduceMoney();
    //是否抽中奖品
    boolean raffle();
    //发放奖品
    void dispensePrize();
}
