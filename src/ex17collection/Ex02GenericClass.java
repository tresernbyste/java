package ex17collection;
// 과일을 표현한 클래스 생성
class Apple {
	int weight;
	// 무게를 통해서 생성자 생성 
	public Apple(int w) {
		weight = w;
	}

	public void showInfo() {
		System.out.println("사과의 무게는" + weight + " 입니다.");
	}
}

class Banana {
	int sugar;

	public Banana(int s) {
		sugar = s;

	}

	public void showInfo() {
		System.out.println("바나나의 당도는" + sugar + " 입니다.");
	}
}

//class FruitBox{
//	Object item;
//	public FruitBox(Object item) {
//		this.item = item;
//	}
//	public void store(Object item) {
//		this.item = item;
//	}
//	public Object pullOut() {
//		return item;
//	}
//}

class GenericFruitBox<T> {
	T item;

	public void store(T item) {
		this.item = item;
	}

	public T pullOut() {
		return item;
	}
}

public class Ex02GenericClass {

	public static void main(String[] args) {
		GenericFruitBox<Apple> appleBox = new GenericFruitBox<Apple>();
		appleBox.store(new Apple(10));
		Apple apple = appleBox.pullOut();
				apple.showInfo();
		
		GenericFruitBox<Banana> bananaBox = new GenericFruitBox<Banana>();
		bananaBox.store(new Banana(20));
		Banana Banana = bananaBox.pullOut();
		Banana.showInfo();
		
//		GenericFruitBox<Orange> orangeBox = new GenericFruitBox<Orange>();
//		orangeBox.store("나는 오렌지");  // 인자값을 넣은 오렌지를 넣은것이 아닌 단순 스트링을 넣었기에 에러
//		orangeBox.store(apple);
//		orangeBox.store(banana);
//		
		
	}

}
