package ch05.Store;

import java.util.Scanner;

public class AdminMenu {

	public static void menu (Scanner input, ) {
		boolean run =true;

		while (run) {
			System.out.println("어떤 항목을 관리하시겠습니까?");
			System.out.println("1. 판매물품");
			System.out.println("2. 배송물품");
			System.out.println("3. 종료");
			System.out.println(">>>");
			int select = input.nextInt();
			switch (select) {
			case 1 : 
				productLists(input, lists);
				break;
			case 2 :
				sellLists(input, lists, sLists);
			case 3 : 
				run = false;
				break;
			default :
				System.out.println("1~4를 골라주세요.");
			
			}//switch exit
		}//while exit
	}// menu 매서드 exit

	private static void sellLists(Scanner input, ProductList[] lists, ShopingList[] sLists) {
		// 판매 리스트 확인
		
		
	}
}