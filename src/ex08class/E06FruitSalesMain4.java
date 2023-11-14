// E06FruitSalesMain2 초기화 후 메서드 
//  초기화 메서드를 썻을때 장점 
//	여러가지 물건 (2가지 종류의 사과)를 판매가 가능하다 각각의 입력과 출력이 가능하다는뜻이다.
//  초기화를 늘 해야된다는 단점이 있다. EX 사과의 가격을 항상 변경할수 있지만 , 예를 들면 알바생이 임의로 사과값을 조정할수 있다. 이런 점이 있다는것만.


// 		FruitSeller4 seller1 = new FruitSeller4();
//		seller1.initMember(0, 100, 1000);
//		
//		FruitSeller4 seller2 = new FruitSeller4();
//		seller2.initMember(0, 80, 500);


// 생성자를 이용해 초기화 하는방법!!!
// E06FruitSalesMain3 초기화동시에 이니셜라이즈
// 멤버상수는 값의 변경이 불가능하고, 단 한번만 초기화되기 때문에
// 일반 멤버메서드에서는 초기화할수 없다. 또한 초기값이 없는 상태로 선언 자체가 불가능하다.
// 하지만 생성자는 객체생성시 딱 한번만 호출되고, 개발자가 마음대로 호출할 수 없으므로 
// 한번 이상 초기화되지 않음이 보장된다.
// 따라서 멈버상수는 생성자에서 초기화 할수 있다. // 알바생이 바꿀수 없다의 반론

//  멤버상수를 객체 호출시 상수를 직접 설정할수 있다.   ###########상수까지도 변경이 가능하다! 


package ex08class;

class FruitSeller4 {																	// class 판매자 
	
	int numOfApple;
	int myMoney;
	final int APPLE_PRICE;
	
	public FruitSeller4(int money, int appleNum, int price) {  //반환값이 없지만 void가없다.
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

class  FruitBuyer4{ 																	// class 구매자
	
	int myMoney = 5000;
	int numOfApple = 0;
	
	public FruitBuyer4(int _myMoney, int _numOfApple) {
		
		myMoney = _myMoney;
		numOfApple = _numOfApple;
				
	}
	
	
//	구매 생성자 생성  -- 구매자 생성
	public void buyApple(FruitSeller4 seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
		
	}
	public void showBuyResult() {
		System.out.println("[bb구매자] 사과개수 : " + numOfApple);
		System.out.println("[bb구매자] 현재잔액 : " + myMoney);
	}
}


public class E06FruitSalesMain4
{

	public static void main(String[] args)
	{
		
		
		FruitSeller4 seller1 = new FruitSeller4(0, 100, 1000);
		
		FruitSeller4 seller2 = new FruitSeller4(0, 80, 500);

		FruitBuyer4 buyer = new FruitBuyer4(10000, 0);
		
		
		
		System.out.println("구매행위가 일어나기전의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
		buyer.buyApple(seller1, 5000);
		buyer.buyApple(seller2, 5000);
		
		System.out.println();
		System.out.println("구매행위가 일어난 후의 상태");
	
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
	}

}
