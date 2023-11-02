package pack03;

public class EqualsEx {
	public static void main(String[] args) {
		// 각각 생성하기 때문에 주소값이 다름
		Point a = new Point(2,3);
		Point b = new Point(2,3);
		Point c = new Point(3,4);
		
		if(a == b)	// 주소값 비교
			System.out.println("a==b");
		if(a.equals(b))		// 내용 비교
			System.out.println("a is equal to b");
		if(a.equals(c))		// 내용 비교
			System.out.println("a is equal to c");
	}
}