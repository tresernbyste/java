package ex12inheritance;  //######################################################

//111
//class A{}
//class B extends A{}
//  이 경우 클래스 A B에는 생성자를 정의하지 않았으므로 디폴트 생성자가 컴파일러에 의해 추가됩니다.
//  따라서 위코드는 정상적으로 실행되고 
//  객체 또한 문제없이 생성할 수 있습니다.
//  아래는 위의 코드를 컴파일 했을 때의 모습입니다.
//  
//  
//222
//class A{
//	public A() 		// 생략되어있는 디폴트 생성자
//	{
//	}
//class B extends A{
//	public B()    //  디폴트 생성자 
//	{
//		super();  // 생략되어있는 디폴트 상속
//	}
//}
//}
// 333
//class A{
//	public C(int x){ // 개발자가 직접 정의한 인자 생성자 
//		
//	}
//class A extends B{
//	public B(int y)
//	{
//		super(y);  // 부모의 인자생성자를 호출하는 super()는 반드시 기술해야합니다. 
//	}				// 개발자가 직접 생성자를 정의하게 되면 디폴트 생성자는 추가되지않으므로 
//					// super(y)와 같이 반드시 부모의 인자생성자를 호출하는 문장을 삽입해야합니다.
//}
//}



class Account {
	// private 로 선언되면 클래스 내부에서만 접근가능합니다. 즉 상속받은 하위 클래스에서는 직접접근불가 
	private int money;
	
//	public Account()  //  main method에  Account account = new Account(){}  이렇게 사용하기위해서는 
//	{				  //  디폴트 생성자가 꼭 필요하다 그렇지 않으면 main method 안에서 오류가 발생한다.
//		
//	}

	
	
	public Account(int init) {
		money = init;
	}
	protected void depositMoney(int _money) {
		if(_money<0) {
			System.out.println("마이너스 금액은 입금처리 불가합니다.");
			return;
		}
		money += _money;
	}
	// getter method   ---- 간접호출을 위해서 만들어놓음 
	protected int getAccMoney(){
		return money;
	}
}

//  ~66 까지 class Account
class SavingAccount extends Account{
	
	public SavingAccount(int initVal) {
		super(initVal);
	}
	public void saveMoney(int money) {
		depositMoney(money);   // protected 메서드(super) 이기 때문
	}
	public void showAccountMoney() {
		System.out.println("지금까지의 누적금액: "+ getAccMoney());
	}
}

public class E02PrivateInheritanceMain
{
	public static void main(String[] args)
	{
		
		SavingAccount sa = new SavingAccount(10000);
		
//		sa.money = 100000;
		sa.saveMoney(5000);
		sa.showAccountMoney();
		sa.saveMoney(-1000);    // 음수이기때문에 마이너스 금액은 입금처리 불가합니다. 출력
		sa.showAccountMoney();

//		Account account = new Account(1000);
//		Account.getAccMoney(1000); 
		
		
		
		
		
	}
}
