package in07;

public class MethodOverridingEx {
	static void paint(Shape p) {	// 업캐스팅
		p.draw(); 	// p가 가리키는 객체 내에 오버라이딩 된 draw()호출
	}
	public static void main(String[] args) {
		Line line = new Line();
		paint(line);
		
		paint(new Shape());
		paint(new Line());
		paint(new Rect());
		paint(new Circle());
	}
}