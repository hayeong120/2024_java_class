package in10;

abstract class Shape {		// 추상클래스 선언
	public Shape() {}
	public void paint() { draw(); }
	abstract public void draw();		// 추상 메소드
}