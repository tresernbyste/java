package TestWeek;

import java.util.Scanner;

public class Weektest
{
	public static void main(String[] args)
	{
//		문제1)  하나의문자를 입력받아 숫자인지 여부를 판단하는 프로그램을 삼항연산자를 이용하여 구현
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("하나의 문자를 입력하세요:");
//		
//		문제2) 다음예제는 두개의 if문을 사용하고 있다.이를 하나의 if문으로 변경해보자.ㅇ
//		
//		int num = 120;
//		if (num > 0 && num % 2 == 0)
//		{
//			System.out.println("양수이면서 짝수");
//		}

//		문제3) 아래 코드의 삼항연산자를 if~else문으로 변경하시오. 단, 실행결과는 동일해야 합니다.
//		int num1=50, num2=100;
//		int big,diff;
//		
//		if(num1<num2) {
//			big = num2;
//			diff = num1;
//			System.out.println(big);
//			System.out.println(diff);
//		}else {
//		}

//		문제4) 1~100까지의 숫자중 3의배수 이거나 7의 배수인 숫자의 합을 구하는 프로그램을
//		while문으로 작성하시오. 단, 3과 7의 공배수인 경우 합에서 제외해야한다.
//		
//		int i = 0;
//		int sum = 0;
//		while (i <= 100)
//		{
//			i++;
//			if (i % 3 == 0 || i % 7 == 0)
//			{
//				if (i % 21 != 0)
//				{
//					System.out.print(i+ " ");
//					sum += i;
//				}
//				
//			}
//
//		}
//		System.out.println("3의 배수, 7의 배수인 합은: " + sum);

//		제어문(조건/반복문) 2
//		
//		문제1) 다음과 같은 모양을 출력하는 프로그램을 while문으로 작성하시오.

		int i = 1;
		int j = 1;
		while (i <= 4)
		{
			while (j <= 4)
			{
				if (j == i) {
					System.out.print("*");
				j++;
			}
			i++;
			}
			System.out.println();

		}

	}

}
