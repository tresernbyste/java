package ex09package.study.seller;


public class FruitSeller4
{
	

	int numOfApple;
	int myMoney;
	final int APPLE_PRICE;

	public FruitSeller4(int money, int appleNum, int price)
	{ 
		myMoney = money;
		numOfApple = appleNum;
		APPLE_PRICE = price;
	}
	public int saleApple(int money)
	{

		int num = money / APPLE_PRICE;
		numOfApple -= num;
		myMoney += money;
		return num;
	}

	public void showSaleResult()
	{
		System.out.println("[판매자ss] 남은 사과개수 : " + numOfApple);
		System.out.println("[판매자ss] 판매수익 : " + myMoney);
	}

}
