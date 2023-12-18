package in01;

public class Point {
	private int x, y;	// 한 점을 구성하는 x, y좌표
	public void set(int x, int y) {		// 매개변수 x, y값을 멤버변수 x, y에 저장
		this.x = x; this.y = y;
	}
	public void showPoint() {	// 점의 좌표 출력
		System.out.println("(" + x + "," + y + ")");
	}
}
