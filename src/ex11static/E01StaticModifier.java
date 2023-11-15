package ex11static;

class MyStatic {
	
	int instanaceVar;
	static int staticVar;
	
	void instanceMethod() {
		System.out.println("instanceVar="+ instanaceVar);
		System.out.println("staticVar="+ staticVar);
		staticMethod();
	}
	static void staticMethod() {
//		System.out.println("instanceVar="+ instanaceVar);  에러발생 
		System.out.println("staticVar="+ staticVar);
//		instanceMethod();   // static 영역에 저장된 메서드에서는 스택영역의 메서드 를 호출할수는 없다.  변수또한 동일
	}
	
}


public class E01StaticModifier
{
	public static void main(String[] args)
	{
		MyStatic myStatic = new MyStatic(); //  static이지만  heap영역에 객체를 생성하고 그 객체에서 다시 불러오는 방법
		myStatic.instanaceVar = 100;

		System.out.println("myStatic.instanaceVar="+myStatic.instanaceVar);
		
		
		
		MyStatic.staticVar =200;
		System.out.println("myStatic.staticVar="+MyStatic.staticVar);
	
		myStatic.staticVar =300; // 굳이 이렇게 사용하려면   정적 변수를 사용할 이유가 없다.   사용은 가능하다!! 
		System.out.println("myStatic.staticVar="+myStatic.staticVar);   //  사용은 가능하다!  근데 권장하지않음!   #### 이렇게 쓸거면 정적변수static 사용의 의미가 없음...
	
		//////////////////////////////////////////////////////////////
		
//		
//		MyStatic ms1 = new MyStatic();   // 2개의 객체를 생성한다.
//		MyStatic ms2 = new MyStatic();
//		
//		ms1.instanaceVar = 100;
//		ms2.instanaceVar = 1000;
//		System.out.println("ms1.instanaceVar="+ms1.instanaceVar);
//		System.out.println("ms2.instanaceVar="+ms2.instanaceVar);
//		
//		ms1.staticVar = 800;
//		ms2.staticVar = 900;
//		System.out.println("ms1.staticVar="+ms1.staticVar);  // 900  why? 
//		System.out.println("ms2.staticVar="+ms2.staticVar);  // 900
		
		
		MyStatic.staticVar = 800;
		MyStatic.staticVar = 900;  // 이게 진짜 정확.  똑똑한 코드.
		
		//
		
		myStatic.instanceMethod();
		myStatic.staticMethod();   // 권장사항아님.
		
//		MyStatic.instanceMethod(); 
		MyStatic.staticMethod();  // 권장사항 이렇게 쓰는 게 좋은 코드 정적 변수와 메소드 이용시에 그렇다.
//		
	}
	
}
