package pack01;

public class ObjectPropertyEx {
	public static void print(Object obj) {
		System.out.println(obj.getClass().getName()); 	// 클래스 이름
		System.out.println(obj.hashCode());			// 해시 코드 값 : p객체의 고유한 정수값
		System.out.println(obj.toString());			// 객체를 문자열로 만들어 출력
		System.out.println(obj);				// 객체 출력 : .toString() 생략
	}
	public static void main(String[] args) {
		Point p = new Point(2,3);
		print(p);
	}
}
