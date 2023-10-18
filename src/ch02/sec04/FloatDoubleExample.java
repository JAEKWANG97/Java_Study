package ch02.sec04;

public class FloatDoubleExample {
    public static void main(String[] args) {
        // float과 double 타입의 소수 이하의 유효 자릿수를 확인한다.
        // double 타입은 float 타입 보다 약 2배의 유효 자릿수를 가지기 때문에 보다 정확한 데이터 저장이 가능하다.
        // 이는 double이 float보다 약 2배의 정밀도를 갖는다는 의미에서 붙여진 것이다. 확인 후에는 10의 거듭 제곱 리터럴을 대입해서 출력해보자

        // 정밀도 확인
        float var1 =0.123456789f;
        double var2 = 0.1234567890123456789;

        System.out.println("var1 : " + var1);
        System.out.println("var2 : " + var2);

        //10의 거듭제곱 리터럴
        double var3 = 3e6;
        float var4 = 3e6F;
        double var5 = 2e-3;
        System.out.println("var3: "+var3);
        System.out.println("var4: "+var4);
        System.out.println("var5: "+var5);
    }
}
