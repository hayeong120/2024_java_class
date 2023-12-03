package in08;

public class Circle extends Shape {
	protected String name;
	@Override
	public void draw() {
		name = "Circle";
		super.name = "Shape";	
		// name1 = "Shape"; 	멤버 변수의 이름이 다를 경우 super를 안 붙임
		super.draw();
		System.out.println(name);
	}
	public static void main(String[] args) {
		Shape b = new Circle();		// 업캐스팅
		b.paint();
	}
}