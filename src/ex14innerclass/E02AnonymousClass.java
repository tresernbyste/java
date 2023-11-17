package ex14innerclass;

class Singer {
	String name;
	
	//생성자 소기화 
	public Singer(String name) {
		this.name = name;
	}
	// toString object에 정의된 
	// 원래 클래스 선언 후에 extends 후에 오버라이딩을 해야하는데???
	// 그냥 class 안에서 익명클래스를 선언했다 치고 Override object에 정의된 내용을 재정의 할수 있는데 그걸 부모클래스 안에 바로 넣어버린다.
	@Override
	public String toString() {
		return "이름:" + name;
	}
}

class GirlGroup extends Singer {
	String team;

	public GirlGroup(String name, String team) {
		super(name);
		this.team = team;
	}
	
	//부모안에서 익명클래스래 오버라이딩한 클래스를 부모클래스를 상속받은 자식클래서 안에 다시 overriding을 한다.
	
	
	@Override
	public String toString() {
		return super.toString() + ", 팀명:" + team;
	}
}

interface ISinger {
	public void dancing();
}

public class E02AnonymousClass {

	public static void main(String[] args) {
		
		Singer	s1 = new Singer("조용필");
		System.out.println(s1);
		
		Singer s2 = new GirlGroup("츄", "이달의소녀");
		System.out.println(s2);
		
		
		Singer s3 = new Singer("아이린, 레드벨벳") {
			
			// 다시 
//			접은을 위해서는 다운캐스팅을 해야하지만 익명클래스는 클래스의 이름이 없기때문에 다운캐스팅도 불간으하다. 
//			따라서 익명클래스에서는 멤버의 확장은 거의 사용되지않는다.  멤버를 확장하면 이 익명클래스 안에 있는 멤버를 불러올수가 없기때문이다.
			
			@Override
			public String toString() {
				return super.toString()+ ", 소속사: SM";
			}
		};
			System.out.println(s3);
			
			ISinger s4 = new ISinger() {
				
				@Override
				public void dancing() {
						System.out.println("춤추는게 좋아요");
				}
			};	
			s4.dancing();
			}

}
