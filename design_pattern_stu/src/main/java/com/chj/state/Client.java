package com.chj.state;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.state
 * @className: Client
 * @author: chj
 * @description:
 * @date: Created in  2023/10/11 20:29
 * @version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        //创建活动对象,奖品池有一个奖品
        Activity activity = new Activity(1);
        //抽奖三次
        for (int i = 0; i < 300; i++) {
            System.out.println("-------------第" + ( i + 1 ) + "次抽奖----------------");
            //参加抽奖，扣除积分
            activity.deductMoney();
            //第二步抽奖
            activity.raffle();
        }
    }
}
