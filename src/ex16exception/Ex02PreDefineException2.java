package ex16exception;

import java.util.Scanner;

public class Ex02PreDefineException2 {
	
	public static void main(String[] args) {
		 System.out.println("### NumberFormatException ###");
		 Scanner scanner = new Scanner(System.in);
		 try {
			 System.out.println("나이를 입력하세요");
			 String strAge = scanner.nextLine();
			 int ageAfter10 = Integer.parseInt(strAge)+ 10;
			 System.out.println("당신의 10년후 나이는 "+ ageAfter10);
		 }
		 catch(NumberFormatException e) {
			 System.out.println("나이는 숫자로만 입력해야합니다.");
			 System.out.println("예외메세지 :"+ e.getMessage());
			 e.printStackTrace();
		 }
	}

}
