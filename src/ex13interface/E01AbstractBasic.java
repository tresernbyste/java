package ex13interface;

abstract class AbsClass1
{
	public static final int MAX_INT = Integer.MAX_VALUE;

	void instanceMethod()// 오버라이딩용
	{
	}

	static void staticMethod(){}// 오버라이딩용     
	
}



class AbsClassChild1 extends AbsClass1
{
	@Override  // 주석가능 생략가능
	void instanceMethod()
	{
		System.out.println("선택적 오버라이딩");   //선택적? 
	}
}




abstract class AbsClass2
{
	abstract void absMethod(int number);  //  실행부가 없다면 (); 마무리 
}

class AbsClassChild2 extends AbsClass2
{
	@Override
	void absMethod(int number)
	{
		System.out.println("필수 오버라이딩");
	}

	void newMethod()
	{
		System.out.println("확장한 메소드");
	}
}

public class E01AbstractBasic
{
	public static void main(String[] args)
	{
		AbsClass1 absClass1 = new AbsClassChild1(); /// AbsClass1 absClass1 = new AbsClass1();  추상화 메서드만 있기때문에  객체선언이 불가능하다 인스턴스 불가능!
		AbsClassChild1 absClassChild1 = new AbsClassChild1();

		AbsClass2 absClass2 = new AbsClassChild2();
		absClass2.absMethod(100);
		((AbsClassChild2) absClass2).newMethod();

		AbsClass1.staticMethod();  //   객체생성 영역 ㄴㄴ    static을 단순 메서드호출 
		AbsClassChild1.staticMethod();
		System.out.println("int형의 최대값:" + AbsClass1.MAX_INT);

	}
}
