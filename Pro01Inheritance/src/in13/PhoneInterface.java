package in13;

interface PhoneInterface {		// 인터페이스 선언
	final int TIMEOUT = 10000;		// 상수 필드 선언. public static 생략
	void sendCall();		// 추상 메소드. public abstract 생략
	void receiveCall();		// 추상 메소드. public abstract 생략
	default void printLogo() {			// default 메소드 
		System.out.println("***Phone***");
	}
	// interface에서는 일반메소드 작성불가
}
