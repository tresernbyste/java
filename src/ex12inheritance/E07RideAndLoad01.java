package ex12inheritance;

class A {
	public void rideMethod() {
		System.out.println("A의 rideMethod");
	}
	public void loadMethod() {
		System.out.println("A의 loadMethod");
	}
}

class B extends A {
	@Override
	public void rideMethod() {
		System.out.println("B의 rideMethod");
	}
	public void loadMethod(int num) {
		System.out.println("B의 loadMethod");
	}
}

class C extends B {
	@Override
public void rideMethod() {
	System.out.println("C의 rideMethod");
}
public void loadMethod(double num) {
	System.out.println("C의 loadMethod");
}


}

public class E07RideAndLoad01
{
	public static void main(String[] args)
	{  
		
		A ref1 = new C();
		B ref2 = new C();
		C ref3 = new C();
		A ref4 = new B();
		
		System.out.println("오버라이딩 처리된 메소드 ");
		ref1.rideMethod();
		ref2.rideMethod();
		ref3.rideMethod();
		System.out.println();
		ref4.rideMethod();
		
		System.out.println("오버로딩 처리된 메소드");
		ref3.loadMethod();		//  C C
		ref3.loadMethod(1);
		ref3.loadMethod(1.1);
		
		ref2.loadMethod();		// B C
		ref2.loadMethod(1);		  
//		ref2.loadMethod(1.1);  // class B 메서드만 사용가능하고 오버로딩된경우에만 C에있는 오버로딩메서드만 가져오는것
		
		ref1.loadMethod();		// A C
//		ref1.loadMethod(1);    //  class A 안에 메서드만 사용가능하고  오버로딩 된경우에는 C에있는 오버로딩메서드에 가리고있는 Cride사용
//		ref1.loadMethod(1.1);	//  load 같은 경우에는 불가능하다!
		
		
		
//		오버로딩은 동일한 객체를 참조한다 하더라도 참조변수의 타입에 따라 접근 범위가 달라지게된다
//		즉 참조변수의 타입만큼만 접근할 수 있다.
		
		//  부모참조변수로 자식객체를 참조할 수 있다.
		A refNum1 = new B();
		A refNum2 = new C();
		B refNum3 = new C();
		
		
		//  
		C refAddr1 = new C();
		B refAddr2 = refAddr1;
		A refAddr3 = refAddr2;
		
		
		//참조변수 refId1이 c객체를 참조하고 있으므로 마치 C타입 으로 착각할수 있으나 원래의 타입은 A이다.
		// 자식으로 부모를 참조하는것은 불가능 하므로 아래 2개의 문장은 에러가 발생한다.
		A refId1 = new C();	// double A  int C 가능
//		B refId2 = refId1; // C(A) refId1 -- C를 참조 했지만 A이기때문에 불가능   float B != double A
//		C refId3 = refId1; // C(A)											int C != double A 요런느낌쓰!
		
		// 객체형변환  다운캐스팅(강제형변환)을 하면 참조가 가능해진다.  상속일때만 ★가능★
//		즉 부모타입을 자식타입으로 변경하는것이다. 이는 클래스가 상속관계에 있기 대문에 가능하고
//		방식은 기본자료형과 동일하게 소괄호를 사용하면 된다
		
		B refId2 = (B)refId1;  // int a = (int)3.14; [3] 강제형변환 가능
							   //  B refId2 = (B)C(사실A)  A부모를 B로 다운캐스팅!
		C refId3 = (C)refId1;	// C refId3 = (C)C(사실A)
		
		
		
	
	}
}