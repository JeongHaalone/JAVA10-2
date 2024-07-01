package ch04;

import java.util.Scanner;

public class CalculatorExam {
    // 계산기를 만드는 시트

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("첫 번째로 더할 숫자를 입력하세요: ");
        int x = input.nextInt();

        System.out.println("두 번째로 더할 숫자를 입력하세요: ");
        int y = input.nextInt();

        System.out.println("1. 더하기  2. 빼기  3. 곱하기  4. 나누기");
        System.out.print("연산자 선택: ");
        int operator = input.nextInt();

        int result = 0;

        switch (operator) {
            case 1:
                result = mu(x, y);
                System.out.printf("%d와 %d를 더한 값은 %d입니다.\n", x, y, result);
                break;
            case 2:
                result = mi(x, y);
                System.out.printf("%d에서 %d를 뺀 값은 %d입니다.\n", x, y, result);
                break;
            case 3:
                result = doubleNum(x, y);
                System.out.printf("%d와 %d를 곱한 값은 %d입니다.\n", x, y, result);
                break;
            case 4:
                if (y != 0) {
                    result = share(x, y);
                    System.out.printf("%d를 %d로 나눈 값은 %d입니다.\n", x, y, result);
                } else {
                    System.out.println("0으로 나눌 수 없습니다.");//나누는 값이 0일 경우 오류
                }
                break;
            default:
                System.out.println("잘못된 연산자 선택입니다.");
        }

        input.close();
    }//main 종료

    public static int mu(int x, int y) {
        return x + y;
    }

    public static int mi(int x, int y) {
        return x - y;
    }

    public static int doubleNum(int x, int y) {
        return x * y;
    }

    public static int share(int x, int y) {
        return x / y;
    }
}//class 종료