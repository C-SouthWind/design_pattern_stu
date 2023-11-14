package com.chj.responsibilitychain;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.responsibilitychain
 * @className: PurchaseRequest
 * @author: chj
 * @description:
 * @date: Created in  2023/10/23 19:33
 * @version: 1.0
 */
public class PurchaseRequest {
    private int type = 0;
    private float price = 0.0f;
    private int id = 0;

    public PurchaseRequest(int type,  float price, int id) {
        this.type = type;
        this.price = price;
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
