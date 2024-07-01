package ch03;

import java.util.Scanner;

public class NameExtractExam {

	public static void main(String[] args) {
		// 이름에서 문자를 추출한 값에서 성씨를 추출함
		
		Scanner name = new Scanner(System.in);
		System.out.println("한국 이름을 쓰세요 : ");
		
		
		char firstName = name.next().charAt(0);
		
		//System.out.println("검증코드용 : " + firstName);
		
		switch (firstName) {
			case '김' :
			System.out.println("당신은 김씨입니다.");
			System.out.println("김씨는 한국에서 가장 많은 성입니다.");
			System.out.println("더 많은 정보를 보려면 더브기를 입력하세요.");
			String kimInfo = name.next();
			System.out.println("김씨의 인구수는 약 10,689,959명입니다. ");
			break;
			
			case '이' :
			System.out.println("당신은 이씨입니다.");
			System.out.println("더 많은 정보를 보려면 더브기를 입력하세요.");
			String leeInfo = name.next();
			System.out.println("이씨의 인구수는 약 7,306,828명입니다. ");
			
			break;
		
			default :
				
				if (firstName>= 'a' && firstName <='z') {
					System.out.println("We are not available to english name. Sorry.:D)");
				}
				else
					System.out.println("당신은 그외의 성을 가졌습니다.");
			
			
		}//switch문 종료
		

	}//main문 종료

}//class문 종료
