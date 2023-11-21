package ex18lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Ex06Define4Function {
	
	
	
	// 개발자가 가장많이 사용하는 함수형 인터페이스 이다 
	
	//  -> 람다식
	//T는 매개변수 ㄸ는 반환타입 
	// interface Function<T,E> { E apply())};
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Function<String, Integer> func = (String s) ->{
			return s.length();
		};
		
		System.out.println("Lambda 문자열길이 = "+ func.apply("람다")); 
		
		Human p1 = new Human("케이윌", "남", 80);
		Human p2 = new Human("에일리", "여", 77);
		Human p3 = new Human("임재범", "남", 97);
		Human p4 = new Human("아이유", "여", 99);
		List<Human> list = Arrays.asList(p1, p2, p3, p4);
		
		Function<Human, Integer> getFunction = (Human h) ->{
			return h.getScore();
		};
		int score = getFunction.apply(p1);
		System.out.println("p1의 점수 = " + score);
		
		System.out.println("### list에 저장된 객체의 점수 출력");
		for(Human h : list) {
			System.out.println(h.getName()+ "의 점수 " + getFunction.apply(h));
		}
		
	}
}
