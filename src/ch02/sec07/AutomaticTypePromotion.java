package ch02.sec07;

public class AutomaticTypePromotion {
    public static void main(String[] args) {
        // 자동 타입 변환
        // 자동 타입 변환은 값의 허용 범위가 작은 타입이 허용 범위가 큰 타입으로 대입될 떄 발생함

        // byte < short , char < int < long < float < double

        byte byteValue = 10;
        int intValue = byteValue; // 자동 타입 변환 됨

        System.out.println(byteValue);
        System.out.println(intValue);

        // 자동 타입변환에도 예외가 있다. char 타입보다 허용 범위가 작은 byte 타입은 char타입으로 자동변환 될 수 없다.
        // char타입의 허용범위는 음수를 포하하지 않기 때문에.

    }
}
