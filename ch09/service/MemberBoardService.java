package ch09.service;

import java.util.Scanner;

import ch09.DTO.BoardDTO;
import ch09.DTO.MemberDTO;

public class MemberBoardService {
	//필드
	MemberDTO memberDTO ;
	
	//생성자
	
	//메서드
	public static void menu(Scanner scanner , FreeBoardService[] freeBoardServices,  MemberDTO[] memberDTOs, MemberDTO[] loginState) {
				
		System.out.println("1. 자유게시판 2. 질문 게시판 3. 상품 게시판 4. 식단 인증 게시판 5. 종료");
		System.out.println(">>>");
		int select = scanner.nextInt();
		switch (select) {
		case 1:
			System.out.println("자유 게시판 페이지입니다.");
			FreeBoardService.menu(scanner, freeBoardServices, memberDTOs, loginState);
			break;
		case 2:
			System.out.println("질문 게시판 페이지입니다.");
			break;
		case 3:
			System.out.println("상품 게시판 페이지입니다.");
			break;
		case 4:
			System.out.println("식단 인증 게시판 페이지입니다.");
			break;
		case 5:
			System.out.println("종료하겠습니다.");
			break;
		default:
			System.out.println("오류 : 1~4 입력입니다.");
			
		}// switch
	}// while
}//class
