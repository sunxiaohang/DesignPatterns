package com.sunxiaohang.bridgepatterns;

/**
 * Created by root on 2017/2/28.
 */
public interface Control {
    void turnOn();
    void turnOff();
    void setChannel(int channel);
    int getChannel();
}
