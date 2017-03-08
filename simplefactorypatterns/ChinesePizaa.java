package com.sunxiaohang.simplefactorypatterns;

/**
 * Created by root on 2017/3/2.
 */
public class ChinesePizaa extends Pizza{
    @Override
    public void prepare() {
        super.setName("ChinesePizza");
        System.out.println(name+" preparing");
    }
}
