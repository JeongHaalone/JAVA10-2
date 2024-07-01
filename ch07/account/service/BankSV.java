package ch07.account.service;

import java.util.Scanner;

import ch07.account.Account;

public class BankSV {
	int owner;
	public String name; // 통장 이름
	public String accountName; // 계좌 번호
	public int moveMoney; // 이동하는 금액

	public static Account menu(Scanner scanner, Account[] accountArray, Account loginState) {
		boolean run = true;
		while (run) {
			System.out.println("1. 계좌 생성 2. 계좌 조회 3. 계좌 입출금 4. 타계좌 입출금 내역 5. 종료");
			System.out.print(">>>");
			int select = scanner.nextInt();
			switch (select) {
			case 1 :
				createAccount();
			break;
			case 2 :
				System.out.println("계좌 목록을 조회하시겠습니다.");
				accountList();
				break;
			case 3:
				System.out.println("예금 페이지입니다.");
				deposit();
				break;
			case 4 :
				System.out.println("출금 페이지입니다.");
				withdraw();
				break;
			case 5:
				System.out.println("종료하시겠습니다.");
				run = false;
				break;
			default:
				System.out.println("1~5의 숫자를 입력해주세요.");
			}//switch close
		
		}//while close
		return loginState;
}// menu close

	private static void withdraw() {
		// 출금 조회
		System.out.println("---------------");
		System.out.println("출금");
		System.out.println("---------------");

		System.out.println("계좌번호를 입력하세요.");
		String ano = scanner.next();
		System.out.println("출금할 금액을 입력");
		int money = scanner.nextInt();

		for (int i = 0; i < accountArray.length; i++) {
			Account account = findAccount(ano); // account 배열(100개)이 들어있는 메서드 호출
			if (account == null) {
				System.out.println("입력이....ㄷㄷㄷㄷ다시 입력하세요.");
				return;
			} // if
			System.out.println("기존 금액 : " + account.getBalance());
			System.out.println("출금 후 금액 : " + (account.getBalance() - money));
		} // for
	}// withdraw close

	private static void deposit() {
		// 예금 조회 메서드
		System.out.println("---------------");
		System.out.println("예금");
		System.out.println("---------------");

		System.out.println("계좌번호를 입력하세요.");
		String ano = scanner.next();
		System.out.println("입금할 금액을 입력");
		int money = scanner.nextInt();

		for (int i = 0; i < accountArray.length; i++) {
			Account account = findAccount(ano);// findAccount 메서드 호출
			if (account == null) {
				System.out.println("입력이 잘못되었어요.");
				return;// 종료
			} // if

			System.out.println("기존금액 :" + account.getBalance());
			System.out.println("예금하신 금액 :" + money);
			System.out.println("예금 후 금액" + (account.getBalance() + money));
		} // for
	}// deposit close

	private static void accountList() {
		// 계좌 조회 메서드
		System.out.println("-------------------------------");
		System.out.println("계좌 조회 페이지입니다.");
		System.out.println("-------------------------------");
		for (int i = 0; i < accountArray.length; i++) {
			Account account = accountArray[i];
			if (account != null) {
				System.out.println(" ");
				System.out.println(account.getAno());
				System.out.println(" ");
				System.out.println(account.getOwner());
				System.out.println(" ");
				System.out.println(account.getBalance());
			} // if
		} // for
	}// accountList method close

	private static void createAccount() {
		// 계좌 생성 메서드

		System.out.println("-------------------------------");
		System.out.println("원하시는 계좌번호를 입력해주세요.");
		System.out.print(">");
		String ano = scanner.next();
		System.out.println("계좌주의 이름을 입력해주세요.");
		System.out.print(">");
		String owner = scanner.next();
		System.out.println("초기 입금액을 입력해주세요.");
		System.out.print(">");
		int balance = scanner.nextInt();

		Account newAccount = new Account(ano, owner, balance); // Account 클래스 newAccount에 저장
		for (int i = 0; i < accountArray.length; i++) {// 계속 저장
			if (accountArray[i] != null) {
				newAccount = accountArray[i];
				break;
			} // if
		} // for
		System.out.println("계좌가 생성되었습니다.");
	}// createAccount close
	
	public static void findAccount(String ano) {// account 배열에 쓰일 객체를 만듬
		Account account = null; // 배열이 빈..
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				String dbAno = accountArray[i].getAno();// get계좌번호는 dbAno(동일한 계좌 찾으려는 참조변수) -검증
				if (dbAno.equals(ano)) {//검증된 
					account = accountArray[i];// account배열 탄생
					break;
				} // if
			} // if
		} // for
		return account;
	}// findAccount
}// class
