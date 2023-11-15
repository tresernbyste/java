// 기존의 정의도니 클래스에 메서드와 변수를 추가하여 새로운 클래스를 정의하는것을 말한다. 부모클래스를 자식클래스가 상속할때는 extends키워드를 사용한다.
// sub가 super를 받는다.

// 


package ex12inheritance;


// 사람의 일반적인 형태를 추상화한다.    classMan 을 일반적인 사람의 기본형태를 상속받는다. classBusinessMan은 extends to Mand  되었기에  기본형태를 가지고 있는상태로 추가정보를 기입한다.
class Man{
	
//	public Man(String name)    
//	{
//		super();
//		this.name = name;
//	}
	private String name;
	
	public Man() {  //  오버로딩을 위한 기본 생성자!!
		System.out.println("Man클래스 디폴트 생성자 호출됨");
	}
	public Man(String name) {
		this.name = name;
		System.out.println("Man 클래스 인자 생성자 호출됨");
	}
	public void tellYourName() {  // private STring name을  간접으로 사용하기 위해 들어감
		System.out.println("내이름은" + name + "입니다.");
	}
	
}
//  sub 클래스   man 안에 모든걸 사용할수 있다.

class BusinessMan extends Man{
	
	private String company;
	private String position;
	
	
	// 멤버변수는 2개지만 company와 position
	public BusinessMan(String name, String company, String position) {
		
		super(name);   // 매개 변수가 하나있는 생성자를 호출한것이다. // 부모호출이 생성자에 맨위에 있어야한다.!!##############
		this.company = company;
		this.position = position;
		System.out.println("BusinessMan 생성자 호출");
	}
	
	public void tellYourInfo() {
		System.out.println("회사명은"+ company + "입니다.");
		System.out.println("직급은"+ position + "입니다.");
//		System.out.println("이름은"+ name + "입니다.");
		tellYourName();	// 직접 name 자체를 가지고 올수는 없기때문에 간접호출을 하는것인데 return 값자제로 받아오던지   사용하던 동일한 syso print 구문으로 받아옴. 
		
	}
	
}

public class E01BusinessManMain
{

	public static void main(String[] args)
	{
		BusinessMan man1 = new BusinessMan("김천국", "NAVER", "팀장");
		BusinessMan man2 = new BusinessMan("이낙원", "DAUM", "부장");
		
		System.out.println();
		man1.tellYourInfo();
		System.out.println();
		man1.tellYourName();
		System.out.println();
		man2.tellYourInfo();
		System.out.println();
		man2.tellYourName();
	}
}
