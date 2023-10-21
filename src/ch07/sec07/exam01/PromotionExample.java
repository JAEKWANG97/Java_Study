package ch07.sec07.exam01;

class A {

}

class B extends A {

}

class C extends A {

}

class D extends B {

}

class E extends C {

}

public class PromotionExample {
    public static void main(String[] args) {
        B b = new B(); // A 상속
        C c = new C(); // A 상속
        D d = new D(); // B 상속
        E e = new E(); // C 상속

        A a1 = b;
        A a2 = c;
        A a3 = d;
        A a4 = e;

        B b1 = d;
        C c1 = e;

    }

}
