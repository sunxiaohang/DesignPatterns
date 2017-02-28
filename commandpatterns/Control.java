package com.sunxiaohang.commandpatterns;

/**
 * Created by root on 2017/2/23.
 */
public interface Control {
    void onButton(int slot);
    void offButton(int slot);
    void undoButton();
}
