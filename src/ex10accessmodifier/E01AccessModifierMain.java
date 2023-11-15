package ex10accessmodifier;

import ex10accessmodifier.sub.E01AccessModifier2;

public class E01AccessModifierMain
{

	public static void main(String[] args)
	{
		System.out.println("E01AccessModifier1 객체 생성 및 접근");
		
//		동일한 패키지에 선언된 클래스이므로  import 없이 호출가능  객체생성! heap영역에 자리생김 
		E01AccessModifier1 one = new E01AccessModifier1();
		
//		System.out.println("one.privateVar="+ one.privateVar);     동일한 폴더여도 private이기때문에 부를수 없다.
		System.out.println("one.defaultVar="+ one.defaultVar);
		System.out.println("one.publicVar="+ one.publicVar);
		
//		one.privateMethod();    // 가서 보니 private 이기 때문에 불가능
		one.defaultMethod();
		one.publicMethod();
		System.out.println("============================");
		
		System.out.println("DefaultClass 객체 생성 및 접근");
		new DefaultClass1().myFunc();
		
		System.out.println("E01AccessModifier2 객체 생성 및 접근");
		
		E01AccessModifier2 two = new E01AccessModifier2();
		new DefaultClass1().myFunc();
		
		System.out.println("one.privateVar="+ two.publicVar);     
		System.out.println("one.defaultVar="+ two.publicVar);
		System.out.println("one.publicVar="+ two.publicVar);
		
//		two.privateMethod();
//		two.defaultMethod();
		two.publicMethod();
		
		System.out.println("DefaultClass 객체 생성 및 접근");
//		new DefaultClass2().myFunc();
		
		
		
		
		
		
	}

}
