package com.sunxiaohang.templatepatterns;

/**
 * Created by root on 2017/2/23.
 */
public class Tea extends Drink{
    @Override
    public void brew() {
        System.out.println("brwTea...");
    }

    @Override
    public void addCondiments() {
        System.out.println("addMelon...");
    }
}
