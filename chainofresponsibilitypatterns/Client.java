package com.sunxiaohang.chainofresponsibilitypatterns;

/**
 * Created by root on 2017/3/1.
 */
public class Client {
    public Client() {
    }
    public PurchaseRequest sendRequest(int number,float price){
        return new PurchaseRequest(number,price);
    }
}
