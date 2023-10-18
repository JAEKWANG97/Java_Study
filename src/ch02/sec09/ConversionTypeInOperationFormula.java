package ch02.sec09;

public class ConversionTypeInOperationFormula {
    public static void main(String[] args) {
        // 자바는 실행 성능을 향상 시키기 위해 컴파일 단계에서 연산을 수행함
        // 정수 리터럴 10과 20을 덧셈 연산해서 결과를 byte 타입 변수 result에 저장하는 코드가 있다고 가정함
        byte result = 10 + 20; //컴파일: byte result = 30
        result = 1000 - 990;

        System.out.println(result);

        byte var = 110;
        result = 10 + 20; //컴파일 : byte result = 30

        System.out.println(result);
        System.out.println(var);

        // 자바 컴파일러는 컴파일 단계에서 10 + 20을 미리 연산해서 30을 만듬
        // 그리고 변수에 저장하도록 바이트코드를 생성함
        // 따라서 실행 시 덧셈 연산이 없으므로 실행 성능이 좋아짐

        // 정수 리터릴이 아니라 변수가 피연산자로 사용되면 실행 시 연산을 수행함
        // 정수 타입 변수가 산술 연산 식에서 피연산자로 사용되면
        // int 타입 보다 작은 byte, short 타입의 변수는 int로 자동 타입 변환되어 연산을 수행함

        byte x = 10;
        byte y = 20;
        int value1 = x + y;
//        byte value2 = x + y;
        // 연산은 int로 자동변환 되기 떄문에 바이트 타입으로 저장 못함
        // int result => byte,char,shor,int
        // 연산자

        //하지만 실수 연산의 경우,
        long result3 = 1234L + 1234L;
        // 가능함

        float result4 = 1.2f + 3.4f;
        System.out.println(result4);

        // 피연산자 중 하나가 double 타입이면 다른 피연산자도 double 타입으로 변호나되어 연산되고, 연산결과 또한 double 타입이 된다.
        // int 타입 과 double타입을 연산하는 경우에도 int 타입 피연산자 double 타입으로 자동 변환 되고 수행한다.

        // 결국 더 큰 범위로 변환되서 연산 한 다음 그 타입으로 저장한다는거임^^

        // 그래서 int 타입으로 연산을 해야한다면 double 타입을 int 타입으로 강제 변환하고 덧셈연산을 수행하면 됨
        // int intValue = 10;
        // double doubleValue = 5.5;
        // int result = intValue + (int) doubleValue; --> 10 + 5

        // 수학에서 1을 2로 나누면 0.5가 나옴.
        // int x = 1;
        // int y = 2;
        // double result = x/y;
        // System.out.println(result); //0.5가 출력될까요?
        // 음.......................................ㅇㅇ
        // 근데 0.0 이 출려됨.
        // double타입 변수 result에 저장하므로 0.0 이 됨
        // 자바에서 정수 연산의 결과는 항상 정수가 되기 때문이다.
        // 따라사 x/y의 연산 결과는 0.5가 아니라 0이 되고, 0을 double타입 변수 result에 저장하므로 0.0이 된다.
        // 그래서 0.5가 되기 위해서는 x/y 부분을 정수 연산이 아니라 실수 연산으로 변경해야한다.
        // x,y 둘 중 하나를 double타입으로 변환하는 것이다.

        // 방법 1
        x = 1;
        y = 2;
        double result5 = (double) x / y;

        //방법 2
        double result6 = x / (double) y;

        //방법 3
        result6 = (double) x / (double) y;

    }
}
