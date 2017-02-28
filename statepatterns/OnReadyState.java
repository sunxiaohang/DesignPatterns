package com.sunxiaohang.statepatterns;

/**
 * Created by root on 2017/2/27.
 */
public class OnReadyState implements State {
    private CandyMachine mCandyMachine;

    public OnReadyState(CandyMachine mCandyMachine) {
        this.mCandyMachine = mCandyMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("you have inserted a coin,next,please turn crank!");
        mCandyMachine.setState(mCandyMachine.mHasCoin);
    }

    @Override
    public void returnCoin() {
        System.out.println("you haven't inserted a coin yet!");
    }

    @Override
    public void turnCrank() {
        System.out.println("you turned,but you haven't inserted a coin!");
    }

    @Override
    public void dispense() {
        // TODO Auto-generated method stub

    }

    @Override
    public void printState() {
        // TODO Auto-generated method stub
        System.out.println("***OnReadyState***");
    }
}