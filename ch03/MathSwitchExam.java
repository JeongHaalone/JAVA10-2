package ch03;

import java.util.Scanner;

public class MathSwitchExam {

	public static void main(String[] args) {
		// Math함수와 Switch문이 들어간 예제를 만들어보자
	
		
		//갑자기 까먹은 느낌이다.
		//int a =	(int)(Math.random()*100)+1 ; //100까지 랜덤한 숫자
		Scanner star1 = new Scanner(System.in);
		System.out.println("얼마만큼의 별을 보고 싶은지 입력하시오.");
		int len = star1.nextInt();
		
		for(int a=0; a <=100 ; a++)
		{
			
			System.out.print("*");
	}

}
}