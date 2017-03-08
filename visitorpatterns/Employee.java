package com.sunxiaohang.visitorpatterns;

/**
 * Created by root on 2017/3/8.
 */
public class Employee extends Element{
    private String name;
    private float income;
    private int vacationDays;
    private int degree;

    public Employee(String name, float income, int vacationDays, int degree) {
        this.name = name;
        this.income = income;
        this.vacationDays = vacationDays;
        this.degree = degree;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVacationDays() {
        return vacationDays;
    }

    public int getDegree() {
        return degree;
    }

    @Override
    public void Accept(Visitor visitor) {
        visitor.Visit(this);
    }
}
