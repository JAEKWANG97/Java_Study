package ch12.sec04;

import java.sql.SQLOutput;

public class ExitExample {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            // i 값 출력
            System.out.println("i = " + i);
            if (i == 5){
                // JVM 프로세스 종료
                System.out.println("Forced quit Process");
                System.exit(0);
            }
        }
    }
}
