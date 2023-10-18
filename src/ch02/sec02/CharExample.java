package ch02.sec02;

public class CharExample {
    public static void main(String[] args) {
        char c1 = 'A';  //문장 저장
        char c2 = 65;   //유니코드 직접 저장

        char c3 = '가';   //문자 저장
        char c4 = 44032;  //유니코드 직접 저장

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);

        // char 타입의 변수에 어떤 문자도 대입하지 않고 단순히 초기화를 할 목적으로
        // 작은 따움표 두개를 연달아 붙이면 컴파일 에러임
        // 이럴땐 공백을 추가해야함
    }
}
