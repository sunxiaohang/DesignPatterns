package com.sunxiaohang.visitorpatterns;

/**
 * Created by root on 2017/3/8.
 */
public abstract class Element {
    abstract public void Accept(Visitor visitor);
}
