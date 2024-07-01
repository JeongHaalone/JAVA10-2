package ch05.Store;

import java.util.Scanner;


public class Mainmenu {

	public static Scanner input = new Scanner(System.in);
	public static Members[] members = new Member[100]; // 회원수 100명의 테이블 생성
	public static LoginStatus[] 1St = new LoginStatus[1]; // 사용자의 로그인 정보 저장하는 클래스
	public static ProductList[] lists = new ProductList[100];
	public static ShoppingList[] sLists = new ShopingList[100];
	public static Review [] reviews = new Review [1000];
	
	public static void main(String[] args) {
		Member.tester(Members);
		ProductList.tester(lists);
		Review.tester(reviews);
		ShopingList.tester(sLists);
		
		System.out.println("=========MBC 청과 판매점=========");
		System.out.println("판매시스템에 오신 것을 환영합니다.");
		Member member = new Member();
		LoginStatus 1St = new LoginStatus();
		1St = member.menu(input, members, 1St);
		
		if(1St.id !=null) {
			if(1St.admin == true) {
				System.out.println("관리자 모드로 접속합니다.");
				AdminMenu.
			}
		}
		
		
		
	}
	
	
}
