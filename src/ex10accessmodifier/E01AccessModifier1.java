package ex10accessmodifier;


// accessmodifier -- main과 같은 폴더 일때 사용가능 
// public은 하나만 존재 
// 

class DefaultClass1
{
	void myFunc()
	{
		System.out.println("DefaultClass클래스의 myFunc()메소드호출");
	}
}
public class E01AccessModifier1
{
	// 멤버변수 
	private int privateVar;   // private 접근지정자
	int defaultVar;
	public int publicVar;

	private void privateMethod()
	{
		privateVar = 100;   // 같은 클래스안이기때문에 privateVar를 호출할수 있다.
		System.out.println("privateMethod() 메소드호출"+ privateVar);
	}

	void defaultMethod()
	{
		defaultVar = 200;
		System.out.println("defaultMethod() 메소드 호출"+defaultVar);
	}

	public void publicMethod()
	{
		publicVar = 300;
		System.out.println("publicMethod() 메소드 호출 "+publicVar);
		privateMethod();
	}

}
