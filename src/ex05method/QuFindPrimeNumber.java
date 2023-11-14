package ex05method;

public class QuFindPrimeNumber
{
	// 정수 1은 소수가 아니므로 무조건 false를 반환한다.
	public static boolean isPrimeNumber(int n)
	{

		if (n == 1) return false;
			

		// 만약 7이라면 1과 7로는 무조건 나눠서 떨어지므로
//		소수검사를 위해 2~6까지만 나눠보면됩니다.
		for (int i = 2; i < n; i++)
		{
			if (n % i == 0)
			{
				return false;
			}
		}
		return true;
	}
		

	public static void main(String[] args)
	{
		// 1~100까지의 정수중 소수인지 판단
		for(int i=1; i<100; i++ ) {
		//  만약 소수이면 true를 반환 받습니다.
			boolean result = isPrimeNumber(i);
			if(result == true) {
				System.out.println(i);
			}
		}
	}
}
