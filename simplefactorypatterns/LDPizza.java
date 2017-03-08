package com.sunxiaohang.simplefactorypatterns;

/**
 * Created by root on 2017/3/2.
 */
public class LDPizza extends Pizza{
    @Override
    public void prepare() {
        super.setName("LDPizza");
        System.out.println(name+"preparing");
    }
}
