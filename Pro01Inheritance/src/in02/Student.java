package in02;

public class Student extends Person {
	public void set() {
		age = 30;		// 슈퍼클래스의 default멤버 접근 가능
		name = "홍길동";		// 슈퍼클래스의 public멤버 접근 가능
		height = 183;		// 슈퍼클래스의 public멤버 접근 가능
//		weight = 75;		// 오류. 슈퍼클래스의 private멤버 접근 불가능
		setWeight(75);			// private멤버 weight은 setWeight()로 간접 접근
	}
}
