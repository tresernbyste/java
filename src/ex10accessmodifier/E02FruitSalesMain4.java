//  information hiding ----  정보은닉


package ex10accessmodifier;

class FruitSeller5 {														
	
	int numOfApple;
	int myMoney;
	final int APPLE_PRICE;
	
	public FruitSeller5(int money, int appleNum, int price) {  
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

class  FruitBuyer5{ 																	
	
	int myMoney = 5000;
	int numOfApple = 0;
	
	public FruitBuyer5(int _myMoney, int _numOfApple) {
		
		myMoney = _myMoney;
		numOfApple = _numOfApple;
				
	}
	
	

	public void buyApple(FruitSeller5 seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
		
	}
	public void showBuyResult() {
		System.out.println("[bb구매자] 사과개수 : " + numOfApple);
		System.out.println("[bb구매자] 현재잔액 : " + myMoney);
	}
}


public class E02FruitSalesMain4
{

	public static void main(String[] args)
	{
		
		
		FruitSeller5 seller1 = new FruitSeller5(0, 100, 1000);
		
		FruitSeller5 seller2 = new FruitSeller5(0, 80, 500);

		FruitBuyer5 buyer = new FruitBuyer5(10000, 0);
		
		
		
		System.out.println("구매행위가 일어나기전의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
		
//		아래의 코드는 문법적으로 오류가 없으나 지불금액과 구매한 사과의 관계가 전혀 맞지 않습니다.
//		논리적오류가 발생 ( 실무, 현장 상황 에러 )
//		코드의 오류는 없지만 결과적 오류 
//		즉, 코드(메서드)로 구현한 규칙이 완전히 무너지게 된다.
//		객체지향 프로그래밍에서는 이런 오류를 막기위해 멤버변수에 대한 "정보은닉"을 권장하고 있습니다.
//		멤버변수의 외부접근을 원천적으로 차단하고 멤버메서드를 통해서만 접근하게 하여 프로그래밍에 논리적오류를 차단
		
	
		
		
		
		// 각각의 판매자에게 1000원을 지불하고 사과를 구매합니다.
		seller1.myMoney += 1000;   // 판매자 1에게 1000원을 지불한 것.
		seller1.numOfApple -= 50;  // 사과 50개를 구매함.
		buyer.numOfApple += 50;	   //  구매자는 사과 50개를 얻음.
		
		seller2.myMoney += 1000;	//  판매자 2에게 1000원을 지불한 것.
		seller2.numOfApple -= 70;   // 사과 70개를 구매함.
		buyer.numOfApple += 70;		// 구매자는 사과 70개를 얻음.
		//  하지만 구매자의 금액은 차감되지 않음 금액x 갯수만 +
		
		
		
		buyer.buyApple(seller1, 5000);
		buyer.buyApple(seller2, 5000);
		
		System.out.println();
		System.out.println("구매행위가 일어난 후의 상태");
		System.out.println("첫번째 판매자 1");
		seller1.showSaleResult();
		System.out.println("두번째 판매자 2");
		seller2.showSaleResult();
		
		
		
		
	
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
	}

}
