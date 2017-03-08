package com.sunxiaohang.chainofresponsibilitypatterns;

/**
 * Created by root on 2017/3/1.
 */
public abstract class Approver {
    /***
     * 类是自身的成员时，通常不能初始化，
     * 而仅仅是一个定义，在满足某些条件时，
     * 才回去初始化，否则必然导致溢出
     */
    Approver successor;
    String name;
    public Approver(String name){
        this.name=name;
    }
    public abstract void processRequest(PurchaseRequest request);
    public void setSuccessor(Approver successor){
        this.successor=successor;
    }
}
