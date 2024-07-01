package ch04;

import java.util.Scanner;

public class ExtendedSwitchExam {

    public static void main(String[] args) {
        // Scanner 객체를 생성하여 사용자 입력을 받음
        Scanner in = new Scanner(System.in);
        System.out.print("찾을 동물의 이름을 입력하시오. :");
        String Monster = in.next();

        // whoIsIt 메서드를 호출하여 입력한 동물의 종류를 출력
        whoIsIt(Monster);

        // whoIsItReturn 메서드를 호출하여 입력한 동물의 종류를 반환받은 후 출력
        String kind = whoIsItReturn(Monster);
        System.out.printf("%s는 %s이다. \n", Monster, kind);
    } // main 종료
    
    // 입력한 동물의 종류를 반환하는 메서드
    static String whoIsItReturn(String Monster) {
        String kind = "넌 누구냐???"; // 기본 종류 설정
        // 입력된 동물 이름에 따라 종류를 설정하는 switch 문
        switch (Monster) {
            case "호랑이", "사자", "강아지", "고양이" -> kind = "포유류";
            case "거미", "불개미", "무당벌레", "귀뚜라미" -> kind = "곤충";
            case "고등어", "연어", "새우", "오징어" -> kind = "어류";
            case "독수리", "참새", "비둘기" -> kind = "조류";
            default -> System.out.println("어이쿠~~!!!!!!!!까먹고 안넣었네");
        } // switch 종료
        return kind; // 동물의 종류 반환
    } // whoIsItReturn 종료
    
    // 입력한 동물의 종류를 출력하는 메서드
    static void whoIsIt(String Monster) {
        String kind = "넌 누구냐?"; // 기본 종류 설정

        // 입력된 동물 이름에 따라 종류를 설정하는 switch 문
        switch (Monster) {
            case "호랑이", "사자", "강아지", "고양이" -> kind = "포유류";
            case "거미", "불개미", "무당벌레", "귀뚜라미" -> kind = "곤충";
            case "고등어", "연어", "새우", "오징어" -> kind = "어류";
            case "독수리", "참새", "비둘기" -> kind = "조류";
            default -> System.out.println("어이쿠~~!!!!!!!!까먹고 안넣었네");
        } // switch 종료

        // 동물의 종류 출력
        System.out.printf("%s는 %s이다. \n", Monster, kind);
    } // whoIsIt 종료

} // class 종료
