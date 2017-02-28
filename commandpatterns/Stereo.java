package com.sunxiaohang.commandpatterns;

/**
 * Created by root on 2017/2/23.
 */
public class Stereo {
    static int volume=0;
    public void On(){
        System.out.println("Stereo On");
    }
    public void Off(){
        System.out.println("Stereo Off");
    }
    public void SetCd(){
        System.out.println("stereo SetCd");
    }

    public static void setVolume(int volume) {
        Stereo.volume = volume;
        System.out.println("Stereo volume="+volume);
    }
    public int GetVol(){
        return volume;
    }
    public void SetVol(int vol){
        this.volume=vol;
    }
    public void start(){
        System.out.println("Stereo Start");
    }
}
class StereoOnCommand implements Command{
    private Stereo stereo;
    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }
    @Override
    public void execute() {
        stereo.On();
        stereo.SetCd();
    }
    @Override
    public void undo() {

    }
}
class StereoOffCommand implements Command{
    private Stereo stereo;
    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }
    @Override
    public void execute() {
        stereo.Off();
    }
    @Override
    public void undo() {
        stereo.On();
        stereo.SetCd();
    }
}

