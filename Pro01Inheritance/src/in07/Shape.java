package in07;

public class Shape {	// 슈퍼클래스
	public Shape next;
	public Shape() {next = null;}
	
	public void draw() {
		System.out.println("Shape");
	}
}