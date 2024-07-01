package ch04;

import java.util.Scanner;

public class ExtendedSwtichExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		answer =0;
		Scanner input = new Scanner(System.in);
		System.out.println("저는 계산기입니다.");
		System.out.println("첫번째 숫자를 입력해주세요.");
		int x= input.nextInt();
		
		System.out.println("\n1. 덧셈 2. 뺄셈 3. 곱셈 4. 나눗셈");
		int select =input.nextInt();
		
		System.out.println("두번쨰 숫자를 입력해주세요.");
		int y = input.nextInt();
		
		double answer =0;
		
		switch (select) {
		case 1 -> answer = plus(x,y);
		case 2 -> answer = minus(x,y);
		case 3 -> answer = multiply(x,y);
		case 4 -> {
			if (y==0) {
				System.out.println("0으로 나눌 수 없습니다.");
				return;
			}
			else {
				answer = divde(x,y);
			}
		}//case 4 종료
		sysout
		}//switch 종료
		
		static int plus(int x, int y) {
			return x + y;
		}
		static int minus(int x, int y) {
			return x-y;
		}
		
		
		
	}//main문 종료

}//class문 종료
