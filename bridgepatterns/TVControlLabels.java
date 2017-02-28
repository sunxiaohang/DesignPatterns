package com.sunxiaohang.bridgepatterns;

/**
 * Created by root on 2017/2/28.
 */
public abstract class TVControlLabels {
    Control control=null;

    public TVControlLabels(Control control) {
        this.control = control;
    }
    public abstract void OnOff();
    public abstract void nextChannel();
    public abstract void preChannel();
}
