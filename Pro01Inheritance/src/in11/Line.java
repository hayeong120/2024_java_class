package in11;

public class Line extends Shape {
	// 메소드 오버라이딩을 하여 반드시 추상 메소드를 구현해야 함
	@Override
	public void draw() {	// 메소드 오버라이딩
		System.out.println("Line");
	}
}
