package in08;

public class Shape {
	protected String name;
	public void paint() {
		draw();		// 동적바인딩으로 하위클래스에 draw()메소드 호출
	}
	public void draw() {
		System.out.println(name);
	}
}
