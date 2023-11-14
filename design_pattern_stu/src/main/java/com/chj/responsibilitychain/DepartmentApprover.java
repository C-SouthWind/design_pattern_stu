package com.chj.responsibilitychain;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.responsibilitychain
 * @className: DepartmentApprover
 * @author: chj
 * @description:
 * @date: Created in  2023/10/23 19:39
 * @version: 1.0
 */
public class DepartmentApprover extends Approver{

    public DepartmentApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice() <= 5000) {
            System.out.println("请求编号id = " + purchaseRequest.getId() + " 被 " + this.name + " 处理");
        }else {
            approver.processRequest(purchaseRequest);
        }
    }
}
