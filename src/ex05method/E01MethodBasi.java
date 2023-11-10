package ex05method;

import java.util.Scanner;

public class E01MethodBasi
{
	public static int simpleFunc(int a, int b) {
		int sum = a + b;
		return sum;
	}
	
	public static void menuPrint()
	{
		System.out.println("����� �̸��� �����ΰ���?");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		namePrint(name);
	}
	
	public static void namePrint(String n) {
		System.out.println("�� �̸��� "+ n +" �Դϴ�.");
	}
	
	public static void main(String[] args) {
		int result = simpleFunc(1, 2); 
		System.out.println("1��2�� ������ ���:"+result);
		System.out.println("10��20�� ������ ���:"+ simpleFunc(10, 20));
		
		menuPrint();
	}
}
