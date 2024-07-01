package ch02;

import java.util.Scanner;

public class Promotion {

	public static void main(String[] args) {
		// Promotion연습 BMI데이터 활용
		
		String name;
		double weight = 0.0;
		double height = 0.0;
		double bmi =0.0;
		String result = null;
		
		//변수 및 입력 선언
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요 : ");
		name = sc.next();
		
		System.out.print("몸무게 : " ); 
		weight = sc.nextDouble();
		
		System.out.print("키를 입력하세요 : " ); 
		height = sc.nextDouble();
	
	
		
		bmi = weight /(height*height/10000);
		
				
		//조건 설정
	
		if (bmi >= 30) {
			result = "고도비만";
		}else if(bmi >= 25) {
			result = "비만";
		}else if(23.98 <= bmi && bmi < 25) {
			result = "과체중";
		} else if (17.96 <= bmi && bmi < 23.98) {
			result = "정상";
		} else if (bmi < 17.96) {
			result = "저체중";
		}
		
		System.out.println(""+name+"님의 몸무게는 "+weight+",키는 "+height+"입니다.");
		System.out.println(""+name+"님의 BMI지수는 "+bmi+"이므로 "+result+"입니다.");
		
	}

}
