package ex05method;

import java.util.Scanner;

public class SunE01MethodBasic
{
	public static int simpleFunc(int a, int b)  // 내가 만든 메소드  언제든 불러올수 있음 
	{											//  반환값 있음 , 매게변수 있음
		int sum = a + b;
		return sum;

	}

	public static void menuPrint()   						//	void이기에  반환값없고, 매게변수 없음 
															//
	
	{
		System.out.println("당신의 이름은 무엇인가요?");
		Scanner scanner =new Scanner(System.in);
		String name = scanner.nextLine();
		namePrint(name);
	}
	
	public static void namePrint(String n)		// return 값은 없지만 불러온곳으로 돌아감      반환값없고 매게변수는 있음 void이기때문에 실행후에 호출지점으로 돌아간다.
	{
		System.out.println("제 이름은 " + n + "입니다" );
	}
	
	public static void main(String[] args)
	{
		int result = simpleFunc(1, 2);
		System.out.println("1과 2를 전달한 결과 " + result);
		System.out.println("10과 20을 전달한 결과 " + simpleFunc(10, 20));
		
		menuPrint();
	}
}
