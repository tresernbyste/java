package test;

public class A4_Qu3Or7Sum
{

	public static void main(String[] args)
	{
		int i = 1;
		int sum = 0;
		while(i<=100) {
			
			if(i%3==0 || i%7==0) {
				if(i%21 != 0) {
					System.out.print(i+ ",");
					sum += i;
				}
			}
			i++;
			}
			
		
		System.out.print("누적된 모든 수의 합은:"+ sum);

	}

}
