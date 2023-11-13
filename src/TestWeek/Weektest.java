package TestWeek;

import java.util.Scanner;

public class Weektest
{
	public static void main(String[] args) 
	{
		
		int num = 120;
		if (num > 0 && num % 2 == 0)
		{
			System.out.println("양수이면서 짝수");
		}
		int num1=50, num2=100;
		int big,diff;
		
		if(num1<num2) {
			big = num2;
			diff = num1;
			System.out.println(big);
			System.out.println(diff);
		}else {
		}

		int i = 0;
		int sum = 0;
		while (i <= 100)
		{
			i++;
			if (i % 3 == 0 || i % 7 == 0)
			{
				if (i % 21 != 0)
				{
					System.out.print(i+ " ");
					sum += i;
				}
				
			}
		}
		System.out.println("3의 배수, 7의 배수인 합은: " + sum);
	}
}


