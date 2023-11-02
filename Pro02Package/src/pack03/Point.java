package pack03;

public class Point {
	private int x, y;
	public Point(int x, int y) {
		this.x = x;		this.y = y;
	}
	public boolean equals(Object obj) {		// 업캐스팅
		Point p = (Point)obj;		// 다운캐스팅 
		if(this.x == p.x && this.y == p.y)	return true;	//this는 호출한 객체 이름 : a.x
		else	return false;
	}
}