package ex07string;


import javax.security.sasl.SaslClient;

public class QuCircleCalculator
{

	static double circleArea(double circleA) {
		double  A = 0;
		A += (circleA * circleA * 3.14);
		
		return A;
	}
	static double circleRound(double circleR) {
		double R = 0;
		R += (2 * 3.14 * circleR);
		
		return R;
	
	}
	public static void main(String[] args)
	{
	
	
	
	double result = circleArea(5.5);
	double result2 = circleRound(5.5);
	
	
	System.out.println("원의 둘래는="+ result2);
	System.out.println("원의 넓이는="+ result);
	

	}
}
