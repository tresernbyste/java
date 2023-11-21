package ex18lambda;

import java.awt.Menu;
import java.util.Random;

@FunctionalInterface
interface StringConcat{
	public void makeString(String s1, String s2);
}

@FunctionalInterface
interface RandomNumber{
	public int randomNum();
}

@FunctionalInterface
interface GugudanRange{
	public String[][] guguString(int n1, int n2);
}

@FunctionalInterface
interface MenuPrint{
	public void onlyPrint();
}

public class Ex05ParamNReturn {
	public static void main(String[] args) {
		System.out.println("###람다식 1 ##########");
		String s1 = "안녕하세요?";
		String s2 = "람다식입니다.";
		StringConcat sc = (a, b) ->{
			System.out.println(a + " "+ b);
		};
		sc.makeString(s1, s2);
		
		System.out.println("\n### 람다식 2  ######");
		RandomNumber randomNumber =() -> {
			Random random = new Random();
			return random.nextInt(100);
		};
		int rNumber = randomNumber.randomNum();
		System.out.println("생성된 난수:" + rNumber);
		System.out.println("\n### 람다식3");
	
		GugudanRange gugudanRange = (num1, num2) ->{
			String[][] gugudan = new String[9][9];
			for(int i=num1; i<=num2; i++) {
				for(int j=1; j<=9; j++) {
					gugudan[i-1][j-1] = i+"*"+j+"="+ (i*j);
				}
			}
			return gugudan;
		};
		
		String[][] returnStr = gugudanRange.guguString(4, 6);
		for (int i=4; i<=6; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(returnStr[i-1][j-1]+" ");
			}
			
			System.out.println();
		}
		
	System.out.println("\n### 람다식4");
	MenuPrint menuPrint = () ->{System.out.println("메뉴를 출력하빈다.");};
		
	
	menuPrint.onlyPrint();
	}
	
}
