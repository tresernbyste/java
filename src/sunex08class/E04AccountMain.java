//  시나리오 은행계좌를 추상화 해보자.
//  멤버변수 : 예금주
//				계좌번호
//				잔고
//	멤버메서드 : 입금, 출금, 잔고조회 
//		조건1 입금무제한
//		조건2 잔고<출금  출금불가 
// atm 기기 기능 

package sunex08class;

class Account
{
//	public Account() 이게 생략되어있다는 뜻이다. 그렇기에 main method 안에 Account account = new Account() 가 가능한것.  
	String name;
	String accountNumber;
	int balance;

	void deposit(int money)
	{
		balance += money;
		System.out.println(money + "원이 입금됨 ");
	}

	void withdraw(int money)
	{
		if (balance >= money)
		{
			balance -= money;
			System.out.println("계좌에서 " + money + "원이 출금됨");
		} else
		{
			System.out.println("잔고부족으로 출금불능");
		}
	}

	void showAccount()
	{
		System.out.println("계좌주:" + name);
		System.out.println("계좌번호:" + accountNumber);
		System.out.println("잔고:" + balance);

	}

//	초기화 메서드!
	void init(String n, String a, int b)
	{
		name = n;
		accountNumber = a;
		balance = b;
	}
}

// 프로그램의 시작#############

public class E04AccountMain
{
	public static void main(String[] args)
	{

		Account account = new Account(); // Account 클래스안에 account 객체 생성
		account.init("장동건", "111-21-8888", 1000); // 초기화메서드를 이용한 초기화 // Account 클래스안 account주소에 init를 이니셜라이즈-초기화메서드!
		account.deposit(90000); // 이렇게 Account class안에 account주소안에 heap영역값을 저장한다면 Account 안에 멤버메서드를 사용할수있다.
		account.withdraw(5000);
		account.showAccount();

		Account account2 = new Account();   // new Account  생성자호출 default(기본) 생성자를 부르는것이다. void 가없는데 반환값도 없다 중요## 값의 반환이 불가 void가없으니까
		account2.name = ("정우성");
		account2.accountNumber = "123-45-67890";
		account2.balance = 90000;
		account2.showAccount();

	}
}