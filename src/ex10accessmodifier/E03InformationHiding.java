//  information hiding ----  정보은닉


package ex10accessmodifier;

class FruitSeller6 {														
	
	private int numOfApple;
	private int myMoney;
	private final int APPLE_PRICE;
	
	public FruitSeller6(int money, int appleNum, int price) {  
		myMoney = money;
		numOfApple = appleNum;
		APPLE_PRICE = price;
	}
	
	
// 생성자 생성과 동시에 초기화   ----  이니셜라이즈	
	
	
//	 생성자 생성  -- 판매자 생성
	public int saleApple(int money) {
		int num = money / APPLE_PRICE;
		numOfApple -= num;
		myMoney += money;
		return num;
	}
	public void showSaleResult() {
		System.out.println("[판매자ss] 남은 사과개수 : " + numOfApple);
		System.out.println("[판매자ss] 판매수익 : " + myMoney);
	}
	
}

class  FruitBuyer6{ 																	
	
	private int myMoney = 5000;
	private int numOfApple = 0;
	
	public FruitBuyer6(int _myMoney, int _numOfApple) {
		
		myMoney = _myMoney;
		numOfApple = _numOfApple;
				
	}
	
	

	public void buyApple(FruitSeller6 seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
		
	}
	public void showBuyResult() {
		System.out.println("[bb구매자] 사과개수 : " + numOfApple);
		System.out.println("[bb구매자] 현재잔액 : " + myMoney);
	}
}


public class E03InformationHiding
{

	public static void main(String[] args)
	{
		
		
		FruitSeller6 seller1 = new FruitSeller6(0, 100, 1000);
		
		FruitSeller6 seller2 = new FruitSeller6(0, 80, 500);

		FruitBuyer6 buyer = new FruitBuyer6(10000, 0);
		
		
		
		System.out.println("구매행위가 일어나기전의 상태");
		System.out.println("첫번째 판매자 1");
		seller1.showSaleResult();
		System.out.println("두번째 판매자 2");
		seller2.showSaleResult();
		System.out.println("구매자");
		buyer.showBuyResult();
		
//		// 각각의 판매자에게 1000원을 지불하고 사과를 구매합니다.
//				seller1.myMoney += 1000;   // 판매자 1에게 1000원을 지불한 것.
//				seller1.numOfApple -= 50;  // 사과 50개를 구매함.
//				buyer.numOfApple += 50;	   //  구매자는 사과 50개를 얻음.
//				
//				seller2.myMoney += 1000;	//  판매자 2에게 1000원을 지불한 것.
//				seller2.numOfApple -= 70;   // 사과 70개를 구매함.
//				buyer.numOfApple += 70;		// 구매자는 사과 70개를 얻음.
//				//  하지만 구매자의 금액은 차감되지 않음 금액x 갯수만 +
		
		
//		멤버변수를 private으로 선언하면 클래스 외부에서는 접근이 불가능하므로 
//		기존 코드는 모두 에러가 발생합니다.   잘못사용할 여지가 없다. 멤버메서드에 저장된 함수들만 사용하므로 
//		위 주석과 같이 사용할 경우 이미 멤버메서드가 있음에도 결과를 다른식으로 도출했기 때문이다 .
		
//		즉, 멤버변수의 정보은닉을 통해 비정상적인 접근을 차단하고 멤버메서드를 통해서만 구매가 이루어질수 있도록		
//		구현해야합니다.  비정상적 접근이란 --- 멤버메서드를 사용하지 않았다는 것.
		
// 		멤버메서드를 사용해야만 하는 상황을 멤버변수의 private선언을 통해서 한 것이라고 생각하면 될 듯.
//		단, 멤버변수의 private선언은 같은 class 내부에 있는 경우에만 사용, 호출이 가능하기 때문에 혼동될 부분 조심.
//		pakage를 나눠 class를 정의한 경우는 publicMethod 안에 privateMethod를 호출하고 그 이후에 다른 패키지 코드로 이동.
		
		
		buyer.buyApple(seller1, 1000);
		buyer.buyApple(seller2, 1000);
		
		System.out.println();
		System.out.println("구매행위가 일어난 후의 상태");
		System.out.println("첫번째 판매자 1");
		seller1.showSaleResult();
		System.out.println("두번째 판매자 2");
		seller2.showSaleResult();
		System.out.println("구매자");
		buyer.showBuyResult();
		
		
		
	
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
	}

}
