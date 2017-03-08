package com.sunxiaohang.simplefactorypatterns;

/**
 * Created by root on 2017/3/2.
 */
public class SimplePizzaFactory {
    public Pizza createPizza(String orderType){
        Pizza pizza=null;
        if (orderType.equals("ChinesePizza"))
            pizza=new ChinesePizaa();
        else if(orderType.equals("LDPizza"))
            pizza=new LDPizza();
        return pizza;
    }
}
