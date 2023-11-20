package ex17collection;

class Orange {
	int sugar;
	//생성자
	public Orange(int sugar) {
		this.sugar = sugar;
	}
	// 멤버메서드
	public void showInfo() {
		System.out.println("오렌지의 당도는 " + sugar + "입니다");

	}
}
// 오렌지 전용박스 Orange 객체만 저장가능 
class OrangeBox {
	Orange item;		//멤버변수
	
	public void store(Orange item) {
		this.item = item;
	}

	public Orange pullOut() {   //꺼내다 멤버메서드 
		return item;
	}
}

class FruitBox {
	Object item;

	public FruitBox(Object item) {
		this.item = item;
	}

	public void store(Object item) { //setter
		this.item = item;
	}

	public Object pullOut() { // getter
		return item;
	}
}

public class Ex01GenericBasic {
	public static void main(String[] args) {
		
//		자료형에는 안전하지만  구현에는 불편하다   오렌지박스에는 오렌지객체만 들어갈수있다.
		OrangeBox oBox1 = new OrangeBox();  // 오렌지 생성수 
		Orange orange1 = new Orange(10);	// 객체 저장
		oBox1.store(orange1);				// 오렌지니까 가능 
		orange1 = oBox1.pullOut();
		orange1.showInfo();					// 오렌지 당도는 10입니다.

//		oBox1.store("당도가 20인 오렌지");		// 들어갈수가없다.
		Orange orange2 = oBox1.pullOut();
		orange2.showInfo();

		FruitBox fBox1 = new FruitBox(new Orange(20));		// 오렌지 객체로 과일박스에 20이들어있는 오렌지를 
		Orange orange3 = (Orange) fBox1.pullOut();
		orange3.showInfo();
//		try catch 문을 넣어야한다 강제형변환이 안되기때문에 
		
//		FruitBox fBox2 = new FruitBox("당도가 30인 오렌지");		// String으로 과일박스에 넣었는데?  결구 오렌지로 강제형변환 할때 String 이 오렌지안 int 에 들어갈수없다. 런타임 오류발생 !
//		Orange orange4 = (Orange) fBox2.pullOut();			// 
//		orange4.showInfo();
	}
}
