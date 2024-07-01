package ch09;

import java.util.Scanner;


import ch09.DTO.BoardDTO;
import ch09.DTO.MemberDTO;
import ch09.service.FoodBoardService;
import ch09.service.FreeBoardService;
import ch09.service.ItemBoardService;
import ch09.service.LoginService;
import ch09.service.MemberBoardService;
import ch09.service.QABoardService;

public class WebExam {

	public static Scanner scanner = new Scanner(System.in);
	public static FreeBoardService[] freeBoardServices = new FreeBoardService[100];
	public static ItemBoardService[] itemBoardServices = new ItemBoardService[100];
	public static FoodBoardService[] foodBoardServices = new FoodBoardService[100];
	public static MemberBoardService[] memberBoardServices = new MemberBoardService[100];
	public static QABoardService[] qaBoardServices = new QABoardService[100];
	public static MemberDTO[] memberDTOs = new MemberDTO[100];
	public static LoginService loginState;
	public static MemberDTO newmemberDTO;

	//생성자
	
	
	public static void main(String[] args) {
		// 주메뉴

		System.out.println("========================");
		System.out.println("당뇨카페에 오신것을 환영합니다.");
		System.out.println("========================");

		boolean run = true;
		while (run) {
			System.out.println("1. 자유게시판 가기 ");
			System.out.println("2. 회원 관리");
			System.out.println("3. 쇼핑몰 가기");
			System.out.println("4. 종료");
			System.out.print(">>>");
			int select = scanner.nextInt();

			switch (select) {
			case 1 : //자유게시판 이동
				System.out.println("카페 페이지로 이동합니다.");
				 FreeBoardService.menu(scanner, freeBoardServices, newmemberDTO, memberDTOs);
				break;
			case 2 : //회원 관리 이동
				System.out.println("회원 관리 페이지로 이동합니다.");
				loginState = LoginService.menu2(scanner, memberDTOs, loginState, newmemberDTO);
				break;
			case 3 : //쇼핑몰 이동
				System.out.println("관리자 페이지로 이동합니다.");
			case 4 :
				System.out.println("종료합니다.");
				run = false;
				break;
			default : 
				System.out.println("1~4까지의 값을 입력하세요.");
		}//switch
		}//while close
		}//main close
	}//class
