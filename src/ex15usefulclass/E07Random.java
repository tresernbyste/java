package ex15usefulclass;

import java.util.Random;

import ex01start.E02SystemOutPrintln;

public class E07Random {
	
	public static void main(String[] args) {
		
		System.out.println("# 가짜난수: 같은 패턴의 난수만 생성됨");
		Random random1 = new Random(32);
		for(int i=0; i<10; i++) {
			System.out.print(random1.nextInt(100)+ " ");
		}
		
		System.out.println("\n# 난수생성1 : 씨드없음");
		Random random2 = new Random();
		for(int i=0; i<10; i++) {
			System.out.print(random2.nextInt(100)+ " ");
		}
		
		
		// 로또 사용 난수 !  random.nextInt(45)
		System.out.println("\n# 난수 생성2 : 변화하는 시간으로 씨드지정");
		Random random3 = new Random();
		random3.setSeed(System.currentTimeMillis());
		for(int i=0; i<10; i++) {
			System.out.print(random3.nextInt(100)+ " ");
		}
		
		
		//  nextInt 에 인수가 없는 경우에는 음수,양수가 혼용된 난수가 생성된다.
		System.out.println("\n# 난수생성3 : nextInt() 인수없음");
		Random random4= new Random();
		for(int i=0; i<10; i++) {
			System.out.println(random4.nextInt()+ " ");
		}
	}

}
