package pack07;

public class CompareEx {
	public static void main(String[] args) {
		String java = "Java";
		String cpp = "C++";
		
		int res = java.compareTo(cpp);
		if(res == 0)
			System.out.println("The same");
		else if(res<0)
			System.out.println(java + " < " + cpp);
		else 
			System.out.println(java + " > " + cpp);
	}
}