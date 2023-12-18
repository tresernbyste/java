import java.util.Scanner;

/*
	예외를 전달하여 처리하는 이유는 예외가 발생하는 지점의 메서드를 많
	은 곳에서 호출하는 경우 예외 처리가 다양할 수 있기 때문입니다
*/
public class Ex08_WhyThrow
{
	public static void myMethod1()
	{
		try
		{
			myMethodA();   // 여기로 myMethod1으로부터 첫번째 예외가 넘어옴
		}
		catch(Throwable e)
		{
			System.out.println("에러 !!! 숫자로 입력하세요!");
		}
	}
	
	public static void myMethod2()
	{
		try
		{
			myMethodA();    // 여기로 myMethod1으로부터 두번째 예외가 넘어옴
		}
		catch(Throwable e)
		{
			System.out.println("Error !!! 0으로나눌수 없습니다. 다시!");
		}
	}
	
	public static void myMethodA()
	{
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();   // 에러 발생 지점
		int num2 = 10 / num1;      // 에러 발생 지점
		System.out.println(num2);
	}
	
	public static void main(String[] args)
	{
		myMethod1();
		myMethod2();
		// 서로 다른 예외 처리를 할 수 있다
	}
}
