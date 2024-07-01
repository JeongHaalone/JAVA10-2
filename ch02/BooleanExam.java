package ch02;

public class BooleanExam {

	public static void main(String[] args) {
		// 불리언 자료형은 참, 거짓 값이다.
		
		boolean t = true ;
		boolean f = false ;
		
		System.out.println(t);
		System.out.println(f);
		
		if(t) {
			System.out.println("if문은 참값이다.");
		}
		
		else {
			System.out.println("else는 거짓값이다.");
		}
	
		
		if(f) {
			System.out.println("if는 참값이므로 이 값을 표시하지 않음");
		}
		else {
			System.out.println("else는 거짓값이므로 이값을 표시함");
		}
	}
}

