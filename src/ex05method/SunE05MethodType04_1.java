package ex05method;

import java.util.Scanner;

public class SunE05MethodType04_1
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("인원수를 입력하세요");
		int personSu = scan.nextInt();
		int sumOfAge = getTotalAge(personSu);  //반환값을 받아야하는 변수가 있다면 변수로 받아와야한다.
		System.out.println("입력받은 나이의 합은? "+ sumOfAge);

	}
	static int getTotalAge(int personCnt) {
		Scanner scanner = new Scanner(System.in);
		
		int sumAge = 0;
		for(int i=1; i<=personCnt ; i++) {
			System.out.print(i+ "번째 사람의 나이");
			int age = scanner.nextInt();
			sumAge += age;
		}
		return sumAge;
	}

}
