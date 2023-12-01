package in10;

abstract class Mycomponent {	// 추상클래스 선언
	String name;
	public void load(String name) {
		this.name = name;
	}
	//Shape shape = new Shape();	// 컴파일 오류. 추상클래스는 객체로 생성할 수 없다. 
}
