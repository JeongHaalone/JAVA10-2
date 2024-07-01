package ch04;

import java.util.Scanner;

public class ArrayExample {
   // 학생 이름 테이블 -> String[]
   // 점수 테이블 -> byte[] (점수 작으니까)
   // 총점 테이블 -> int[]
   // 평균 테이블 -> double[]

   public static void main(String[] args) {
      // 주메뉴 구현용
      Scanner mainSC = new Scanner(System.in);
      System.out.println("초기작업 : 학생 수를 입력하세요.");
      int count = mainSC.nextInt(); // 학생 수 등록 완료
      String[] name = new String[count];
      byte[] engScores = new byte[count];
      byte[] korScores = new byte[count];
      int[] totalScores = new int[count];
      double[] avgScores = new double[count];

      boolean run = true;
      while (run) {

         System.out.println("\n==========MBC교육센터 성적관리 프로그램==========");
         System.out.println(" 1.학생관리 | 2.성적관리 | 3.통계 | 4.종료 ");
         System.out.println("=========================================");
         System.out.print(">>>");

         int select = mainSC.nextInt(); // 1~4까지 정수 입력 후에 분기

         switch (select) {
         case 1:
            System.out.println("학생관리 메서드로 진입합니다.");
            student(name); // 이렇게 써도 위에 행렬처리 해놔서 행렬로 인식함
            break;
         case 2:
            System.out.println("성적관리 메서드로 진입합니다.");
            scores(engScores, korScores, name);
            break;
         case 3:
            System.out.println("통계관리 메서드로 진입합니다.");
            statistics(engScores, korScores, name);
            break;
         case 4:
            System.out.println("종료 합니다.");
            run = false;
            break;

         } // 주메뉴 스위치 종료
      } // 와일 종료
   } // 메인 종료

   private static void statistics(byte[] engScores, byte[] korScores, String[] name) {
      int totalEngScores = 0; // 영어 총점 기본값
      double evgEngScores = 0; // 영어 평균 기본값
      int totalKorScores = 0;
      double evgKorScores = 0;

      System.out.println("학생 점수 통계입니다.\n");
      for (int i = 0; i < engScores.length; i++) {
         totalEngScores += engScores[i];
      }
      System.out.println("학생 전체 영어 점수 총합 : " + totalEngScores); // 영어 총점

      for (int i = 0; i < korScores.length; i++) {
         totalKorScores += korScores[i];
      }
      System.out.println("학생 전체 국어 점수 총합 : " + totalKorScores); // 국어 총점

      evgEngScores = totalEngScores / engScores.length;
      System.out.println("학생 영어 점수 평균 : " + evgEngScores); // 영어 평균

      evgKorScores = totalKorScores / korScores.length;
      System.out.println("학생 국어 점수 평균 : " + evgKorScores); // 국어 평균

   }

