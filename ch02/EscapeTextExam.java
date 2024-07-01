package ch02;

public class EscapeTextExam {

	public static void main(String[] args) {
		// 이스케이프 시퀀스는 백슬리시(\) 뒤에 문자 또는 숫자를 조합한 것으로, 키보드가 표현하지 어려운 이스케이프 문자를 나타냄
		
		System.out.println("Java\nProgram");// \n은 줄 바꿈을 표현
		System.out.println("Java\bProgram");// \b는 백스페이스을 표현
		System.out.println("Java\tProgram");// \t는 줄 바꿈을 표현
		System.out.println("Java\rProgram");// \r은 캐리지 리턴을 표현
		
		
		

	}

}
