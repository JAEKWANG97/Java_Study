package ch06.sec7.exam04;

public class CarExample {
	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println("car1.company = " + car1.company);
		System.out.println();

		Car car2 = new Car("자가용");
		System.out.println("car2.company = " + car2.company);
		System.out.println("car2.model = " + car2.model);



	}
}
