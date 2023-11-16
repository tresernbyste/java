package ex12inheritance;

public class DeChild extends DeParent
{
	String stNumber;
	
	public DeChild(String name, int age, String stNumber) {
		super(name, age);
		this.stNumber = stNumber;
	}
	public void study() { //부모에 없기 때문에 아이용
		System.out.println(getName() + "이(가) 공부한다.");
	}
	private void eat() {  //  부모도 private eat 아이도 private eat 개별적 eat 구문 
		System.out.println("학생이 먹는다.");
	}
	@Override
	public String sleep() {
		System.out.println("학생이 잔다");
		return null;                  ////////////////////////////////////
	}
	public int walk(int age) {
		System.out.println("나이가 "+ age + "살인 학생이 산책한다.");
		return 0;
	}
	@Override
	public void excecise() {
		System.out.println("학생이 운동한다");
	}
	@Override
	public void printParent() {
														// 부모의 생성자를 ㅎ
//		super() : 부모의 생성자를 호출 
//		super. : 부모의 변수를 호출 
		super.printParent();
		System.out.printf(", 학번%s\n", stNumber);
	}
	
	public static void staticMethod() {
		System.out.println("학생의 정적 메소드 ");
	}
}
