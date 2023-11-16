package ex12inheritance;

class AnimalDog extends Animal
{
//	확장한 멤버변수  ---강아지만의 멤버변수
	String dogkind;
	String name;
	
//	부모클래스의 species 멤버변수는 private 로 선언되어 자식에서는 접근이 불가능합니다.
//	이때는 public 으로 선언된 getter method 를 통해 접근해야 합니다.
	
	void bark() {
		System.out.printf("\n이름은 %s이고 종(포유류)이 %s인 강아지가 짖는다.\n", name,getSpecies() );
	}
	
//	여기서 사용된 super 는 부모클래스의 객체를 가리키는 의미로 부모클래스의 showAnimal()을 호출한다.
	void showDog() {
		super.showAnimal();
		System.out.println("dogkind=" + dogkind);
		System.out.println("dogname=" + name);
		
	}
//	생성자 메서드가 필요하다.
//	클래스에서는 반드시 부모클래스의 객체를 먼저 생성해야한다.
//	여기서 사용된 super()는 부모클래스의 성성자 매서드를 호출하는 용도로 사용된다.
	
	public AnimalDog(String species, int age, String gender, String dogkind, String name) {
		
		super(species, age, gender);
		//자신의 멤버변수를 초기화 한다.
		this.dogkind = dogkind;
		this.name = name;
		
		
	}
//	public AnimalDog(String dogkind, String name) {
//		super(species, name, gender );
//		this.dogkind = dogkind;
//		this.name = name;
		
	
}
