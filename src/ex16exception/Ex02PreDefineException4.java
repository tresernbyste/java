package ex16exception;

import java.util.Date;

public class Ex02PreDefineException4 {
	static Date toDay;		// 참조변수가 null 상태이다.
	
	public static void main(String[] args)  {	
		
		System.out.println("### NullPointerException ###");
		System.out.println("toDay="+ toDay);  //  객체 생성만 후에 참조할 객체가 없는경우 null
		try {			 
			System.out.println(toDay.getTime());
		}
		catch(NullPointerException e) {
			System.out.println("toDay 참조변수는 null입니다.");
			System.out.println("예외메세지:"+ e.getMessage());
		}
				 
	}////end of main	
	 


}
