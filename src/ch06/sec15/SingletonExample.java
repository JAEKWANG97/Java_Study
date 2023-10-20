package ch06.sec15;

public class SingletonExample {
	public static void main(String[] args) {
		//정적 메소드를 호출해서 싱글톤 객체 얻음
		Singleton obj1 = Singleton.getSingleton();
		Singleton obj2 = Singleton.getSingleton();

		if (obj2 == obj1) {
			System.out.println("같은 객체!");
		} else {
			System.out.println("다른 객체!");
		}
	}
}
