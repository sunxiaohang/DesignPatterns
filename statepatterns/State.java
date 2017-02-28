package com.sunxiaohang.statepatterns;

/**
 * Created by root on 2017/2/27.
 */
public interface State {
    void insertCoin();
    void returnCoin();
    void turnCrank();
    void dispense();
    void printState();
}
