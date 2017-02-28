package com.sunxiaohang.statepatterns;
/**
 * Created by root on 2017/2/27.
 */
public class StatePatterns {
    public static void main(String[] args) {
        CandyMachine mCandyMachine = new CandyMachine(6);
        mCandyMachine.printState();
        mCandyMachine.insertCoin();
        mCandyMachine.printState();
        mCandyMachine.turnCrank();
        mCandyMachine.printState();
        mCandyMachine.insertCoin();
        mCandyMachine.printState();
        mCandyMachine.turnCrank();
        mCandyMachine.printState();
    }
}
