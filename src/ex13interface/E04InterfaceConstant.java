package ex13interface;

import java.util.Scanner;

public class E04InterfaceConstant {

	public static void main(String[] args) {

		System.out.println("가위(1) 바위(2) 보(3) 게임입니다.");
		System.out.println("선택하세요(정수입력): ");

		Scanner sc = new Scanner(System.in);
		int sel = sc.nextInt();

		switch (sel) {

		case Game.SCISSORS:
			System.out.println("가위를 냈습니다.");
			break;
		case Game.ROCK:
			System.out.println("바위를 냈습니다.");
			break;
		case Game.PAPER:
			System.out.println("보를 냈습니다.");
			break;
		default:
			System.out.println("잘못 냈습니다..");

		}
	}

}
