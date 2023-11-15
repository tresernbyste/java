package ex09package.study.buyer;

import ex09package.study.seller.FruitSeller4;

public class FruitBuyer4
{

	int myMoney = 5000;
	int numOfApple = 0;

	public FruitBuyer4(int _myMoney, int _numOfApple) {
			
			myMoney = _myMoney;
			numOfApple = _numOfApple;
					
		}

//		구매 생성자 생성  -- 구매자 생성
	public void buyApple(FruitSeller4 seller, int money)
	{
		numOfApple += seller.saleApple(money);
		myMoney -= money;

	}

	public void showBuyResult()
	{
		System.out.println("[bb구매자] 사과개수 : " + numOfApple);
		System.out.println("[bb구매자] 현재잔액 : " + myMoney);
	}

}
