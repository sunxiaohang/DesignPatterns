package com.sunxiaohang.visitorpatterns;

/**
 * Created by root on 2017/3/8.
 * 迭代器模式侧重于遍历元素
 * 访问者模式侧重于对对各元素进行处理
 * 将对单个对象的处理事件分装成一个访问者对象，传递给接受者进行处理
 */
public class VisitorPatterns {
    public static void main(String[] args) {
        Employees employees=new Employees();
        employees.attach(new Employee("Tom",4500,8,1));
        employees.attach(new Employee("Jerry",6500,10,2));
        employees.attach(new Employee("Jack",9600,12,3));
        employees.Accept(new CompensationVisitor());
    }
}














