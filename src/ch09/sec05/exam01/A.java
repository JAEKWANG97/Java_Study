package ch09.sec05.exam01;

public class A {
    //A의 인스턴스 필드와 메소드
    int field1;

    void method1() {
        System.out.println("instance method1 excuted");
    }

    //A의 정적 필드와 메소드
    static int field2;

    static void method2() {
        System.out.println("static method2 excuted");
    }

    //인스턴스 멤버 클래스
    class B {
        void method(){
            //A의 인스턴스 필드와 메소드 사용
            field1 = 10;
            method1();
            //A의 정적 필드와 멤소드 사용
            field2 = 20;
            method2();
        }
    }

    static class C {
        void method(){
            //A의 인스턴스 필드와 메소드 사용
            // field1 = 10; --> 정적 멤버 클래스는 정적 멤버만 사용가능
            // method1();

            field2 = 10;
            method2();
        }
    }

}