package ex16exception;

import java.util.Scanner;

class AgeErrorException2 extends Exception{
	public AgeErrorException2() {
		super("나이 입력이 잘못 되었어요");
	}
}

public class Ex06DeveloperDefine2 {
	public static void main(String[] args) {
		
		System.out.println("나이를 입력하세요 : ");
		int age = readAge();
		System.out.println("당신의 나이는 "+ age+"입니다.");
		
	}

		
		
	
	
	





	public static int readAge(){
		Scanner scanner = new Scanner(System.in);
		int inputAge = 0;
		// 문자 입력시 발생되는 예외 처리를 여기서 할수 있다.
		try {
			inputAge = scanner.nextInt();
		}
		catch(InterruptedException e) { //  문자로잘못입력
			e.printStackTrace();
			System.exit(0);
			
		}
		// 나이를 음수로 입력한 경우 예외처리(개발자 정의)
		
		try {
		if(inputAge<0) {
			// 예외객체가 개발자에 의해 던져지면 해당 위치에서 즉시 예외 처리한다.
			AgeErrorException2 ex = new AgeErrorException2();
			throw ex;
		}
		}
		
		catch(AgeErrorException2 e) {
		System.out.println(e.getMessage());
			return inputAge;
	}
	}
}


