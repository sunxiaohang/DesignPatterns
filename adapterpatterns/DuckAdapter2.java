package com.sunxiaohang.adapterpatterns;

/**
 * Created by root on 2017/2/23.
 */
public class DuckAdapter2 extends WildTurkey implements Duck{
    @Override
    public void fly() {
        super.fly();
        super.fly();
        super.fly();
    }

    @Override
    public void sound() {
        super.sound();
    }
}
