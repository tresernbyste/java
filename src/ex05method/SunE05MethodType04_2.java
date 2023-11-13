package ex05method;

import java.util.Scanner;

public class SunE05MethodType04_2
{

	public static void main(String[] args)
	{
		int maxValue1 = returnMaxNumber(4);
		System.out.println("최대값1:"+ maxValue1);

		int maxValue2 = returnMaxNumber(6);
//		System.out.println("최대값2:" + maxValue2);   16줄과 동일 ㅇ출력문 내부에서 호출 가능한 방법을 알려주기위함 .
		
		System.out.println("최대값2:"+ returnMaxNumber(6));
	}

	static int returnMaxNumber(int numberCnt) {
		Scanner scanner = new Scanner(System.in);
		int maxVal = 0;
		for(int i=1; i<=numberCnt; i++) {
			System.out.print("정수를 입력하세요");
			int inputNum = scanner.nextInt();
			
			if(i==1) {
				maxVal = inputNum;  //음의 정수까지 비교하기위함.
			}
			else {
				if(maxVal<inputNum) {	// 수열의 정렬을 할때 사용하는 방법
					maxVal = inputNum;
				}
			}
		}
		return maxVal;
	}
	
}
