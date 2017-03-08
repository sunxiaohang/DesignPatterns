package com.sunxiaohang.chainofresponsibilitypatterns;

/**
 * Created by root on 2017/3/1.
 */
public class VicePresidentApprover extends Approver {
    public VicePresidentApprover(String Name) {
        super(Name + " Vice President");
    }
    @Override
    public void processRequest(PurchaseRequest request) {
        // TODO Auto-generated method stub
        if ((10000 <= request.getSum()) && (request.getSum() < 50000)) {
            System.out.println("**This request " + request.getID()
                    + " will be handled by " + this.name + " **");
        } else {
            successor.processRequest(request);
        }
    }

}
