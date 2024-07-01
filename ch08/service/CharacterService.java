package ch08.service;

import java.util.Scanner;

import ch08.lineage.Account;
import ch08.lineage.ElfDTO;
import ch08.lineage.KnightDTO;

public class CharacterService {
	// field

	// generator
	public static void menu(Scanner scanner, Account[] accounts,Account loginState,KnightDTO knightDTO,ElfDTO elfDTO) {
		System.out.println("캐릭터 선택 페이지입니다.");
		System.out.println("1. 기사 2. 요정 3. 힐러 4. 탱커 5. 종료");
		System.out.println(">>>");
		int select = scanner.nextInt();
		switch (select) {
		case 1:
			System.out.println("기사를 선택하셨습니다.");
			System.out.println(loginState.getNickname() +"님은 " + loginState.getKnightDTO().getSword() );
			
			break;
		case 2:
			System.out.println("요정을 선택하셨습니다.");
			break;
		case 3:
			System.out.println("힐러를 선택하셨습니다.");
			break;
		case 4:
			System.out.println("탱커를 선택하셨습니다.");
			break;
		case 5:
			System.out.println("메인메뉴로 돌아가시겠습니다.");
			break;
		default:
			System.out.println("1~4 를 선택해주십시오.");
			break;
		}
	}
	// method

}
