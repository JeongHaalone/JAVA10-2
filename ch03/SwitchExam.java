package ch03;

import java.util.Scanner;

public class SwitchExam {


	public static void main(String[] args) {
		
		
		Scanner numbersDay = new Scanner(System.in);
		System.out.println("당신이 휴가를 보낼 일수 : ");
		int holiDay = numbersDay.nextInt();
		
		System.out.println("이번달에 " + holiDay + "일을 쓰셔서 " + (30 - holiDay) + "일이 남으셨습니다.");
			
		System.out.println("=========================================================");
		
		System.out.println("직급을 입력하세요.");
		Scanner position = new Scanner(System.in);
		String myP = position.next();
		
		switch (myP) {
		case "부장" : case "과장" : case "차장" : case "행정원" :
		break;
		
		
		default :
		 System.out.println("당신의 직급은 존재하지 않습니다.");
			break;

			
		}
		
		System.out.println("당신의 직급은"+ myP +"입니다.");
		
	}

}
