package ch06.Store;

public class Member {
	//필드
	String  id;
	String pw;
	String name;
	int age;
	int phoneNum;
	String address;
	String sex;
	boolean admin = false;
	
	
	
	
	public static void tester(Member[] members) {
		// members 배열에 저장됨 1개씩 (1저장 후 2로 넘어감)
		
		Member member1 = new Member(); // 회원 저장
		member1.id = "1";
		member1.pw = "1";
		member1.name = "tester";
		member1.age = 1;
		member1.address = "1";
		member1.sex = "1";
		member1.admin = false; 
		members[0] = member1;
				
		Member member2 = new Member(); // 관리자 저장
		member1.id = "2";
		member1.pw = "2";
		member1.name = "2";
		member1.age = 2;
		member1.address = "2";
		member1.sex = "2";
		member1.admin = true;  
		members[0] = member2;
	}//tester main
	
}//class 
