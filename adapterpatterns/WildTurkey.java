package com.sunxiaohang.adapterpatterns;
/**
 * Created by root on 2017/2/23.
 */
public class WildTurkey implements Turkey{
    @Override
    public void fly() {
        System.out.println("WildTurkey fly a short way");
    }

    @Override
    public void sound() {
        System.out.println("GuGu...!");
    }
}
