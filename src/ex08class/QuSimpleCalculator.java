


package ex08class;

class Calculator {
	int cnt = 0;
	int val = 0;
	
	void add(int x, int y) {
		
		int addcnt = cnt;
		val = x + y;
		addcnt++;
	}
	void min(int x, int y) {
		int mincnt = cnt;
		val = x - y;

		mincnt++;
	}
	void mul(int x, int y) {
		int mulcnt = cnt;
		val = x * y;

		mulcnt++;
	}	
	void div(int x, int y) {
		int divcnt = cnt;
		val = x / y;

		divcnt++;
	}
	void init() {
		cnt = 0;
		cnt++;
	}
	
	
	
	
}

public class QuSimpleCalculator
{
	public static void main(String[] args)
	{
		Calculator cal = new Calculator();
		cal.init();
		System.out.println("1 + 2 = " + cal.add(1 , 2));
		System.out.println("10.5 - 5.5 = " + cal.min(10.5 , 5.5));
		System.out.println("4.0 * 5.0 = " + cal.mul(4.0 , 5.0));
		System.out.println("100 / 25 = " + cal.div(100 , 25));
		System.out.println("10.0 * 3.0 = " + cal.mul(10.0 , 3.0));
		cal.showOpCount();
	}	


	
	
}
