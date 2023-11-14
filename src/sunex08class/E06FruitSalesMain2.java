// E06FruitSalesMain2

// 초기화 메서드를 썻을때 장점 
//	여러가지 물건 (2가지 종류의 사과)를 판매가 가능하다 각각의 입력과 출력이 가능하다는뜻이다.
//  초기화를 늘 해야된다는 단점이 있다. EX 사과의 가격을 항상 변경할수 있지만 , 예를 들면 알바생이 임의로 사과값을 조정할수 있다. 이런 점이 있다는것만.


// 		FruitSeller2 seller1 = new FruitSeller2();
//		seller1.initMember(0, 100, 1000);
//		
//		FruitSeller2 seller2 = new FruitSeller2();
//		seller2.initMember(0, 80, 500);

package sunex08class;

class FruitSeller2 {																	// class 판매자 
	
	int numOfApple = 100;
	int myMoney = 0;
	int apple_price = 1000;   // 상수 처리!final
	
// 생성자 생성과 동시에 초기화   ----  이니셜라이즈	
	public void initMember(int money, int appleNum, int price) {
		myMoney = money;
		numOfApple = appleNum;
		apple_price = price;
	}
	
	
//	 생성자 생성  -- 판매자 생성
	public int saleApple(int money) {
		int num = money / apple_price;
		numOfApple -= num;
		myMoney += money;
		return num;
	}
	public void showSaleResult() {
		System.out.println("[판매자ss] 남은 사과개수 : " + numOfApple);
		System.out.println("[판매자ss] 판매수익 : " + myMoney);
	}
	
}

class  FruitBuyer2{ 																	// class 구매자
	
	int myMoney = 5000;
	int numOfApple = 0;
	
	public void initMembers(int _myMoney, int _numOfApple) {
		
		myMoney = _myMoney;
		numOfApple = _numOfApple;
				
	}
	
	
//	구매 생성자 생성  -- 구매자 생성
	public void buyApple(FruitSeller2 seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
		
	}
	public void showBuyResult() {
		System.out.println("[bb구매자] 사과개수 : " + numOfApple);
		System.out.println("[bb구매자] 현재잔액 : " + myMoney);
	}
}


public class E06FruitSalesMain2
{

	public static void main(String[] args)
	{
		
		
		FruitSeller2 seller1 = new FruitSeller2();
		seller1.initMember(0, 100, 1000);
		
		FruitSeller2 seller2 = new FruitSeller2();
		seller2.initMember(0, 80, 500);

		FruitBuyer2 buyer = new FruitBuyer2();
		buyer.initMembers(10000, 0);
		
		
		
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
