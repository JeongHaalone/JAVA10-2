package ch02;

import java.util.Scanner;

public class CastingExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Casting 관련 create
		
		
		
		/*
		 * double doubleA = Math.PI; byte byteB = 1;
		 * 
		 * double doubleC = doubleA / byteB;
		 * 
		 * 
		 * int result = (int) (doubleA * doubleC); //강제타입 double result2 = doubleA /
		 * doubleC;
		 * 
		 * System.out.println("byteA * (doubleA / byte B)의 정수값 : " + result);
		 * System.out.printf("%.3f",result2); //소수점 3자리까지 표현
		 */
		
		
		//byte를 int로 강제타입변환을 해서 원주율을 구하는 식
		
		Scanner input = new Scanner(System.in);
	
		
		System.out.print("원의 둘레 입력하기 : ");
		int byteRound = input.nextInt();
		
		
		System.out.print("원의 지름 입력하기 : ");
		int byteLine = input.nextInt();
		
		double resultCircum = byteRound / byteLine;		//원주율 = 원의 둘레 / 원의 지름
		
		System.out.printf("원의 둘레는 %d3.2이고 원의 지름은 %d3.2이므로 원의 원주율은 %3.2f 입니다. ",byteRound, byteLine, resultCircum);
		
	}

}
