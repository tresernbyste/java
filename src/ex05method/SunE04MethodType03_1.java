package ex05method;

import java.util.Scanner;

public class SunE04MethodType03_1
{

	public static void main(String[] args) 
	{
	 
	Scanner scanner = new Scanner(System.in);
	System.out.print("시작값");
	int s = scanner.nextInt();
	System.out.print("종료값");
	int e = scanner.nextInt();
	myWantSum(s, e);
	scanner.close();// scanner 종료 반복문에서 사용시 이후 사용불가능
	}
	
	
	static void myWantSum(int startNum, int endNum) { // 값을 소비하는 void ㅇ 
		int sum = 0;
		for(int i=startNum; i<=endNum; i++) {
			sum += i;
		}
		System.out.printf("%d~%d까지의 합은: %d", startNum, endNum, sum);
	}

}
