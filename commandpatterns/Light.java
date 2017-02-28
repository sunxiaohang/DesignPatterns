package com.sunxiaohang.commandpatterns;

/**
 * Created by root on 2017/2/23.
 */
public class Light {
    String loc="";

    public Light(String loc) {
        this.loc = loc;
    }
    public void On(){
        System.out.println(loc+" ON");
    }
    public void Off(){
        System.out.println(loc+" Off");
    }
}
class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.Off();
    }

    @Override
    public void undo() {
        light.On();
    }
}class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.Off();
    }

    @Override
    public void undo() {
        light.On();
    }
}
class MarcoCommand implements Command{
    private Command[] commands;
    public MarcoCommand(Command[] commands) {
        this.commands = commands;
    }
    @Override
    public void execute() {
        for (int i = 0,len=commands.length; i < len; i++) {
            commands[i].execute();
        }
    }
    @Override
    public void undo() {
        for (int i = commands.length-1; i >=0 ; i++) {
            commands[i].undo();
        }
    }
}
class StereoAddVolumeCommand implements Command{
    private Stereo stereo;
    public StereoAddVolumeCommand(Stereo stereo){
        this.stereo=stereo;
    }
    @Override
    public void execute() {
        int vol=stereo.GetVol();
        if(vol<11)stereo.setVolume(++vol);
    }
    @Override
    public void undo() {
        int vol=stereo.GetVol();
        if(vol>0)stereo.SetVol(--vol);
    }
}
class StereoSubVolumeCommand implements Command{
    private Stereo stereo;
    public StereoSubVolumeCommand(Stereo stereo){
        this.stereo=stereo;
    }
    @Override
    public void execute() {
        int vol=stereo.GetVol();
        if(vol>0)stereo.setVolume(--vol);
    }
    @Override
    public void undo() {
        int vol=stereo.GetVol();
        if(vol<11)stereo.SetVol(++vol);
    }
}
