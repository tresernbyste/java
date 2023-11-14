package ex08class;

class Person{
	String name = "정우성";
	int age = 47;
	String gender = "남자";
	String job = "영화배우";
	
	void eat() {
		System.out.printf("%s가(이) 식사를한다\n",name);
	}
	void sleep() {
		System.out.printf("나이가 %d인 %s(이) 잠자고 있다.\n",age, name);
	}
}

public class E01PersonMain
{

	public static void main(String[] args)
	{
		Person person = new Person();	// 객체를 선언후    // 인스턴스화 한다~
		person.eat();				//	 기능을 불러옴 
		person.sleep();
		
		// 위 3줄과 동일! 
		new Person().eat();
		new Person().sleep();	// 객체 생성과 동시에 method를 불러옴   둘다 가능!!
		
		
	}

}
