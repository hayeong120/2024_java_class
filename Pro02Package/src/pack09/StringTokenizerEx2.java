package pack09;

import java.util.StringTokenizer;

public class StringTokenizerEx2 {
	public static void main(String[] args) {
		// 구분하는 문자가 없을 경우에는 공백을 기준으로 토큰 생성
		StringTokenizer st = new StringTokenizer("홍길동 장화 홍련 콩쥐 팥쥐");
		
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());
	}
}