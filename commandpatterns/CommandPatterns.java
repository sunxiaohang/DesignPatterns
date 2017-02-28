package com.sunxiaohang.commandpatterns;

/**
 * 命令模式CommandPatterns
 * 降低命令发出者与命令接收者的耦合度
 * 适用于处理事务关系以及需要执行撤销的操作
 * Created by root on 2017/2/23.
 */
public class CommandPatterns {
    public static void main(String[] args) {
        CommandModeControl control=new CommandModeControl();
        MarcoCommand onmarco,offmarco;
        Light bedroomlight=new Light("BedRomLight");
        Light kitckenroomlight=new Light("kitckenroomlight");
        Stereo stereo=new Stereo();

        LightOnCommand bedroomlighton = new LightOnCommand(bedroomlight);
        LightOffCommand bedroomlightoff = new LightOffCommand(bedroomlight);
        LightOnCommand kitchlighton = new LightOnCommand(kitckenroomlight);
        LightOffCommand kitchlightoff = new LightOffCommand(kitckenroomlight);

        Command[] oncommands={bedroomlighton,kitchlighton};
        Command[] offcommands={bedroomlightoff,kitchlightoff};

        onmarco=new MarcoCommand(oncommands);
        offmarco=new MarcoCommand(offcommands);

        StereoOnCommand stereoOn = new StereoOnCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        StereoAddVolumeCommand stereoaddvol = new StereoAddVolumeCommand(stereo);
        StereoSubVolumeCommand stereosubvol = new StereoSubVolumeCommand(stereo);

        control.setCommand(0, bedroomlighton, bedroomlightoff);
        control.setCommand(1, kitchlighton, kitchlightoff);
        control.setCommand(2, stereoOn, stereoOff);
        control.setCommand(3, stereoaddvol, stereosubvol);
        control.setCommand(4, onmarco, offmarco);

        control.onButton(0);
        control.undoButton();
        //control.offButton(0);
        control.onButton(1);
        control.offButton(1);
        control.onButton(2);
        control.onButton(3);

        control.offButton(3);
        control.undoButton();
        control.offButton(2);
        control.undoButton();
        control.onButton(4);
        control.offButton(4);
    }
}
