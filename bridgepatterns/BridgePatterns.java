package com.sunxiaohang.bridgepatterns;


/**
 * Created by root on 2017/2/28.
 * 桥接模式的目的是让底层实现和上层借口分别演化
 * 策略的目的是将复杂的算法封装起来，从而便于替换不同的算法
 * 桥接模式往往是为了利用已有的方法或类
 * 策略模式是为了扩展和修改，并提供动态配置
 * 桥接模式强调接口对象仅提供基本操作
 * 策略模式强调接口对象提供的是一种算法
 */
public class BridgePatterns {
    public static void main(String[] args) {
        TVControl tvControl=new TVControl(new SonyTVControl());
        TVControl tvControl1=new TVControl(new SharpTVControl());

        tvControl.OnOff();
        tvControl.OnOff();
        tvControl.OnOff();
        tvControl.setChannel(12);
        tvControl.preChannel();
        tvControl.nextChannel();
        tvControl.OnOff();
        tvControl1.OnOff();
        tvControl1.OnOff();
        tvControl1.OnOff();
        tvControl1.preChannel();
        tvControl1.nextChannel();
        tvControl1.setChannel(7);
        tvControl1.OnOff();
    }
}















