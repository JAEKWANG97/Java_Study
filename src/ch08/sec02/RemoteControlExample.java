package ch08.sec02;

import ch06.sec13.exam02.package1.A;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc;
        rc = new Television();

        //RemoteControl rc = new Television();
        // 변수 선언과 동시에 구현 객체 대입 가능

        rc.turnOn();

        rc = new Audio();
        rc.turnOn();
    }
}
