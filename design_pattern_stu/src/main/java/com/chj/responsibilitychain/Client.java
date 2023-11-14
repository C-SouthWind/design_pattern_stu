package com.chj.responsibilitychain;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.responsibilitychain
 * @className: Client
 * @author: chj
 * @description:
 * @date: Created in  2023/10/23 19:45
 * @version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        PurchaseRequest purchaseRequest = new PurchaseRequest(1, 31000, 1);
        DepartmentApprover zhangSan = new DepartmentApprover("张三");
        CollegeApprover liSi = new CollegeApprover("李四");
        zhangSan.setApprover(liSi);
        zhangSan.processRequest(purchaseRequest);
    }

}
