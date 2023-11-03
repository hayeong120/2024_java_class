package pack02;

public class ToStringEx {
	public static void main(String[] args) {
		Point p = new Point(2,3);
		System.out.println(p.toString());
		System.out.println(p); 		// p는 p.toString으로 자동 변환
		System.out.println(p + "입니다."); 		// p는 p.toString으로 자동 변환
	}
}