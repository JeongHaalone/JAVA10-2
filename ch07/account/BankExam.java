package ch07.account;

import java.util.Scanner;

import ch07.account.service.BankSV;

public class BankExam {

	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	//public static BankSV[] bankValue = new BankSV[2];
	private static Account loginState ;
	
	
	// 생성자
	public static void main(String[] args) {
		System.out.println("** 계좌 통합 관리 시작 **");
		boolean run = true;
		while (run) {
			System.out.println("-------------------------------");
			System.out.println("1. 로그인 관리 2. 계좌 관리 메뉴  3. 계좌 정보 관리 4. 지로 납부 5. 종료");
			System.out.println("-------------------------------");
			System.out.print(">");
			int select = scanner.nextInt();
			switch (select) {
			case 1:
				System.out.println("로그인 하시겠습니다.");
				
				break;
			case 2:
				System.out.println("계좌를 관리하겠습니다.");
				BankSV bankSV = new BankSV();
				bankSV.menu(scanner, accountArray, loginState);
				
				break;
			case 3://한도, 적금
				System.out.println(".");
				
				break;

			case 4://공과금, 카드값 납부
				System.out.println(".");
				
				break;
				
			case 5:
				System.out.println(".");
				run = false;
				break;

			default:
				System.out.println("1~5의 숫자를 입력해주세요.");
			}// swtich

		} // while
		
	}// main 종료

	
}// class
