package com.sunxiaohang.templatepatterns;

/**
 * Created by root on 2017/2/23.
 */
public abstract class Drink {
    public final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }
    public final void boilWater(){
        System.out.println("boilWater...");
    }
    public abstract void brew();
    public final void pourInCup() {
        System.out.println("pourInCup...");
    }
    public abstract void addCondiments();
}
