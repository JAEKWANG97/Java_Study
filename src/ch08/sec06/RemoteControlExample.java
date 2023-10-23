package ch08.sec06;

public class RemoteControlExample {
    public static void main(String[] args) {
        //인터페이스 변수 선언
        RemoteControl rc;
        rc = new Television();

        rc.turnOn();
        rc.setVolume(4);
        rc.turnOff();
        rc.setMute(true);
        RemoteControl.changeBattery();
    }
}
