import java.util.Scanner;

public class Ex07_CatchThrowable
{
	public static void myMethod1()
	{
		myMethod2();     // myMethod2으로부터 예외 넘어옴
	}
	
	public static void myMethod2()
	{
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();     // 예러 발생 지점
		int num2 = 10 / num1;        // 예러 발생 지점
		System.out.println(num2);
	}
	public static void main(String[] args)
	{
		try
		{
			myMethod1();  // 여기로 myMethod1으로부터 예외가 넘어옴
			/*
			 	여기로 전달된 예외를 아래 Throwable 매개변수 e에 대입된다.
			*/
		}
		catch(Throwable e)
		// 던져진 것을 처리한다는 의미로 Exception의 상위 객체인 
		// Throwable을 사용한다.
		{
			e.printStackTrace();
			System.out.println("에러 !!!");  // 마지막으로 출력
		}
	}
}
