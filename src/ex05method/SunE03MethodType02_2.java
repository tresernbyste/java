package ex05method;

import java.util.Scanner;

public class SunE03MethodType02_2
{
	static String getHakjum() { // static 선언호출은 스태틱뿐  void가 없기 때문에 return 값이 있다.   void 가 있으면  return;종료문으로 return 사용 
		Scanner	scanner = new Scanner(System.in);
		
		System.out.print("국어점수:");
		int kor = scanner.nextInt();
		System.out.print("영어점수:");
		int eng = scanner.nextInt();
		System.out.print("수학점수:");
		int math = scanner.nextInt();
		
		double avg = (kor + eng + math) / 3.0;
		String hakjum = "";
		int result = (int)avg /10;
		switch(result) {
		case 10: case 9:
			hakjum ="A학점";break;
		case 8: 
			hakjum ="B학점";break;
		case 7:
			hakjum ="C학점";break;
		case 6:
			hakjum ="D학점";break;
		default:
			hakjum = "F학점";
		}
		return hakjum;
//		scanner.close();
	}
	
	public static void main(String[] args)
	{
		System.out.println("너의 학점은 "+ getHakjum() + "이얌~!");  //바로 부르는 경우 
	
		
		String h = getHakjum();
		System.out.printf("당신의 학점은 %s 입니다.", h);	// 변수로 설정후 부르는경우
	}
}
