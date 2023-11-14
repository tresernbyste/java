package sunex08class;

class FruitSeller {
	
	int numOfApple = 100;
	int myMoney = 0;
	final int APPLE_PRICE = 1000;   // 상수 처리!final
	
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

class  FruitBuyer{
	
	int myMoney = 5000;
	int numOfApple = 0;
	
	
//	구매 생성자 생성  -- 구매자 생성
	public void buyApple(FruitSeller seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
		
	}
	public void showBuyResult() {
		System.out.println("[bb구매자] 사과개수 : " + numOfApple);
		System.out.println("[bb구매자] 현재잔액 : " + myMoney);
	}
}


public class E06FruitSalesMain1
{

	public static void main(String[] args)
	{
		
		
		FruitSeller seller = new FruitSeller();
		FruitBuyer buyer = new FruitBuyer();
		
		System.out.println("구매행위가 일어나기전의 상태");
		seller.showSaleResult();
		buyer.showBuyResult();
		
		buyer.buyApple(seller, 5000);
		
		System.out.println();
		System.out.println("구매행위가 일어난 후의 상태");
	
		seller.showSaleResult();
		buyer.showBuyResult();
		
	}

}
