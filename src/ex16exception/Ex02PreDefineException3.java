package ex16exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex02PreDefineException3 {

	public static void main(String[] args) {
		System.out.println("### InputMismatchException ###");
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("나이를 입력하세요");
			int intAge = scanner.nextInt(); // 예외가 발생할수 있는 지역
			int ageAfter10 = intAge + 10;  // 예외 발생시 실행 x
			System.out.println("당신의 10년후 나이는 " + ageAfter10);
		} catch (InputMismatchException e) { // 예외 발생시 실행
			System.out.println("나이를 문자형태로 입력하면 앙데요");
			System.out.println("예외메세지 :" + e.getMessage());
			e.printStackTrace();
		}
	}
}
