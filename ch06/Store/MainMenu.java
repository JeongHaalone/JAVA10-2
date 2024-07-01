package ch06.Store;

import java.util.Scanner;

public class MainMenu {

	public static Scanner input = new Scanner(System.in);
	public static Member[] members = new Member[100];
	public static LoginStatus[] login = new LoginStatus[1];
	public static ProductList[] lists = new ProductList[100];
	public static ShopingList[] sLists = new ShopingList[100];
	public static Review[] reviews = new Review[1000];
	
	public static void main(String[] args) {
		Member.tester(members);
		ProductList.tester(lists);
		Review.tester(reviews);
		ShopingList.tester(sLists);
		
		System.out.println("=========MBC 청과 판매점=========");
		System.out.println("판매시스템에 오신 것을 환영합니다.");
		Member member = new Member();
		LoginStatus login = new LoginStatus();
	}
}
