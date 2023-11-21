package ex18lambda;

import java.util.function.Consumer;

public class Ex06Define3Consumer {

//	 interface Consumer<T>{
//	void accept(T t);}
//	
//	이게 전부 생략되있고 이것을 자동 오버라이딩해서 사용!
	
	// 가볍게 사용방법이다. 
	public static void main(String[] args) {
		Consumer<String> c1 = (String s) -> {
			System.out.println(s + "= 가수입니다.");
		};
		c1.accept("케이윌");
		
		Consumer<String> c2 = t -> {
			System.out.println(t + "= 과일입니다.");
		};
		c2.accept("Strawberry");
	}
}
