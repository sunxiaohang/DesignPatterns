package com.sunxiaohang.chainofresponsibilitypatterns;

/**
 * Created by root on 2017/3/1.
 */

public class PresidentApprover extends Approver {

    public PresidentApprover(String Name) {
        super(Name + " President");

    }

    @Override
    public void processRequest(PurchaseRequest request) {
        // TODO Auto-generated method stub
        if (50000 <= request.getSum()) {
            System.out.println("**This request " + request.getID()
                    + " will be handled by " + this.name + " **");
        }else {
            successor.processRequest(request);
        }
    }

}
