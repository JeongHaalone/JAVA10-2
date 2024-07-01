package ch03;

import java.util.Scanner;

public class ssnSwitch {

	public static void main(String[] args) {
		// switch를 이용한 주민등록번호 성별 구별
		System.out.println("당신의 주민번호를 입력하세요.");
		Scanner num = new Scanner(System.in);
		
		String ssn = num.next();
		char gender = ssn.charAt(7);

		switch (gender) {
			case  '1' : case  '3' : case  '5' : case  '7' :
			System.out.println("boy");
			break;
			
			case '2' : case '4' : case '6' : case '8' :
			System.out.println("girl");
			break;
			
			default :
			System.out.println("별에서 온 그대");
		}//switch 문 종료
		
	}//main문 종료

}//class문 종료
