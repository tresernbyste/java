package ex10accessmodifier.sub;

class DefaultClass2{
	
	void myFunc() {
		System.out.println("DefaultClass 클래스의 myFunc()메소드 호출");
	}
	
}

public class E01AccessModifier2
{
	private int privateVar;
	int defaultVar;
	public int publicVar;
	
	private void privateMethod()
	{
		privateVar = 400;
		System.out.println("privateMethod() 메소드호출"+privateVar);
	}

	void defaultMethod()
	{
		defaultVar = 500;
		System.out.println("defaultMethod() 메소드 호출"+defaultVar);
	}

	public void publicMethod()    // 이거를 다른 폴더에서 부르면? 
	{
		publicVar = 600;
		System.out.println("publicMethod() 메소드 호출 "+ publicVar);
		privateMethod();  // 같이있기때문에 Method 또한 부를수 있다.
	}
}
