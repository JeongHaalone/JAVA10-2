package ch09.service;

import java.util.Scanner;

import ch09.DTO.MemberDTO;

public class LoginService {

	public static LoginService menu2(Scanner scanner, MemberDTO[] memberDTOs, LoginService loginState,
			MemberDTO newmemberDTO) {
		// 부메뉴

		System.out.println("Login page");
		System.out.println("1. 로그인 2. 회원 가입 3. 회원 수정 4. 회원 삭제 5. 메인메뉴로");
		boolean run = true;
		while (run) {
			int select = scanner.nextInt();
			switch (select) {
			case 1:
				System.out.println("start login");
				System.out.println("ID를 입력하세요.");
				String id = scanner.next();
				System.out.println("PW를 입력하세요.");
				String pw = scanner.next();
				MemberDTO memberDTOs1 = new MemberDTO();// 입력받은 맴버 배열
				memberDTOs1.setId(id); // set
				memberDTOs1.setPw(pw);// set
				for (int i = 0; i < memberDTOs.length; i++) {// get
					if (memberDTOs[i] != null) {
						if (memberDTOs[i].getId().equals(memberDTOs1.getId())) {// 기존배열과 키보드 비교
							System.out.println("아이디가 존재합니다.");
						} else {
							System.out.println("아이디가 틀립니다.ㅡㅡ");
							if (memberDTOs[i].getPw().equals(memberDTOs1.getPw())) {
								System.out.println("비밀번호가 존재합니다.");
							} else {
								System.out.println("error password");
								loginState = memberDTOs[i];// 로그인 정보를 저장
								System.out.println("로그인 성공!");
								break;
							} // else
						} // else
					} else {
						System.out.println("잘못된 입력");
						break;
					} // else close
				} // for close
			case 2:
				System.out.println("계정을 생성하기");
				System.out.println("ID를 입력하세요.");
				String newId = scanner.next();
				System.out.println("PW를 입력하세요.");
				String newPw = scanner.next();
				MemberDTO newmemberDTO = new MemberDTO();
				newmemberDTO.setId(newId);
				newmemberDTO.setPw(newPw);
				for (int i = 0; i < memberDTOs.length; i++) {
					if (memberDTOs[i] == null) {
						loginState = memberDTOs[i];// 로그인상태를 저장
						System.out.println("계정이 생성되었습니다.");
						break;
					} else {
						System.out.println("입력해주세요.");
					}
				}
				break;
			case 3:
				System.out.println("계정을 수정하기");
				System.out.println("자신의 id 입력해주세요.");
				String modifyId = scanner.next();
				System.out.println("바꾸실 비밀번호를 입력해주세요.");
				String modifyPw = scanner.next();

				for (int i = 0; i < memberDTOs.length; i++) {
					if (memberDTOs[i] != null) {
						if (memberDTOs[i].getId().equals(modifyId)) {
							memberDTOs[i].setPw(modifyPw);
							loginState = memberDTOs[i];// 수정한 로그인상태를 저장
							System.out.println("수정완료");
						}
					}
				}
			case 4:
				System.out.println("계정을 삭제하기");
				System.out.println("삭제할 id를 입력해주세요.");
				String deleteId = scanner.next();
				for (int i = 0; i < memberDTOs.length; i++) {
					if (deleteId != null && memberDTOs[i].getId() == deleteId) {
						memberDTOs[i] = null;
					} // if
				} // for
				break;
			case 5:
				run = false;
			default:
				System.out.println("1~4값을 입력해주세요.");
			}// switt main

		} // while close
		return loginState;
	}// menu close

}// class
