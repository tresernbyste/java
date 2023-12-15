package quiz;

import java.util.Random;
import java.util.Scanner;

//게임설명 : 가위바위보 게임을 메소드를 통해 구현한다.
//난수생성기를 이용하여 1, 2, 3중 하나의 숫자를 생성한다.  Random rd = new Random(3);
//사용자가 가위(1),바위(2),보(3) 중 하나를 낸다.
//승부를 판단하여 출력한다.   1 2 l 1 3 w 
//					 21 w 23 l
//					 31 l 32 w 
//1,2,3 이외의 숫자를 입력하면 잘못된 입력을 알려주고 재입력을 요구한다.
//숫자입력을 잘못한 경우는 게임횟수에 포함하지 않는다.
//게임은 5번 진행하고 5번째 게임을 끝내면 다시할지 물어본다. 재시작(1), 종료(0)
//0, 1 이외의 숫자를 입력하면 재입력을 요구해야 한다.

public class QuRockPaperScissors {
	public static void main(String[] args) {

	}

	
	
	
	static void RSP() {
		Scanner scanner = new Scanner(System.in);
		int user = scanner.nextInt();
		Random rd = new Random();
		int com = rd.nextInt(3) + 1;
		for (int i = 1; i <= 5; i++) {

			if ((user - com) == -1 && (user - com) == 2) {
				System.out.println("패배");
			} else if ((user - com) == 1 && (user - com) == -2) {
				System.out.println("승리");
				break;
			}
		}
		
	}
	
//	static void start() {
//		System.out.println(1 or 2);
//		int r = 
//	}
}