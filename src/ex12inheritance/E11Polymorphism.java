//  다형성 
//	하나의 객체를 여러타입의 참조변수를 통해 참조할때 참조변수의 타입에 따라 다양한 객체를 이용할 수 있는 특성을 말한다.
//	단, 객체간에는 상속관계에 있어야 한다.

//  부모타입의 참조변수로 자식객체를 참조 -- 이질화

//  같은타입의 참조변수로 객체를 참조 --- 동질화




package ex12inheritance;

class Parent
{
	int parentMember;

	void parentMethod()
	{
		System.out.println("부모의메소드:parentMethod()");
	}
}

class Child extends Parent
{
	int childMember;

	void childMethod()
	{
		System.out.println("자식의메소드:childMethod()");
	}

	@Override
	void parentMethod()
	{
		System.out.println("자식에서 Overriding한메소드 parentMethod()");
	}

	void parentMethod(int childMember)   // overloading
	{
		this.childMember = childMember;
		System.out.println("Overloading:자식에서 확장한 메소드 : "
				+ "parentMethod(int childMember)");
	}

}

public class E11Polymorphism
{

	public static void main(String[] args)
	{
		
		System.out.println("[자식으로 자식객체 참조 - 동질화]");
		Child homeChild = new Child();   //  자식 자식
		homeChild.childMember = 10;		// 자식  자식변수 10
		homeChild.parentMember =100;	// 자식 상속받은 부모 변수 100
		homeChild.childMethod();		// just 자식 메소드
		homeChild.parentMethod(1000);	//  just 자식 메소드 (오버로딩)
		homeChild.parentMethod();		// 자식 부모 자식 (오버라이딩)
		
		System.out.println();
		System.out.println("[부모로 자식객체 참조 - 이질화]");
		Parent parent1 = homeChild;
		parent1.parentMember = 1; 
		((Child)parent1).childMember = 1;
		parent1.parentMethod();
		
		Parent parent2 = new Child();
		parent2.parentMember = 1;
		parent2.parentMethod();
		
		((Child)parent2).childMember = 1;
		((Child)parent2).childMethod(); 
		((Child)parent2).parentMethod();
		
		Child child2 = (Child)parent2;
		child2.childMember = 1;
		child2.childMethod();
		child2.parentMethod(1);
		
		System.out.println("[클래스의 끝판왕 Object]");
		Object object = new Child();
		((Parent)object).parentMethod();
			
				
	}

}
