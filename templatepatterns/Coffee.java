package com.sunxiaohang.templatepatterns;

/**
 * Created by root on 2017/2/23.
 */
public class Coffee extends Drink{
    @Override
    public void brew() {
        System.out.println("brewCoffee...");
    }
    @Override
    public void addCondiments() {
        System.out.println("addMilk...");
    }
}
