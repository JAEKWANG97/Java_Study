package ch06.sec08.exam04;

public class CalculatorExample {
	public static void main(String[] args) {
		//객체생성
		Calculator myCalcu = new Calculator();

		//정사각형 넓이 구하기
		double result1 = myCalcu.areaRectangle(10);

		//직사각형 넓이 구하기
		double result2 = myCalcu.areaRectangle(10,20);

		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
	}
}
