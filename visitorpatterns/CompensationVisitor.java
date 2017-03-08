package com.sunxiaohang.visitorpatterns;

/**
 * Created by root on 2017/3/8.
 */
public class CompensationVisitor implements Visitor{
    @Override
    public void Visit(Element element) {
        Employee employee=((Employee) element);
        System.out.println(employee.getName()+"'s Compensation is "
        +(employee.getDegree()*employee.getVacationDays()*10));
    }
}










