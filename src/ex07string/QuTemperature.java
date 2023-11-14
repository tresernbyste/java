package ex07string;

import java.util.Scanner;

public class QuTemperature
{
	
	public static void main(String[] args)
	{
		
		Scanner scan = new Scanner(System.in);
		System.out.println("섭씨, 화씨 입력");
		int f= scan.nextInt();
		
//		fc(f);
//		cf(f);
		
		 
		
		System.out.printf("섭씨:"+ fc(f));
	
	}
	
	
	public static int fc (int celsius) {
	
		
		int Fahrenheit = (int)1.8 * celsius +32; 
		
		return Fahrenheit;
	}
	public static int cf (int Fahrenheit) {

		int celsius = (int) ((Fahrenheit-32)/1.8); 
		
		return celsius;
	}
		
		
		
		
		
}
