package quiz;

import java.util.Scanner;

//class 

public class QuUpDownGame {

	static void upDown() {
		int ranNum = (int) (Math.random() * 100) + 1;
//		System.out.println(ranNum);
		Scanner scan = new Scanner(System.in);

		for (int i = 1; i <= 7; i++) {
			System.out.println("숫자를 맞춰주세요!");
			int r = scan.nextInt();
			if (ranNum == r) {
				System.out.println("성공!");
				break;
			} else if (ranNum > r) {
				System.out.println("up!");

			} else {
				System.out.println("down");
			}
		}
	}

	static void start() {
		Scanner scan = new Scanner(System.in);
		System.out.println("게임을 하려면 1을 종료하시려면 2를 눌러주세요");
		int r = scan.nextInt();
		switch (r) {
		case 1:
			System.out.println("새로운 게임을 시작합니다.");
			upDown();

		case 2:
			System.out.println("시스템을 종료합니다.");
			break;

		}
	}

	public static void main(String[] args) {

		upDown();
		start();

	}

}
