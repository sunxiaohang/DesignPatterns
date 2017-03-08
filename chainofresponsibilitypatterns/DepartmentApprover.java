package com.sunxiaohang.chainofresponsibilitypatterns;

/**
 * Created by root on 2017/3/1.
 */
public class DepartmentApprover extends Approver {

    public DepartmentApprover(String name) {
        super(name+"DepartmentLeader");
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if((5000<=request.getSum())&&request.getSum()<=10000){
            System.out.println("**this request "+request.getID()+" will be handled by "+this.name+" **");
        }else{
            successor.processRequest(request);
        }
    }
}










