package com.sunxiaohang.bridgepatterns;

/**
 * Created by root on 2017/2/28.
 */
public class TVControl extends TVControlLabels {
    private boolean isOn = false;
    private int previousChannel;
    public TVControl(Control control) {
        super(control);
    }

    @Override
    public void OnOff() {
        if (isOn) {
            control.turnOff();
            isOn=false;
        } else {
            control.turnOn();
            isOn=true;
        }
    }

    @Override
    public void nextChannel() {
        int temp=control.getChannel();
        previousChannel=temp;
        control.setChannel(++temp);
    }

    @Override
    public void preChannel() {
        int temp=control.getChannel();
        previousChannel=temp;
        control.setChannel(--temp);
    }
    public void setChannel(int ch){
        previousChannel=control.getChannel();
        control.setChannel(ch);
    }
    public void back(){
        control.setChannel(previousChannel);
    }
}
