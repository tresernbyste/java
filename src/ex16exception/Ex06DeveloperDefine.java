package ex16exception;

import java.util.InputMismatchException;
import java.util.Scanner;

class AgeErrorException extends Exception{
	public AgeErrorException() {
		super("나이 입력이 잘못 되었어요");
	}
}

public class Ex06DeveloperDefine {
	public static void main(String[] args) {
		
		System.out.println("나이를 입력하세요 : ");
		try {
			int age = readAge();
			System.out.println("당신의 나이는 "+ age+"입니다.");
		}
		catch(AgeErrorException e) { //  나이를 음수로
			System.out.println("[예외발생]"+ e.getMessage());
		}
	}
	
	public static int readAge() throws AgeErrorException{
		Scanner scanner = new Scanner(System.in);
		int inputAge = 0;
		try {
			inputAge = scanner.nextInt();
		}
		catch(InputMismatchException e) { //  문자로잘못입력
			e.printStackTrace();
			System.exit(0);
			
		}
		if(inputAge<0) {
			AgeErrorException ex = new AgeErrorException();
			throw ex;
		}
		return inputAge;
	}
}
