package in05;

public class DowncastingEx {
	public static void main(String[] args) {
		Person p = new Student("홍길동"); 	// 업캐스팅
		Student s;
		
		// 업캐스팅이 된 객체만 다운캐스팅 가능
		// 업캐스팅이 안 된 객체를 다운캐스팅하면 런타임 에러 발생
		s = (Student)p;		// 다운캐스팅
		
		System.out.println(s.name);		// 오류 없음
		s.grade = "A";			// 오류 없음
	}
}