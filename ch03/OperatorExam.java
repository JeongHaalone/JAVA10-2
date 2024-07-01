package ch03;

public class OperatorExam {

	public static void main(String[] args) {
		// 할당 연산자를 이용하여 정수 연산하기
		
		int a = 10;
		int b = 20;
		int c;
		System.out.println(c = a); // a = c =10
		System.out.println(b += a); // b = b + a = 20 + 10 = 30
		System.out.println(b -= a); // b = b -a = 30 - 10 = 20
		System.out.println(b *= a); // b = b * a = 200
		System.out.println(b /=a); // b = b / a = 20
		System.out.println(b %=a); // b = b / a의 나머지값 = 0

	}

}
