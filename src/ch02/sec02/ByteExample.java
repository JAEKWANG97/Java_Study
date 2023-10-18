package ch02.sec02;

public class ByteExample {
    public static void main(String[] args) {
        // byte 타입 변수에 허용범위를 초과한 값을 대입했을 경우 컴파일 오류가 발생함
        byte var1 = -128;
        byte var2 = -30;
        byte var3 = 0;
        byte ver4 = 30;
        byte ver5 = 127;
//        byte ver6 = 128;

    }

    public static class LongExample {
        public static void main(String[] args) {
            // Long 타입은 수치가 큰 데이터를 다루는 프로그램에서 사용됨
            // 예를 들어 은행이나 과학 분야에서 사용되는 프로그램들임
            // 기본적으로 컴파일러는 정수 리터럴 int 타입 값으로 간주하기 떄문에,
            // int타입의 허용범위를 초과하는 리터럴은 뒤에 소문자 l 이나 대문자 L을 붙여 long 타입 값임을 컴파일러에게 전해줘야함

            long var1 = 10;
            long var2 = 20L;
    //        long var3 = 1000000000000;
            long var4 = 1000000000000L;

            System.out.println(var1);
            System.out.println(var2);
            System.out.println(var4);
        }
    }
}