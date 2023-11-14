package ex05method;

import java.util.Scanner;

public class QuSimpleOperation
{

	public static void main(String[] args)
	{
//		두개의 정수를 입력받아서 사칙연산의 결과를 출력하는 메소드와 main메소드를 작성해보자. 단 나눗셈은 몫과 나머지를 각각 출력해야 한다.
//		arithmetic()
//		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요1");
		int a = scan.nextInt();
		System.out.println("정수를 입력하세요2");
		int b = scan.nextInt();

		arithMetic(a, b);
	}

	static void arithMetic(int sNum, int eNum)
	{
		int s, m, x, n, mo = 0;
		s = sNum + eNum;
		m = sNum - eNum;
		x = sNum * eNum;
		n = sNum / eNum;
		mo = sNum % eNum;

		System.out.printf("덧셈결과 ->%2d\n뺄셈결과 ->%2d\n곱셈결과->%-3d\n나눗셈 몫->%2d\n나눗셈나머지%2d\n", s, m, x, n, mo);

	}

}
