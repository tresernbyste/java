package ex16exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex05Finally {
	
	static void runtime() throws NumberFormatException{ // throws ㅇ에러는났지만 무시하고 가
		Integer.parseInt("백");
	}
	static void tryCatchFinally() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("나이를 입력하세요");
		int age = -1;
		try {
			age = scanner.nextInt();
			System.out.println("당신은 5년후 "+(age+5) +"살입니다.");
			return;
		}
		catch(InputMismatchException e) {
			System.out.println("나이는 숫자만 쓰세요");
		}
		finally { // 예외를 잡고 항상 실행되는 구문 
			System.out.println("항상 실행되는 finally 절입니다.");
			System.exit(0);
			
		}
	}
	
	public static void main(String[] args) {
		try {
			runtime();
		}
		catch(NumberFormatException e) {
			e.printStackTrace();
		}
		tryCatchFinally();
		
		System.out.println("메인메소드 끝 "); //  쓰레기 코드 tryCatchFinally 마지막 구문에 시스템이그짓때문 
	}

}
