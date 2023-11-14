package com.chj.responsibilitychain;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.responsibilitychain
 * @className: Approver
 * @author: chj
 * @description:
 * @date: Created in  2023/10/23 19:35
 * @version: 1.0
 */
public abstract class Approver {

    //下一个处理者
    Approver approver;
    //名字
    String name;

    public Approver(String name) {
        this.name = name;
    }
    //下一个处理者
    public void setApprover(Approver approver) {
        this.approver = approver;
    }

    //处理审批请求的方法，得到一个请求，处理是子类完成，因此该方法做成抽象
    public abstract void processRequest(PurchaseRequest purchaseRequest);
}
