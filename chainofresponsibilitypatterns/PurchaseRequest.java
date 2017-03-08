package com.sunxiaohang.chainofresponsibilitypatterns;

/**
 * Created by root on 2017/3/1.
 */
public class PurchaseRequest {
    private int number=0;
    private float price=0;
    public PurchaseRequest(int number, float price) {
        this.number = number;
        this.price = price;
    }

    public float getSum() {
        return number*price;
    }

    public int getID() {
        return (int)(Math.random()*1000);
    }
}
