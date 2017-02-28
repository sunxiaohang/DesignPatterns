package com.sunxiaohang.templatepatterns;

/**
 *
 * Created by root on 2017/2/23.
 */
public class TemplatePatterns {
    public static void main(String[] args) {
        Coffee c=new Coffee();
        Tea t=new Tea();
        c.prepareRecipe();
        t.prepareRecipe();
    }
}
