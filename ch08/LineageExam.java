package ch08;

import java.util.Scanner;

import ch08.lineage.Account;
import ch08.lineage.ElfDTO;
import ch08.lineage.HumanDTO;
import ch08.lineage.KnightDTO;
import ch08.service.LoginService;

public class LineageExam {

	public static Scanner scanner = new Scanner(System.in);
	public static Account[] accounts = new Account[10];
	public static Account loginState;
	public static KnightDTO knightDTO = new KnightDTO();
	public static ElfDTO elfDTO = new ElfDTO();
	
	//생성자
	static {
		knightDTO.setSword("툴레사이트 검");
		knightDTO.setAmor("대리석 갑옷");
		knightDTO.setShield("버팔로 방패");
		knightDTO.setName("윌로우");
		knightDTO.setLevel(1);
		knightDTO.setHp(2000);
		knightDTO.setMp(5);
		knightDTO.setMoney(100000);
		
		elfDTO.setBow("양손활");
		elfDTO.setDress("괴물옷");
		elfDTO.setArrow("새깃털 화살");
		elfDTO.setLevel(1);
		elfDTO.setHp(3000);
		elfDTO.setMp(6);
		elfDTO.setMoney(100000);
		
		Account accounts = new Account();
		//test용
		accounts.setId("kkkk");
		accounts.setPw("kkkk");
		accounts.setServer("sky");
	}
	
	public static void main(String[] args) {
		// 메인메뉴
		System.out.println("===welcome===");
		System.out.println("Lineage the legend");
		boolean run = true;
		while (run) {
			System.out.println("1. 로그인 2. 캐릭터 선택 3. 게임 실행 4. 종료");
			int select =scanner.nextInt();
			switch (select) {
			case 1 :
				System.out.println("로그인 페이지입니다.");
				loginState = LoginService.menu(scanner, accounts, loginState);
				break;
			case 2 :
				System.out.println("캐릭터를 선택하겠습니다.");
				
				break;
			case 3 :
				System.out.println("게임을 실행하겠습니다.");
				break;
			case 4 :
				System.out.println("종료하겠습니다.");
				break;
			default :
				System.out.println("1~4값을 입력하세요.");
				break;
			}//switch close
		}//while close
	}//main close
}//class close
