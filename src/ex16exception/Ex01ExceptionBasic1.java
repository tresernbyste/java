package ex16exception;

import java.io.IOException;

public class Ex01ExceptionBasic1 {

	public static void main(String[] args) {
//		Int number = 10;
//		if(true);  세미클론  ㄴ
//		{}
//		else {}
//		
//		
		int number = 10;
		if (true) {
			System.out.println("참이다");

		} else {
			System.out.println("거짓이다.");
		}

		System.out.println("문자하나를 입력하세요");
		try {
			int iChar = System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
