package ex12inheritance;

public class E07RideAndLoad02
{

	public static void main(String[] args)
	{
		
		System.err.println("Child형 참조변수로 Child객체 참조===========");
		DeChild child = new DeChild("율곡이이", 49, "00학번");
		
		child.excecise();
		child.sleep();
		child.printParent();
		
		child.study();
		child.walk();
		child.walk(25);
		
		DeChild.staticMethod();
		
//		override는 아이의 값으로 overload는 부모의 값으로~
		System.out.println("Parent형 참조변수로 Child객체 참조============= ");
		
		
		DeParent parent = new DeChild("퇴계이황", 35,"99학번");		// 부모주소의 참조값으로 아이
		
		parent.excecise();
		parent.sleep();
		parent.printParent();
		
		
//		parent.study();    study 생성자는 부모에 없기에 사용불가능.
		parent.walk();
//		parent.walk(20);    부모타입이기때문에 walk(인자) 인자가포함된 생성자는 부모에는 없고 아이에게만 있어 참조값을 불러올수 없다.
		
		DeParent.staticMethod();
		
		
	}

}
