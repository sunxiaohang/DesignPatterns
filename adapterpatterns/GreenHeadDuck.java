package com.sunxiaohang.adapterpatterns;

/**
 * Created by root on 2017/2/23.
 */
public class GreenHeadDuck implements Duck{
    @Override
    public void fly() {
        System.out.println("GreenHeadDuck fly a long way!");
    }

    @Override
    public void sound() {
        System.out.println("GaGa...!");
    }
}
