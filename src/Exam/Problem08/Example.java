package Exam.Problem08;

public class Example {
    public static void action(A a){
        if (a instanceof C c){
            c.method2();
        }
    }

    public static void main(String[] args) {
        action(new B());
        action(new C());
    }
}
