package in03;

public class ColorPoint extends Point {
	private String color;	// 점의 색
	public ColorPoint(int x, int y, String color) {		// Point의 생성자 Point(x,y) 호출
		super(x,y);			// 반드시 super()메소드는 생성자 메소드의 첫번째 줄에 기술 
		this.color = color;
	}
	public void showColorPoint() {		// 컬러 점의 좌표 출력
		System.out.print(color);
		showPoint();	// Point 클래스의 showPoint() 호출
	}
}
