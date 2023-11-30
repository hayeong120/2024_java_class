package in11;

public class AbstractEx {
	public static void main(String[] args) {
		// Shape s = new Shape();		// 추상클래스로는 객체생성 불가
		Shape s = new Line();	// 업캐스팅
		s.draw(); 				// Line클래스의 draw() 호출
		s = new Rect(); 		// 업캐스팅
		s.draw();				// Rect클래스의 draw() 호출
		s = new Circle();		// 업캐스팅
		s.draw();				// Circle클래스의 draw() 호출
	}
}