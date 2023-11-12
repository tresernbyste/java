package ex04controlstatement;

import java.util.Scanner;

public class QuNumberYN
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("하나의 문자를 입력하세요:");
		int num = System.in.read();
		
		boolean YN = num > 0   || num <= 0; 
		System.out.println(YN ? "숫자입니다" : " 숫자가아닙니다");
		
		 
		
		

	}

}
