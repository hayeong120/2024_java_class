package pack06;

public class AutoBoxingUnBoxingEx {
	public static void main(String[] args) {
		int n = 10;
		Integer intObject = n;		// 자동 박싱(auto boxing)
		System.out.println("intObject = " + intObject);
		
		int m = intObject + 10;		// 자동 언박싱(auto unboxing)
		System.out.println("m = " + m);
	}
}