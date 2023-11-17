package ex13interface;

// 인터페이스는 생성자를 사용할수없다.


interface MyInterface1 {
	
//	public MyInterface1() {}  사용 불가  추상메서드이기때문에 
//	public static final int MAX_INT = Integer.MAX_VALUE;  생략가능
//	public abstract void absFunc1();
	int MAX_INT = Integer.MAX_VALUE;
	double MAX_DBL = Double.MAX_VALUE;
	
	void absFunc1();
	void absFunc2();   // 오버라이딩시  가려질예정
		
	}

interface MyInterface2{
	void absFunc2();  //  오버라이딩시 가려질예정
}

class SimpleClass{
	int simple = 1;
	void mySimple() {
		System.out.println("simple="+ simple);
	}
	
	
	public void absFunc2() {
		System.out.println("absFunc1() 호출됨333");
}
	
	
}


class MyClass extends SimpleClass implements MyInterface1, MyInterface2{
	@Override
	public void absFunc1() {
		System.out.println("absFunc1() 호출됨");
	}
	@Override
	public void absFunc2() {
		System.out.println("absFunc2() 호출됨");
	}
	
}



public class E03InterfaceMain {

	public static void main(String[] args) {
		
		MyInterface1 my1 = new MyClass(); //  부모클래스는 오버라이딩용이기때문에 자식객체를 가져와  구문들을 수행한다.  부모클래스안에는 기본적인 사항들이 들어가기때문에 
										  //  자식 =  자식() 생성 하는경우 기본적으로 받아올 정보들을 사용할 수 없다는것이다. 
//		MyInterface1 my2 = new SimpleClass();     // 아빠와 새엄마는 가족이 아닌데......
		my1.absFunc1();
		my1.absFunc2();
		
		//  Myclass extends SimpleClass  implements MyInterface1, MyInterface2   클래스에 심플이 상속받고 
		((SimpleClass)my1).mySimple();
		
	}

}

