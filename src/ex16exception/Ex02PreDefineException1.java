package ex16exception;

import java.util.InputMismatchException;

public class Ex02PreDefineException1 {

	public static void main(String[] args) {
		
		
		System.out.println("### ArrayIndexOutOfMoundsException ###");
		int[] intArr = new int[2];
		try {
			intArr[0] = 100;
			System.out.println("0번방은:"+ intArr[0]);
			intArr[1]= 200;
			System.out.println("1번방은:"+ intArr[1]);
			intArr[2]= 300;
			System.out.println("앗 이번방은?:"+ intArr[2]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("예외가 발생했어요");
			System.out.println("예외메세지"+ e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("0번방의 재출력:"+ intArr[0]);
		System.out.println("### ArrayIndexOutOfBoundsException 발생후 ###");
	}

}
