package ch05.ScoresCard;

import java.util.Scanner;

public class TeacherMainExam {
	// 종속성이 아닌 별개로 등록되는 필드
	// 필드 -> 맴버 변수로 main에서 사용할 배열이나 객체 등을 생성함
	private static Scanner input = new Scanner(System.in);
	private static Teacher[] tch = new Teacher[5]; // Teacher 배열엔 5명이 들어갈 수 잇다.
	// tch가 Teacher 클래스의 객체 배열

	public static void mian(String[] args) { // ★★★★★★★ String[] args는 문자열 배열 -> 프로그램이 실행될 때 명령 줄에서 전달된 인수들을 담음
		// args 배열은 ["arg1", "arg2", "arg3"]와 같은 값을 가지게 됨

		boolean tchrun = true; // 프로그램 실행하는 동안 true

		while (tchrun) {
			System.out.println("==============================");
			System.out.println(" 선생님 관리 프로그램 v2에 오신것을 환영합니다.");
			System.out.println("===============================================");
			System.out.println("메뉴를 선택해주세요.");
			System.out.println("1. 선생님 관리 2. 선생님 실적 관리 3. 선생님 인트라넷 로그인? 4. 종료");
			System.out.println(">>>");

			int selectAll = input.nextInt();
			switch (selectAll) {
			case 1:
				System.out.println("1. 선생님 정보 등록 2. 선생님 정보 조회 3. 선생님 정보 수정 4. 선생님 정보 삭제 5. 종료 ");
				System.out.println(">>>");
				int select = input.nextInt();
				switch (select) {
				case 1:
					System.out.println("선생님의 정보를 등록하세요.");
					Teacher regTeacher = new Teacher(); // regTeacher 객체 생성
					System.out.println("이름 : ");
					regTeacher.name = input.next();
					System.out.println("몇 학년 담당 : ");
					regTeacher.gradeCharge = input.nextInt();
					System.out.println("몇 반 담당 : ");
					regTeacher.classNum = input.nextInt();
					System.out.println("무슨 과목을 담당 : ");
					regTeacher.subject = input.next();
					System.out.println("선생님의 직급  : "); // 수석교사, 보직교사, 교사, 특수교사, 전문상담교사, 사서교사
					regTeacher.teahcerRank = input.next();
					System.out.println("================객체 생성 완료================");
					System.out.println("============배열 빈칸을 찾아 저장============");
					for (int i = 0; i < tch.length; i++) {
						if (tch[i] == null) { // 빈칸에만 대입이 가능
							tch[i] = regTeacher; // tch[i] 배열에 위에 객체를 대입함★★★★★★★
							System.out.println("저장 성공!"); // 저장이 되었다고 출력함
							break;
						} // if 빈칸 배열표에 regTeacher 입력값 대입 완료
					} // for 입력값 대입 위한 반복문 종료

				case 2:
					System.out.println("전체선생님의 정보를 조회합니다.");
					for (int i = 0; i < tch.length; i++) { // tch 배열의 모든 요소를 순회
						if (tch[i] != null) { // 배열 요소가 null이 아닌 경우에만 정보를 출력
							System.out.println("---------------------");
							System.out.println("선생님 이름 : " + tch[i].name);
							System.out.println("선생님 담당 학년 : " + tch[i].gradeCharge);
							System.out.println("선생님 담당 반 : " + tch[i].classNum);
							System.out.println("선생님 담당 과목 : " + tch[i].subject);
							System.out.println("선생님의 직급 : " + tch[i].teahcerRank);
							System.out.println("---------------------");
						} // 조회 결과 출력하는 if 종료
					} // 조회를 위한 for 매서드 종료
					break;

				case 3:
					System.out.println("수정할 선생님 성함을 입력하세요. : ");
					System.out.println(">>>");
					String searchName = input.next(); // searchName (찾아올 이름) 입력값을 받는다.
					Teacher findTeacher = find(searchName); // find 매서드에서 가져온 teacher 객체를 찾아옴.★★★★★★★
					// find 메서드가 Teacher 객체를 반환하기 때문에 findTeacher 변수에 Teacher 객체를 할당할 수 있다.
					if (findTeacher == null) {// findTeacher 변수가 null인지 확인하여 Teacher객체 존재 확인 가능.
						System.out.println("찾은 학생이 없습니다.");
					} else {//findTeacher 변수가 null이 아닐 경우 Teacher 객체의 name객체에 저장된 name을 수정하려고함.
						System.out.println("수정할 선생님의 이름을 입력하세요. : ");
						findTeacher.name = input.next();
						System.out.println("선생님 정보 수정완료");
					}//else에서 tch[i].name 객체를 수정하여 배열에 대입 완료
					break;

				case 4:
					System.out.println("삭제할 선생님 성함을 입력하세요. : ");
					System.out.println(">>>");
					String deleteName = input.next(); // deleteName (삭제할 이름) 입력값을 받는다.
					// Teacher deleteTeacher = find (searchName); >> 이미 입력된 값을 삭제하는 것이기에 안해도됨
					if (deleteName == null) {
						System.out.println("삭제할 값이 없습니다.");
					} else {
						for (int i = 0; i < tch.length; i++) {
							if (tch[i].equals(deleteName)) {
								tch[i] = null;
								System.out.println("삭제 완료");
							} // 이름 대조후 삭제한 if 매서드 종료
							break; // 삭제한 후 break 필요
						} // 삭제할 이름 for 매서드 돌림 끝
					} // else 종료 (삭제문)
					break;

				case 5:
					System.out.println("메인메뉴로 복귀합니다.");
					tchrun = false;
					break;
				}// 선생님 관리 switch 종료

			case 2:
				System.out.println("선생님 실적 관리 클래스로 진입합니다.");
				System.out.println("1. 수업 일수 관리 2. 수업 진도 관리 3. 메인 메뉴로 이동");
				Teacher lessonDay = new Teacher(); 
				if ()
				
			case 3:
				System.out.println("선생님 인트라넷에 진입합니다.");
				System.out.println("1. 학생 성적 관리 2. 이메일 관리 3. 선생님 커뮤니티 관리 4. 메인 메뉴로 이동");
				boolean tchLogin =  true;
				
				

			case 4:
				System.out.println("시스템을 종료합니다.");
				tchrun = false;
				break;

			default:
				System.out.println("1~5번 값만 입력하세요!");
				// 작성하면 꺼짐 (break x)
			}// switch 전체 종료
		} // while 전체 메뉴 반복 종료
	}// main 매서드 종료

	private static Teacher find(String name) { // name은은 String 객체 참조 : name 필드 Teacher에 접근.
		// 이름으로 객체를 찾아오는 매서드 -> name을 참조하고 teacher를 리턴(내보냄)
		// find 메서드가 호출되었을 때 Teacher 객체를 반환한다는 것을 의미
		Teacher teacher = null; // teacher 변수의 배열이 빈칸이다.
		for (int i = 0; i < tch.length; i++) {
			if (tch[i] != null) { // 학생의 배열의 칸이 빈칸이 아니면
				String arrayName = tch[i].name; // arrayName(새로운 변수)에 각각의 선생님 이름 (객체)이 들어옴.
				if (arrayName.equals(name)) { // arrayName은 tch 배열 i 번째와 비교 (같은지)
					teacher = tch[i]; // tch[i]는 Teacher의 객체를 가리킴(tch 배열의 i번째 요소는 Teacher 객체
				}
			} // tch 배열 if 종료
		} // tch 배열 for 종료

		return teacher; // return 객체 생성
	} // find 매서드 종료
}// class 종료
