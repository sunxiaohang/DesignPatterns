package com.sunxiaohang.chainofresponsibilitypatterns;

/**
 * Created by root on 2017/3/1.
 * 责任链模式：如果多个对象都有机会处理请求，
 * 责任链可使请求的发送者和接收者解耦
 * 请求沿着责任链传递，直到有一个对象处理了它为止
 * ChainOfResponsibility Patterns
 *
 * 责任链模式可以简化对象，因为他无需知道链的结构
 * 可以动态的增加或删除处理请求的链结构
 * 链的结构可以多样化（灵活）
 * 缺点：
 * 请求从链的开头进行遍历，对性能有一定的损耗
 * 并不保证请求一定被处理
 *
 */

public class ChainOfResponsibilityPatterns {
    public static void main(String[] args) {

        Client mClient=new Client();
        Approver GroupLeader=new GroupApprover("Tom");
        Approver DepartmentLeader=new DepartmentApprover("Jerry");
        Approver VicePresident=new VicePresidentApprover("Kate");
        Approver President=new PresidentApprover("Bush");

        GroupLeader.setSuccessor(VicePresident);
        DepartmentLeader.setSuccessor(President);
        VicePresident.setSuccessor(DepartmentLeader);
        President.setSuccessor(GroupLeader);

        VicePresident.processRequest(mClient.sendRequest(100, 40));
        VicePresident.processRequest(mClient.sendRequest(200, 40));
        VicePresident.processRequest(mClient.sendRequest(300, 40));
        VicePresident.processRequest(mClient.sendRequest(400, 140));

    }
}









