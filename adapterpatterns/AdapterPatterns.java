package com.sunxiaohang.adapterpatterns;

/**
 * AdapterPatterns适配器模式
 * 对象适配器、类适配器
 * （传入对象）（传入类）
 * 对象适配器使用组合
 * 类适配器使用继承
 * Created by root on 2017/2/23.
 */
public class AdapterPatterns {
    public static void main(String[] args) {
        GreenHeadDuck greenHeadDuck=new GreenHeadDuck();
        greenHeadDuck.fly();
        greenHeadDuck.sound();
        System.out.println("###################");
        /***
         * 对象适配器方法
         */
        WildTurkey wildTurkey=new WildTurkey();
        DuckAdapter duckAdapter=new DuckAdapter(wildTurkey);
        duckAdapter.fly();
        duckAdapter.sound();
        /***
         * 类适配器方法
         */
        System.out.println("&&&&&&&&&&&&&");
        DuckAdapter2 duckAdapter2=new DuckAdapter2();
        duckAdapter2.fly();
        duckAdapter2.sound();
    }
}
