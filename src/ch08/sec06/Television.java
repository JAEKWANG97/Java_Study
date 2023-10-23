package ch08.sec06;

public class Television implements RemoteControl{

    private int volume;
    @Override
    public void turnOn(){
        System.out.println("Tv를 켰네");
    }

    @Override
    public void turnOff(){
        System.out.println("Tv를 껏네");
    }

    @Override
    public void setVolume(int volume){
        System.out.println("새빨간 니 입술");
    }


}
