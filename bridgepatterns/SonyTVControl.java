package com.sunxiaohang.bridgepatterns;

/**
 * Created by root on 2017/2/28.
 */
public class SonyTVControl implements Control {
    private int initializationChannel=0;

    @Override
    public void turnOn() {
        System.out.println("Open Sony Tv");
    }

    @Override
    public void turnOff() {
        System.out.println("close Sony TV'");
    }

    @Override
    public void setChannel(int channel) {
        initializationChannel=channel;
        System.out.println("sony tv has been set channel "+channel);
    }

    @Override
    public int getChannel() {
        return initializationChannel;
    }
}
