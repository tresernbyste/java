//  메서드 오버로딩 Method Overloading 
//  println()  ctrl 1  같은 이름의 여러가지 종류? 기능? 이라고 편하게 정의 
//	println( int double line char)등등  라이브러리 안에 메소드들은 오버로딩으로 이미 정의되었기 때문에 
//										코딩하는데 유용하고 편리하게 사용가능 
//		Flutter 같은 경우 헷갈릴 수있기 때문에 add1 add2와 같이 분리사용  


//  이름만 같은 전혀 다른 변수 
// 자료형이 다른경우 가능 자료형이 같고 매게변수의 수가 같다면 불가능 
//  자료형이 같고 매개변수가 같다면 같은 메소드로 불가능person(int a)가 2개 컴퓨터는 둘중 어디에 int a 를 넣을지 알수가 없다.
// 자료형이 같고 매개변수가 다르다면 다른메소드이기에 가능 

package ex05method;

public class SunE07Overloading
{

	static void person(int juminNum, int milNum) {
		System.out.println("군필자 이시군요");
		System.out.println("주민번호:"+ juminNum);
		System.out.println("군번:"+ milNum);
	}
	static void person(double juminNum) {
		System.out.println("미필자이거나 여성이군요");
		System.out.println("주민번호:"+ juminNum);
	}
	static int person(int juminNum2) {
		System.out.println("미필자이거나 여성이군요");
		System.out.println("주민번호:"+ juminNum2);
		return juminNum2;
	}
	public static void main(String[] args)
	{
		person(123456, 7890123);
		System.out.println("==============");
		person(987654);
		person(0.123);
	}
	
}
