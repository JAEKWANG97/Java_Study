package ch03.sec04;

public class AccuracyExample1 {
    public static void main(String[] args) {
        // 정확한 계산은 정수 연산으로 함
        int apple = 1;
        double pieceUnit = 0.1;
        int number = 7;

        double result = apple - number*pieceUnit;
        System.out.println("result = " + result);
    }
}
