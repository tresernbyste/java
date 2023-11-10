package ex04controlstatement;

public class E06BreakContinue1
{

	public static void main(String[] args)
	{
		
		while(true) {
			System.out.println("출력문1");
			System.out.println("출력문2");
			
			break;
//			System.out.println("출력문3");
//			System.out.println("출력문4");
		
		}
		
		int i=0;
		while(true) {
			i++;
			System.out.printf("[i가 %d일때]\n", i);
			
			System.out.println("continue이전 출력문");
			if(i%2==0) continue;
			System.out.println("continue이전 출력문");
			
			System.out.println("break이전 출력문");
			if(i==3) break;
			System.out.println("break이후 출력문");
		}
		
		for(int x=1; x<=5; x++) {
			System.out.println("x="+x);
			for(int y=1; y<=5; y++) {
				System.out.println("y="+y);
				if(y==3)
					break;
			}
		}
	}

}
