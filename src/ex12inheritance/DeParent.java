package ex12inheritance;

public class DeParent
{

	private String name;
	private int age;
	
	public DeParent() {}     // 생성자 디폴트와 인수 생성자 둘다정의함
	public DeParent(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() { // private 변수를 간접호출 
		return name;
	}
	private void eat() {
		System.out.println("부모님이 드신다");
	}
	String sleep() { // 디폴트 
		System.out.println("부모님이 주무신다");
		return null;
		
	}
	
	protected void walk() {   //상속관계까지 불러갈수 ㅇ
		System.out.println("부모님이 산책하신다.");
	}
	public void excecise() {
		System.out.println("부모님이 운동하신다.");
	}
	
	public void printParent() {
		System.out.printf("성함:%s, 연세:%d", name, age);
	}
	public static void staticMethod() {
		System.out.println("부모님의 정적메소드");
	}
	
}
