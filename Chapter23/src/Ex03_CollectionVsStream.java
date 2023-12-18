import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Ex03_CollectionVsStream {
	public static void main(String[] args) {
		
		int[] arr = {1,5,3,2,4};
		
		List<Integer> list = new ArrayList<Integer>();
		
//---------------------------------------------------------------		
		// 컬렉션 프레임워크를 이용한 방법
		for(int i : arr) {
			if(i%2 ==1 ) {
				list.add(i);
			}
		}
		
		Collections.sort(list);
		for(int i: list) {
			System.out.print(i + '\t');
		}
		System.out.println();
		
//---------------------------------------------------------------		
		
		// 스트림 사용의 이유  위의 코드를 아래 코드로 변환 가능
		Arrays.stream(arr)
				.filter(n -> n%2 ==1)
				.sorted()
				.forEach(n -> System.out.print(n + '\t'));
		
		System.out.println();
	}

}