   public static void scores(byte[] engScores, byte[] korScores, String[] name) {
      // 성적 관리용 crud

      Scanner studentSC = new Scanner(System.in);
      boolean run = true;
      while (run) {

         System.out.println("\n================== 성적 관리 메뉴 ==================");
         System.out.println("1. 점수입력 | 2. 보기 | 3. 점수변경 | 4. 삭제 | 5. 나가기");
         System.out.println("================================================");
         System.out.print(">>>");

         int select = studentSC.nextInt();
         switch (select) {
         case 1:
            System.out.println("점수를 기입할 과목을 입력해줒세요.");
            System.out.println("1.영어 | 2.국어");
            System.out.print(">>>");
            int subject = studentSC.nextInt();
            switch (subject) {
            case 1:
               System.out.println("영어 점수를 입력합니다.");
               System.out.println("총" + name.length + "명의 점수를 입력합니다.");
               for (int i = 0; i < (name.length); i++) {
                  System.out.println((i + 1) + "번 학생의 영어 점수를 등록하세요.");
                  engScores[i] = studentSC.nextByte();
               }
               System.out.println("영어 점수 등록 완료");
               break;
            case 2:
               System.out.println("국어 점수를 입력합니다.");
               System.out.println("총" + name.length + "명의 점수를 입력합니다.");
               for (int i = 0; i < (name.length); i++) {
                  System.out.println((i + 1) + "번 학생의 국어 점수를 등록하세요.");
                  korScores[i] = studentSC.nextByte();
               }
               System.out.println("국어 점수 등록 완료");
               break;
            default:
               System.out.println("입력값 오류 : 1~2사이의 번호를 입력해주세요.");
            } // 점수 입력 스위치 종료
            break;
         case 2:
            System.out.println("\n학생 점수 리스트 출력\n");
            for (int i = 0; i < name.length; i++) {
               System.out.println((i + 1) + "번 학생 : " + name[i]);
               System.out.println("[영어 : " + engScores[i] + "점]");
               System.out.println("[국어 : " + korScores[i] + "점]\n");
            }
            break;
         case 3:
            System.out.println("점수 변경 메뉴입니다.");
            System.out.println("점수를 변경할 학생 번호를 입력해주세요.");
            int nameNum = studentSC.nextInt();
            System.out.println("변경할 영어 점수를 입력해주세요.");
            byte engScoresMOD = studentSC.nextByte();
            System.out.println("변경할 국어 점수를 입력해주세요.");
            byte korScoresMOD = studentSC.nextByte();
            engScores[nameNum - 1] = engScoresMOD;
            korScores[nameNum - 1] = korScoresMOD;
            System.out.println("수정 완료");
            break;
         case 4:
            System.out.println("삭제할 학생 번호를 입력하세요");
            int deleteNum = studentSC.nextInt();
            engScores[deleteNum - 1] = 0;
            korScores[deleteNum - 1] = 0;
            break;
         case 5:
            System.out.println("메인 메뉴로 돌아갑니다.");
            run = false;
            break;

         } // 스위치 종료

      } // while 종료

   } // scores 메서드 종료

   public static String[] student(String[] name) {
      // 학생 관리용 crud
      Scanner studentSC = new Scanner(System.in);

      boolean run = true; // while 반복문 전용
      while (run) {

         System.out.println("=============== 학생 관리 메뉴 ===============");
         System.out.println("1. 등록 | 2. 보기 | 3. 수정 | 4. 삭제 | 5.나가기");
         System.out.println("==========================================");
         System.out.print(">>>");

         int select = studentSC.nextInt();
         switch (select) {
         case 1:
            System.out.println("학생 등록을 시작합니다.");
            System.out.println("총 학생수는 : " + name.length);
            for (int i = 0; i < (name.length); i++) { // 학생 이름 반복문 <=아님 <임
               System.out.println((i + 1) + "번 학생 이름을 등록하세요."); // 0번부터 시작하니까 +1
               name[i] = studentSC.next(); // 키보드 문자로 받은 값을 배열 i에 넣는다.
            }
            System.out.println("학생 등록 완료");
            break;
         case 2:
            System.out.println("학생 리스트 출력");
            for (int i = 0; i < name.length; i++) {
               System.out.println((i + 1) + "번 :" + name[i]); // 화면에 보여줄건 +1해주고 실제론 걍 i부터 돌림
            }
            break;
         case 3:
            System.out.println("학생 이름 수정");
            System.out.println("수정할 학생 번호를 입력하세요 : ");
            int nameNum = studentSC.nextInt();
            System.out.println("수정할 학생 이름을 입력하세요.");
            String nameMOD = studentSC.next();
            name[nameNum - 1] = nameMOD; // name배열에 입력한 번호 인덱스 학생이름을 nameMOD 로 변경. 인덱스 번호는 0부터니까 -1처리함
            System.out.println("수정 완료");
            break;
         case 4:
            System.out.println("삭제할 학생 번호를 입력하세요");
            int deleteNum = studentSC.nextInt();
            name[deleteNum - 1] = null;
            break;
         case 5:
            System.out.println("메인 메뉴로 돌아갑니다.");
            run = false;
            break;

         default:
            System.out.println("입력값 오류 : 1~5번만 입력하세요.");

         } // 학생관리 스위치 종료

      } // 와일종료. 완성해서 리턴(돌려보내주기)전까지 반복

      return name;

   } // student메서드 종료

} // 클래스 종료
