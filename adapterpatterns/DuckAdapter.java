package com.sunxiaohang.adapterpatterns;

/**
 * Created by root on 2017/2/23.
 */
public class DuckAdapter implements Duck{
    private Turkey turkey;
    public DuckAdapter(Turkey turkey) {
        this.turkey = turkey;
    }
    @Override
    public void fly() {
        for (int i = 0; i < 6; i++) {
            turkey.fly();
        }
    }
    @Override
    public void sound() {
        turkey.sound();
    }
}
