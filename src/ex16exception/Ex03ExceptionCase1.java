// 예외방법1 : 예외를 모두 무시하고 메인메서드 무시 
// "예외 던지기"

package ex16exception;

import java.io.IOException;

public class Ex03ExceptionCase1 {
	
	static void compileFunc() throws IOException{
		
		System.out.println("하나의 문자를 입력하세요");
		int userChr = System.in.read();
		System.out.println("입력한 문자는 : "+ (char)userChr);
		
	}
	public static void main(String[] args)throws IOException {
		compileFunc();
	}
}
