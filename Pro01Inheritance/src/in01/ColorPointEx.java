package in01;

public class ColorPointEx {
	public static void main(String[] args) {
		Point p = new Point();		// Point 객체 생성
		System.out.println(System.identityHashCode(p));		// p가 가리키는 객체의 주소값
		
//		p.x = 10; 			// private이기 때문에 오류
		p.set(1, 2); 			// Point 클래스의 set() 호출
		p.showPoint();
		
		ColorPoint cp = new ColorPoint();	// ColorPoint 객체
		System.out.println(System.identityHashCode(cp));		// cp가 가리키는 객체의 주소값
		
		cp.set(3, 4); 			// Point의 set() 호출
		cp.setColor("red");	  		// COlorPoint의 setColor() 호출
		cp.showColorPoint(); 		// 컬러와 좌표 출력
	}
}