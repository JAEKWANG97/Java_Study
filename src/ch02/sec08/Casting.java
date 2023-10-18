package ch02.sec08;

public class Casting {
    public static void main(String[] args) {
        // 강제 타입 변환
        // 큰 허용 범위 타입은 작은 허용 범위 타입으로 자동 타입 변환될 수 없음
        // 하지만 큰 그릇을 작은 그릇 단위로 쪼개어서 한 조각만 작은 그릇에 넣는 것은 가능함

        // 이것이 캐스팅임
        // 캐스팅 연산자는 ()임. 괄호안에 들어가는 타입은 쪼개는 단위
        int intValue = 10;

        byte byteValue = (byte) intValue;
        System.out.println(byteValue);
        // int는 4바이트로 이루어져 있음
        // byte는 1바이트임
        // int를 바이트로 표현해서 바이트의 범위만큼 가져오는 것
        // 만약 intValue가 바이트의 범위를 넘으면 casting 할 때 byte이외의 자릿수들은 무시 될 것

        int value = 12345678;
        byteValue = (byte) value;
        System.out.println(byteValue);

        // 해당 코드 컴파일하면 78만 출력댐
        // 강제 타입의 목적은 원래 값이 유지되면서 타입만 바꾸는 것임
        // 그렇기 떄문에 작은 허용 범위 타입에 저장될 수 있는 값을 가지고 강제 타입 변환을 해야함

        // Long 에서 int
        // long은 int보다 큰 범위를 가짐. 즉 casting 해야함
        long longvalue = 300;
        intValue = (int) longvalue;
        // casting 하면 300이 나올거임 int는 300 표현 쌉 가능임


        //int -> char
        //int 타입은 char 타입보다 큰 허용 범위를 가짐.
        // 근데 char은 음수를 표현 못함 char의 허용범위는 0~65535임
        intValue = 65;
        char charValue = (char) intValue;
        System.out.println(charValue);

        // 실수에서 정수? 캐스팅?
        // float, double은 실수 타입이다.
        // byte,short,int,long 보다 큰 범위를 가짐
        // 이렇게 캐스팅하게되면 소수점은 다 버려질거임 ㅎㅎ
        double doubleValue = 3.14;
        intValue = (int) doubleValue;
        System.out.println(intValue); // 아마 3 으로 출력 ㅎㅎ


    }
}
