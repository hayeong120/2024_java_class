package in14;

public class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface {
	// 인터페이스의 메소드를 구현할 때 public을 생략하면 오류 발생
	// MobilePhoneInterface의 추상 메소드 구현
	@Override
	public void sendCall() {
		System.out.println("따르릉따르릉~~~");
	}
	@Override
	public void receiveCall() {
		System.out.println("전화 왔어요.");
	}
	@Override
	public void sendSMS() {
		System.out.println("문자를 보냅니다.");
	}
	@Override
	public void receiveSMS() {
		System.out.println("문자왔어요.");
	}
	
	// MP3Interface의 추상 메소드 구현
	@Override
	public void play() {
		System.out.println("음악을 연주합니다.");
	}
	@Override
	public void stop() {
		System.out.println("음악을 중단합니다.");
	}
	
	// 추가로 작성한 일반 메소드 
	public void schedule() {
		System.out.println("일정을 관리합니다.");
	}
}