package ch08.service;

import java.util.Scanner;

import ch08.lineage.Account;

public class LoginService {

	public static Account menu(Scanner scanner, Account[] accounts, Account loginState) {
		// 부메뉴
	
		
		System.out.println("Login page");
		System.out.println("1. 로그인 2. 회원 가입 3. 회원 수정 4. 회원 삭제");
		int select = scanner.nextInt();
		switch (select) {
		case 1:
			System.out.println("start login");
			System.out.println("ID를 입력하세요.");
			String id = scanner.next();
			System.out.println("PW를 입력하세요.");
			String pw = scanner.next();
			Account account = new Account();
			account.setId(id);// set
			account.setPw(pw);// set
			for (int i = 0; i < accounts.length; i++) {// get
				if (accounts[i] != null) {
					if (accounts[i].getId().equals(id)) {
						System.out.println("아이디가 존재합니다.");
					} else {
						System.out.println("아이디가 틀립니다.ㅡㅡ");
						if (accounts[i].getPw().equals(pw)) {
							System.out.println("비밀번호가 존재합니다.");
						} else {
							System.out.println("error password");
							loginState = accounts[i];
							System.out.println("로그인 성공!");
							break;
						}
					}
				} else {
					System.out.println("잘못된 입력");
					break;
				}
			} // for close
		case 2:
			System.out.println("계정을 생성하기");
			System.out.println("ID를 입력하세요.");
			String newId = scanner.next();
			System.out.println("PW를 입력하세요.");
			String newPw = scanner.next();
			Account newAccount = new Account() ;
			newAccount.setId(newId);
			newAccount.setPw(newPw);
			for (int i = 0 ; i < accounts.length; i++) {
				if (accounts[i] ==null) {
					loginState = accounts[i];
					System.out.println("계정이 생성되었습니다.");
					break;
				} else {
					System.out.println("입력해주세요..");
					
				}
			}
			break;
		case 3:
			System.out.println("계정을 수정하기");
			System.out.println("자신의 id 입력해주세요.");
			String modifyId = scanner.next();
			System.out.println("바꾸실 비밀번호를 입력해주세요.");
			String modifyPw = scanner.next();
			
			for (int i =0; i < accounts.length; i++) {
				if (accounts[i] !=null) {
					if (accounts[i].getId().equals(modifyId)) {
						accounts[i].setPw(modifyPw);
						loginState = accounts[i];
						System.out.println("수정완료");
					}
				}//if close
			}//for close
		}// switt main
		return loginState;
	
	}// menu close
}
