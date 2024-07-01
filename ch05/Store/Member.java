package ch05.Store;

import java.util.Scanner;

public class Member {
	// 필드
	String id;
	String pw;
	String name;
	int age;
	int phoneNum;
	String address;
	String sex;
	boolean admin = false;

	// 매서드
	public LoginStatus menu(Scanner input, Member[] members, LoginStatus 1St) {
		boolean run = true;
		while (run) {
			System.out.println("===================");
			System.out.println("아래 항목에서 선택해주세요.");
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 가입정보찾기");
			System.out.println("4. 종료하기");
			System.out.println(">>>");
			int login = input.nextInt();
			
			switch (login) {
			case 1 :
				Member loginMember = new Member(); // 임시 빈 배열 하나 생성
				System.out.println("ID : " );
				loginMemeber.id = input.next();
				System.out.println("PW : ");
				loginMember.pw = input.next();
				loginMember = login(input, members, loginMember, run);
				loginStatus(loginMember, 1St);
				if(1St.name!=null) {
					run = false;
				}
				break;
				
			case 2:
				System.out.println("회원가입을 실행합니다.");
				Member newMember = register(input);
				for (int i = 0 ; i < members.length ; i++) 
				
			}// switch
		}//while
	}// menu exit
	
	
	

	private static Member login(Scanner input, Member[] members, Member loginMember, boolean run) {
		// 로그인
		for (int i = 0; i < members.length; i++) {
			if (members[i] != null) {
				if (members[i].id.equals(loginMember.id) && members[i].pw.equals(loginMember.pw)) {
					loginMember = members[i]; 
					break;
				} // id, pw 대조 if
				else {
					System.out.println("회원 정보가 없습니다.");
					System.out.println("아이디, 패스워드를 확인해주세요.");
					break;
				}
			} // 빈칸 아닌 대조 if
		} // for exit
		return loginMember;
	}// Member login 매서드 exit

	public static void tester(Member[] members) {

		Member member1 = new Member();
		member1.id = "1";
		member1.pw = "1";
		member1.name = "tester";
		member1.age = 1;
		member1.phoneNum =1 ;
		member1.address = "1";
		member1.sex = "1"
		member1.admin = false;
		members[0] = member1 ;
		
		Member member2 = new Member ();
		member2.id ="2";
		member2.pw ="2";
		member2.name ="2";
		member2.age ="2";
		member2.phoneNum="2";
		member2.address ="2";
		member2.sex ="2";
		member2.admin ="true";
		members[1] = member2;
		

	}// menu close
}// class exit
