package ex16exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex04MultiCatch {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int array[] = new int[3];
		try {
			for(int i=0; i<array.length; i++) {
				System.out.println("array["+ i+ "]에 저장할 숫자입력:");
				array[i] = Integer.parseInt(scanner.nextLine());
			}
			System.out.println("배열에 저장된 두 숫자나누기:"+ array[0]/array[1]);
			System.out.println("나이를 입력하세요");
			int age = scanner.nextInt();
			System.out.println("당신의 나이는:"+ age);
			
			array[3]=age;
		}
		catch(InputMismatchException e) {
			System.out.println("숫자로만 입력해야합니다.");
		}
		catch(ArithmeticException e) {
			System.out.println("산술연산이 불가능 합니다.");
			
		}
		catch(NumberFormatException e) {
			System.out.println("숫자형태의 문자만 입력가능합니다.");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스를 초과하였습니다.");
		}
		catch(Exception e) {  // 위에 4가지catch에서 걸리지않은 에러가 여기서 걸린다ㅣ 예외계열 부모클래스
			System.out.println("예외가 발생하였습니다.");  // 혹시모르게 발생할 에러
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("====프로그램 끝====");
	}

}
