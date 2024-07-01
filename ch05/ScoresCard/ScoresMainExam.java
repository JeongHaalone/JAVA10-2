package ch05.ScoresCard;

import java.util.Scanner;

public class ScoresMainExam {

	// 필드 -> 맴버 변수로 main에서 사용할 배열이나 객체 등을 생성함

	private static Scanner input = new Scanner(System.in);
	private static Student[] st = new Student[5];
	// String [] string = new String[5];

	// 매서드
	public static void main(String[] args) {
		// 주실행 class로 메뉴와 class.method 호출용으로 작업
		// 객체 : 학생, 성적, 통계....
		boolean run = true;

		while (run) {// 종료 run = false;
			System.out.println("===========학생 관리 프로그램 v2(객체)=============");
			System.out.println("1. 학생관리 2. 성적 입력 3. 통계 4. 종료");
			System.out.println("==============================");
			System.out.println(">>>");
			int select = input.nextInt();
			switch (select) {
			case 1:
				System.out.println("학생 관리 클래스로 진입합니다.");
				boolean stRun = true;
				while (stRun) {
					System.out.println("1. 학생 등록 2. 학생 보기 3. 학생 수정 4. 학생 삭제 5. 메인 메뉴로 복귀 ");
					System.out.println(">>>");
					int stSelect = input.nextInt();
					switch (stSelect) {
					case 1:
						System.out.println("학생 등록 메뉴입니다.");
						Student regStudent = new Student(); // 객체 생성
						System.out.println("이름 : ");
						regStudent.name = input.next();
						System.out.println("학번 : ");
						regStudent.number = input.nextInt();
						System.out.println("성별 : ");
						regStudent.sex = input.next();
						System.out.println("학년 : ");
						regStudent.grade = input.nextInt();
						System.out.println("반 : ");
						regStudent.classroom = input.nextInt();
						System.out.println("=========객체 생성 완료=======");
						System.out.println("======배열 빈칸을 찾아 저장========");
						for (int i = 0; i < st.length; i++) {
							if (st[i] == null) {
								st[i] = regStudent; // 위에 만든 객체를 집어넣눈다.
								System.out.println("저장 성공!!");
								break; // 저장 후 종료
							} // if regStudent에 빈칸이 있는 곳에 입력한 객체를 넣기 종료
						} // for st배열 빈칸 찾아 반복 종료
						break; // 학생 등록용 정지
					case 2:
						System.out.println("전체 학생 보기");
						for (int i = 0; i < st.length; i++) {
							if (st[i] != null) {// st배열 칸이 빈칸이 null아니면
								System.out.println("----------------------");
								System.out.println("이름 : " + st[i].name);
								System.out.println("학번 : " + st[i].number);
								System.out.println("성별 : " + st[i].sex);
							} // if 배열 출력 종료
						} // for st배열 전체 반복
						break;
					case 3:
						System.out.println("수정할 학생 명을 입력하세요. : ");
						System.out.println(">>>");
						String searchName = input.next(); // searchName 입력값을
						Student findstudent = find(searchName); // 아래 만든 find 매서드의 student 객체를 찾아옴.
						if (findstudent == null) {
							System.out.println("찾은 학생이 없습니다.");
						} else {
							System.out.println("수정할 학생 번호를 입력하세요. : ");
							findstudent.number = input.nextInt(); // 학생의 학번 정보를 수정함
							System.out.println("학생 정보 수정 완료");

						}
						break;
					case 4:
						System.out.println("삭제할 학생명을 입력하세요.  :");
						System.out.println(">>>");
						String deleteName = input.next();
						if (deleteName == null) {
							System.out.println("삭제할 학생이 없습니다.");
						} else { // 삭제할 학생이 있으면 
							for (int i = 0; i <st.length ; i++) { // 삭제할 학생 대조위해 반복
								if (st[i].name.equals(deleteName)) { // 대조중
									st[i] = null; // 이름과 삭제 (입력한)한 이름 같다면 ->빈칸 처리 = 삭제
									System.out.println("삭제 완료");
									}//if 학생이름 대조 종료
								break; // 삭제될 이름 수정 후 break 
							}//for 학생 이름 반복 대조 종료
						}//else 종료 (삭제할 학생의 경우)
						break;// // 학생 수정용 정지
						
					case 5 : 
						System.out.println("메인메뉴로 복귀합니다.");
						stRun = false;
						break;
						
					default :
						System.out.println("1에서 5까지의 값을 입력해주세요.");
						
					} // switch 학생 관리 메뉴 종료

				} // while 학생 관리 메뉴 종료
			case 2 :
				System.out.println("성적 관리 클래스로 진입합니다.");
				break;
				
			case 3 : 
				System.out.println("통계 관리 클래스로 진입합니다.");
				
			case 4 :
				System.out.println("학생 관리 프로그램을 종료합니다.");
				run = false ;
				break;
				
			default :
				System.out.println("1~4번 값만 입력하세요!");
				//작성하면 꺼짐 (no break)
				
			}// switch 학생 관리 전체 프로그램 종료

		} // while 학생 관리 종료

	}// main 종료

	private static Student find(String name) {
		// 이름으로 객체를 찾아오는 매서드 -> 리턴은 Student
		Student student = null;
		for (int i = 0; i < st.length; i++) {
			if (st[i] != null) { // 학생 배열의 칸이 빈칸이 아니면
				String arrayName = st[i].name; // heap 객체에 있는 이름을 arrayName에 가져옴
				if (arrayName.equals(name)) // 배열이름과 키보드 이름이 동등하면
					student = st[i]; // 찾은 객체를 빈객체(student)에 넣는다.
				break;
			} // if student값에 객체 넣기 종료
		} // for if문 반복 종료
		return student; // return 객체 생성
	}// find 매서드 종료

}// class 종료
