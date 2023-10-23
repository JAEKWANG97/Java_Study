package ch08.sec05;


public class Television implements RemoteControl {
    //필드
    private int volume;

    //오버라이드
    @Override
    public void turnOn() {
        System.out.println("Tv를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("Tv를 끕니다.");
    }

    @Override
    public void setVolume(int value) {
        if (value > MAX_VOLUME) {
            value = MAX_VOLUME;
        } else if (value < MIN_VOLUME) {
            value = MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현제 볼륨은 " + value + " 입니다.");
    }

}
