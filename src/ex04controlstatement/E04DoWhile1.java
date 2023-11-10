package ex04controlstatement;

import java.util.Scanner;
import java.io.IOException;


public class E04DoWhile1
{
	public static void main(String[] args) throws IOException
	
	{
		int sum = 0;
		int i = 1;
		do {
			sum += i;  // 수열의 자동형변환가능 
			i++;
		} while(i<=10);
		System.out.println("1~10까지의 누적합:" + sum);
		
		int total = 0;
		int j = 1;
		do {
			if(j%4 ==0 || j%7==0) {
				total += j;
			}
			j++;
		}while(j<= 1000);
		System.out.println("1~1000사이 4or7의 배수합:" + total);
		
		Scanner scanner = new Scanner(System.in);   //  scanner를 계속 사용할건지 밑줄  close.scanner를 권장하는 밑줄
		int kor, eng, math, avg;
		int exitCode;
		do {
			System.out.println("국어점수:");		// new Scanner 힙영역에 주소가 생성됨 객체생성
			kor = scanner.nextInt();				// kor에 입력받은 숫자를 주소에, 객체에 저장! 
			System.out.println("영어점수:");
			eng = scanner.nextInt();
			System.out.println("수학점수:");
			math = scanner.nextInt();
			
			avg = (kor+eng+math) / (3 * 10);
			switch(avg) {
			case 10: case 9:
				System.out.println("A학점");break;
			case 8:
				System.out.println("B학점");break;
			case 7: 
				System.out.println("C학점");break;
			case 6: 
				System.out.println("D학점");break;
			default:
				System.out.println("F학점");
			}
			
			System.out.println("종료하려면 x(X)를 입력하세요.");
			System.out.println("계속하려면 아무키나 입력하세요.");
			exitCode = System.in.read();
			
		}while(!(exitCode== 'x' || exitCode== 'X'));
	}

}
