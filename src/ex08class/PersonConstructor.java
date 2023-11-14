//  단순 기본 생성자를 사용하면 된다고 생각할 수 있지만 
//  후에 인수를 이용한 생성자 ,, 오버로딩을 이용한다면  
//  기본적으로 자주 사용하는 방법, 유용, 편리 하게 이용할수 있다. 

// ## 주의 ##  멤버변수이름과 매개변수 이름이 같을시에 혼동이 올 수 있음을 주의.
//				this란, 멤버변수의 이름이다.


package ex08class;

public class PersonConstructor
{

	String name;		// 멤버변수 3줄 
	int age;			// this.name .age . addr 을 받을 사실상 멤버변수는 바로 여기로 들어온다.
	String addr;
	
//	public PersonConstructor(){}  -- 생략되었을뿐 존재함   이게 있어야 new Personconstructor() 사용이가능
//									개발자가 임의로 지정 불가능! 
	
//	생성자1 매개변수가 없는 형태로 정의 
	public PersonConstructor() {
		name = "이름없음";
		age = 1;
		addr = "미상";
		System.out.println("나는 기본생성자 입니다.");
	}
	
	
//	생성자[1]  인자(인수)생성자로 정의
	
//	this는 멤버변수와 매개변수를 구분하기 위한 용도로 사용되는데, 클래스 자신, 즉 멤버를 가리킨다.
//	좌측항은 멤버변수 우측항은 매개변수를 가리키게된다.
	
	public PersonConstructor(String name) {  // String 매개변수\
		this.name = name;   // this.멤버변수 = 매개변수
		age = 1;
		addr = "출처불명";
		System.out.println("나는 인자생성자[1] 입니다");
	}
	
	
//	생성자 [2]  
//	
	
	public PersonConstructor(String name, int age) {
		this(name, age, "미상");		// 매개변수가 3개있는 생성자를 사용한다는뜻  43줄 을 가져다 쓴다는것
		System.out.println("나는 인자생성자[2] 입니다");
	}
	
	public PersonConstructor(String _name, int age, String addr) {
		name = _name;   // 멤버변수와 매개변수의 이름이 다르기때문에 this 를 사용하지 않는다.
		
		this.age = age;
		this.addr = addr;
		System.out.println("나는 인자생성자[3] 입니다");
	}
	
	
	
	
	
//	초기화와 동시에 생성이기 때문에 
//	public PersonConstructor ( name , age , addr  ) == this (name, age, "미상")    의 멤버메소드안에 멤버메소드를 호출 할수 없기때문에 발생하는 오류이다  
	void initialize(String name, int age, String addr) { // 내가 원할때 언제든 호출 할수 있다.
//		this(name, age, "미상");     ----위와 같은 변수를 부를수 없기 때문에 에러예외 발생   
		
		this.name = name;   		//멤버변수는 캐릭터의 이름에 들어갈 이름 = 단순 입력 혹은 다른 테이블에서 받아올 단순 int String 
		this.age = age;				// 매개변수같은경우 변수이름이 중복이 가능하기 때문에 보통같은경우 헷갈릴경우가 있지마만
		this.addr = addr;			//  this 를 사용하거나 syntex의 색을 확인하거나 위치를 항상 확인.
		System.out.println("나는 인자생성자[4] 입니다");
	}
	
	
	
	
	void showPersonInfo() {
		System.out.printf("%s 님의 정보\n", this.name);
		System.out.printf("나이:%d\n", this.age);
		System.out.printf("주소:%s\n", this.addr);
	}
}
