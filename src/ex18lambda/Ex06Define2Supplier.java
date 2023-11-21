package ex18lambda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class Ex06Define2Supplier {

	public static void main(String[] args) {
		
		// 람다식 정의
		Supplier<Integer> sup = () -> {
			Random random = new Random();
			return random.nextInt(45)+1;
		};
		
		int rNum = sup.get();
		System.out.println("생성된난수=" + rNum);
		
		List<Integer> list = makeRandomNum(sup,6);
		System.out.println(list);
		
		
		// 향상된for문으로 출력 
		System.out.println("향상된 for문으로 출력 #####");
		
		for(Integer i : list) {
			System.out.printf("%d ",i);
		}
		System.out.println();
		
		System.out.println("이터레이터로 출력하기"); //////////////////////////
		
		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
		
		
		
	}
	
	// 버블정렬 전 난수 생성 후 저장과 같음   존나 짧아짐...
	public static List<Integer> makeRandomNum(Supplier<Integer> s, int cnt){
		List<Integer> li = new ArrayList<Integer>();
		for(int i=1; i<=cnt; i++) {
			li.add(s.get());
		}
		return li;
	}
}
