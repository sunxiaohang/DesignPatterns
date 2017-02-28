package com.sunxiaohang.bridgepatterns;

/**
 * Created by root on 2017/2/28.
 */
public class SharpTVControl implements Control {
    private int initializationChannel=0;

    @Override
    public void turnOn() {
        System.out.println("Turn sharp tv on");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn sharp tv off");
    }

    @Override
    public void setChannel(int channel) {
        initializationChannel=channel;
        System.out.println("sharp tv has been set channel "+channel);
    }

    @Override
    public int getChannel() {
        return initializationChannel;
    }
}
