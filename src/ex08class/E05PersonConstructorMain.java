package ex08class;

public class E05PersonConstructorMain
{

	public static void main(String[] args)
	{
		PersonConstructor person1 = new PersonConstructor();    
		
		System.out.println("[멤버변수 초기화용 메소드 호출전]");
		person1.showPersonInfo();
		System.out.println();
		
		System.out.println("[멤버변수 초기화용 메소드 호출후]");  // ############ 이 두개를 비교하는게 확실! 
		person1.initialize("홍길동", 20, "논현동");
		person1.showPersonInfo();
		System.out.println();
		
		
		System.out.println("[모든 매개변수를 전달한 값으로 초기화하기]");  // ############
		PersonConstructor person4 = new PersonConstructor("박길동", 50, "가산동");
		person4.showPersonInfo();
		System.out.println();
		
		System.out.println("[이름만 전달한 값으로 초기화하기]");
		PersonConstructor person2 = new PersonConstructor("박길동");
		person2.showPersonInfo();
		System.out.println();
		
		// 인자 2개인 변수를 찾아가보니 인자 2 개인 변수메서드 안에 인자3개인 변수가 포함되어있기때문에  인자생성자 3과 2가 둘다 프린트가 되는것!!
		
		System.out.println("[이름과 나이만 전달한 값으로 초기화하기]");    
		PersonConstructor person3 = new PersonConstructor("최길동", 40);
		person3.showPersonInfo();
		
		System.out.println("------------------------------------------------------");
	}

}
