package ex16exception;

import java.io.IOException;

public class Ex03ExceptionCase2 {
	static void compileFunc() {

		try { // 에러나는 즉시 처리
			System.out.println("하나의 문자를 입력하세요");
			int userChr = System.in.read();
			System.out.println("입력한 문자는 : " +  (char)userChr);

		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		compileFunc();
}
}