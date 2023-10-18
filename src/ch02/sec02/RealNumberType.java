package ch02.sec02;

public class RealNumberType {
    public static void main(String[] args) {
        //실수 타입에는 float과 double이 있음
        //타입    메모리크기   저장되는 허용 범위  유요 소수 이하 자리
        //double 8byte 64bit                    15자리
        //float 4byte 32bit                     7자리
        // double의 범위가 더 큼

        //float은 부호비트 1bit, 지수 8bit, 가수 23bit ==> 32bit

        //double은 부호비트 1bit, 지수 11bit, 가수 52bit ==> 64bit

        //10진수 리터럴
        double x = 0.25;
        double y = -3.14;

        //e 또는 E가 포함된 10의 거듭제곱 리터럴
        x = 5e2; //5.0 x 10^2 = 500.0
        y = 0.12E-2; //0.12 x 10^-2 = 0.0012

        //컴파일러는 실수 리터럴을 기본적으로 double 타입으로 해석함
        // 그래서 float 타입에 대입하고 싶다면 리터럴 뒤에 소문자 'f'나 대문자 'F'를 붙여 컴파일러가 float 타입임을 알 수 있도록 해야한다.
        double var = 3.14;
        var = 314e-2;
        float var2 = 3.14f;
        var2 = 3E6F;


     }
}
