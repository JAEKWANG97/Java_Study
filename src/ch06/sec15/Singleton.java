package ch06.sec15;

public class Singleton {
	//private 접근 권한을 갖는 정적 필드 선언과 초기화
	private static Singleton singleton = new Singleton();

	private Singleton(){

	}

	public static Singleton getSingleton(){
		return singleton;
	}
}
